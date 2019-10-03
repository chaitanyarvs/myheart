package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.MyHeart;

@Repository
public interface MyHeartRepo extends JpaRepository<MyHeart, Long> {

}
