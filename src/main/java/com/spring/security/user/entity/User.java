package com.spring.security.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName    : com.spring.security.user.entity
 * fileName       : User
 * author         : Administrator
 * date           : 2024-09-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-20        Administrator       최초 생성
 */
@Entity
@Table(name="T_USER", schema = "security1")
public class User {
    @Id
    @Column(name = "USERID")
    private String userId;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    // 기본 생성자 추가
    public User() {
    }
    public User(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }
}
