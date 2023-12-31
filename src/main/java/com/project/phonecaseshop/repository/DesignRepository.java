package com.project.phonecaseshop.repository;

import com.project.phonecaseshop.entity.Design;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesignRepository extends JpaRepository<Design, Integer> {
    List<Design> findByProductId_ProductId(int productId);
    void deleteByProductId_ProductId(int productId);
}
