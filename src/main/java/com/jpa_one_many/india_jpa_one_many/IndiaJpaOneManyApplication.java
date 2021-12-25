package com.jpa_one_many.india_jpa_one_many;

/* import com.jpa_one_many.india_jpa_one_many.entity.Comment;
import com.jpa_one_many.india_jpa_one_many.entity.Post;
import com.jpa_one_many.india_jpa_one_many.entity.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner; */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/* public class IndiaJpaOneManyApplication implements CommandLineRunner{ */
	public class IndiaJpaOneManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndiaJpaOneManyApplication.class, args);
	}

/* 	@Autowired
	private PostRepository postRepository; */

	/* @Override
	public void run(String... args) throws Exception {
		
		Post post = new Post("One to many Hibernate", "Description : One to many Hibernate");

		Comment comment1 = new Comment("Very useful"); 
		Comment comment2 = new Comment("Informative"); 
		Comment comment3 = new Comment("Very useful"); 
		
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);

		this.postRepository.save(post);
		
	} */

}
