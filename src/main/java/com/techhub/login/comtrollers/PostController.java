package com.techhub.login.comtrollers;

import com.techhub.login.models.Post;
import com.techhub.login.repositories.PostRepository;
import com.techhub.login.repositories.PostRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostRepository repository;


    @GetMapping("/post/{id}")
    public Post getPosts(@PathVariable Integer id) {
        return repository.getPostsById(id);
    }


}
