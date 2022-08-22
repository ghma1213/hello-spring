package hello.hellospring.dto;

import lombok.ToString;

import javax.validation.constraints.NotEmpty;

public class MemberRequestDto {
    private String userId;
    private String password;
    private String name;

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }
}
