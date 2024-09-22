package com.spring.security.user.service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.spring.security.user.entity.User;
import com.spring.security.user.repository.JpaUserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * packageName    : com.spring.security.user.service
 * fileName       : JpaUserService
 * author         : Administrator
 * date           : 2024-09-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-21        Administrator       최초 생성
 */

@Service
@RequiredArgsConstructor
public class JpaUserService  {
    private final JpaUserRepository jpaUserRepository;
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public User save(User user) {
        return jpaUserRepository.save(user);
    }

    public Optional<User> findUser(String userId) {
        return jpaUserRepository.findById(userId);
    }
//    public Optional<User> findById(String userId) {
//        return Optional.empty();
//    }
//
//    public List<User> findUsers() {
//        return null;
//    }
}
