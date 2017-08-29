package com.forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.forum.bean.Comment;
import com.forum.bean.Post;
import com.forum.repository.ForumRepository;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	@Autowired
	private ForumRepository forumRepository;

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Command Line Runner Invoked");
		Post p1 = new Post("Spring Boot Tutorial", "Karthik");
		Comment c1 = new Comment("Awesome");
		p1.addComment(c1);
		Comment c2 = new Comment("Good");
		p1.addComment(c2);
		forumRepository.save(p1);

	}

}
