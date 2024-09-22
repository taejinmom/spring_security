package com.spring.security.user.repository;

import com.spring.security.user.dto.UserDTO;
import com.spring.security.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * packageName    : com.spring.security.user.repository
 * fileName       : UserRepository
 * author         : Administrator
 * date           : 2024-09-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-20        Administrator       최초 생성
 */
@Repository
public interface UserRepository {
    void save(UserDTO user) ;
    UserDTO findById(String userId);
    List<UserDTO> findUsers();
}
