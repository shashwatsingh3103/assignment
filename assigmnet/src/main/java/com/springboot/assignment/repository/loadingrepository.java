package com.springboot.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.assignment.model.Loading;

public interface loadingrepository  extends JpaRepository<Loading, Long>{

	
    @Query(value = "SELECT * FROM Loading WHERE shipper_id = :shipperId", nativeQuery = true)
    List<Loading> findByShipperId(@Param("shipperId") String shipperId);
}
