package com.spring.security.user.dto;

import com.spring.security.user.entity.User;
import lombok.*;

/**
 * packageName    : com.spring.security.user.dto
 * fileName       : UserDTO
 * author         : Administrator
 * date           : 2024-09-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-20        Administrator       최초 생성
 */
@Getter
@Setter
@ToString
public class UserDTO {

    private String userId;
    private String username;
    private String password;
    private User user;

    public UserDTO(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }
    public void setEntity() {
        this.user = new User(this.userId,this.username,this.password);
    }

}
