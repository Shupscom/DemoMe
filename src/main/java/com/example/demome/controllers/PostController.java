package com.example.demome.controllers;

import com.example.demome.model.Post;
import com.example.demome.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("post",postService.findAll());
        return "index";
    }

    @RequestMapping( value = "/create",method = RequestMethod.GET)
    public String create(Model model){
        model.addAttribute("post", new Post());
        return "post/create";
    }

    @RequestMapping( value = "/newpost",method = RequestMethod.POST)
    public String save(Post post){
         postService.save(post);
        return "redirect:/index";
    }

}
