package com.forum.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.forum.bean.Comment;
import com.forum.bean.Post;
import com.forum.service.ForumService;

@RestController
@RequestMapping("api/posts")
public class ForumController {

	@Autowired
	private ForumService forumService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Post> allPosts() {
		return forumService.allPosts();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Post save(@RequestBody Post post) {
		Set<Comment> comments = post.getCommentGroups();
		Iterator<Comment> itr = comments.iterator();
		while (itr.hasNext()) {
			Comment c = itr.next();
			post.addComment(c);
		}
		return forumService.save(post);
	}

}
