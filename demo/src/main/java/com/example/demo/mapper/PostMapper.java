package com.example.demo.mapper;

import com.example.demo.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostMapper {
    @Select("SELECT id, title, content FROM post")
    List<Post> listAll();
}