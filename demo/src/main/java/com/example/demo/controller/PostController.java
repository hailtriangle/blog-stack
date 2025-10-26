package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
@CrossOrigin
public class PostController {

    @Autowired
    private PostMapper postMapper;

    @GetMapping("/list")
    public List<Post> list() {
        return postMapper.listAll();   // 断点
    }
}