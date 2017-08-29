package com.forum.service;

import java.util.List;

import com.forum.bean.Post;

public interface ForumService {

	public List<Post> allPosts();

	public Post save(Post post);

}
