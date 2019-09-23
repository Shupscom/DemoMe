package com.example.demome.service;

import com.example.demome.model.Post;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.Set;

@Service
public interface PostService {
    Post findByName(String name);

    Post save(Post post);

    Set<Post> findAll();

    Optional<Post> finfById(Long id);

    void delete(Long id);
}
