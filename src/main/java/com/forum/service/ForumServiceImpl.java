package com.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.bean.Post;
import com.forum.repository.ForumRepository;

@Service("forumService")
public class ForumServiceImpl implements ForumService {

	@Autowired
	ForumRepository forumRepository;

	@Override
	public List<Post> allPosts() {
		// TODO Auto-generated method stub
		return forumRepository.findAll();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		
		return forumRepository.save(post);
	}
}
