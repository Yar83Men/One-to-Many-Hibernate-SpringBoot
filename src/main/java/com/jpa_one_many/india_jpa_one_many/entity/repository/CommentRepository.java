package com.jpa_one_many.india_jpa_one_many.entity.repository;

import com.jpa_one_many.india_jpa_one_many.entity.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    
}
