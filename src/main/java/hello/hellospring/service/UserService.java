package hello.hellospring.service;

import hello.hellospring.dto.SignUpRequest;
import hello.hellospring.dto.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public UserResponse signUp(SignUpRequest request) {
        return null;
    }

    public List<UserResponse> findAll() {
        return null;
    }
}
