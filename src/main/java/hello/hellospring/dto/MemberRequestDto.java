package hello.hellospring.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

public class MemberRequestDto {
    private String userId;
    private String password;
    private String name;

    @NotEmpty
    public String getUserId() {
        return userId;
    }

    @NotEmpty
    public String getPassword() {
        return password;
    }

    @NotEmpty
    public String getName() {
        return name;
    }
}
