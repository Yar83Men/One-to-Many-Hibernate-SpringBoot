package com.jpa_one_many.india_jpa_one_many.entity.repository;

import com.jpa_one_many.india_jpa_one_many.entity.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
