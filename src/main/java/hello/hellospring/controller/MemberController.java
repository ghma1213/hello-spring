package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.dto.MemberRequestDto;
import hello.hellospring.service.MemberService;
import hello.hellospring.session.SessionConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberRequestDto form) {
        Member member = new Member();
        member.setUserId(form.getUserId());
        member.setPassword(form.getPassword());
        member.setName(form.getName());

        memberService.join(member);
        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }

    @GetMapping("/members/login")
    public String loginForm() { return "members/loginForm"; }

    @PostMapping("/members/login")
    public String login(MemberRequestDto form, HttpServletRequest request) {
        Optional<Member> loginMember = memberService.findMember(form.getUserId(), form.getPassword());
        if (loginMember.isEmpty()) {
            throw new IllegalStateException("회원정보가 없습니다.");
        }
        HttpSession session = request.getSession();
        session.setAttribute(SessionConst.LOGIN_MEMBER, loginMember);
        return "redirect:/";
    }

}
