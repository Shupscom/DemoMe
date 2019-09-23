package com.example.demome.service.impl;

import com.example.demome.model.Post;
import com.example.demome.repositories.PostRepository;
import com.example.demome.service.PostService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class PostServiceImpl implements PostService {
    
    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post findByName(String name) {
        return postRepository.findByName(name);
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Set<Post> findAll() {
        Set<Post> posts = new HashSet<>();
        postRepository.findAll().forEach(posts::add);
        return posts;
    }

    @Override
    public Optional<Post> finfById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public void delete(Long id) {

    }

}
