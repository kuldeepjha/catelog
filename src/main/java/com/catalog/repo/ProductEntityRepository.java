package com.catalog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalog.entity.ProductEntity;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
@Repository
public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer> {

}