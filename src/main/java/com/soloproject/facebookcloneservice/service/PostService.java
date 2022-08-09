package com.soloproject.facebookcloneservice.service;

import java.util.List;

import com.soloproject.facebookcloneservice.model.Post;
// import org.springframework.web.multipart.MultipartFile;

public interface PostService {

    Post addPost(Post post) throws Exception;

    List<Post> getPost();
    
}
