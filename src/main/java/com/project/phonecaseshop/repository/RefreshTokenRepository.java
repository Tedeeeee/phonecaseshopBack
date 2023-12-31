package com.project.phonecaseshop.repository;

import com.project.phonecaseshop.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Integer> {

    Optional<RefreshToken> findByMemberId(int memberId);
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
