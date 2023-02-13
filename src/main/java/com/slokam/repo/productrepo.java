package com.slokam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slokam.entity.product;

public interface productrepo extends JpaRepository<product, Integer>{

}
