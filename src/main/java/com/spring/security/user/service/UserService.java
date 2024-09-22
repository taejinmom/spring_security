package com.spring.security.user.service;

import com.spring.security.user.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName    : com.spring.security.user.service
 * fileName       : UserService
 * author         : Administrator
 * date           : 2024-09-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-20        Administrator       최초 생성
 */

public interface UserService {

    public UserDTO findUserByUserId(String userId);

    public void saveUser(UserDTO user);
    public List<UserDTO> findUsers();




}
