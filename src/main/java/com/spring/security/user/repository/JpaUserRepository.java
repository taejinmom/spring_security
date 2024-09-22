package com.spring.security.user.repository;

import com.spring.security.user.dto.UserDTO;
import com.spring.security.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * packageName    : com.spring.security.user.repository
 * fileName       : JpaUserRepository
 * author         : Administrator
 * date           : 2024-09-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-21        Administrator       최초 생성
 */

@Repository
public interface JpaUserRepository extends JpaRepository<User, String> {

    //    Optional<User> findById(String userId);

}
