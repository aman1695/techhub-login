package com.techhub.login.repositories;

import com.techhub.login.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    Post getPostsById(int userId);
}
