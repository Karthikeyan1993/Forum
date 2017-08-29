package com.forum.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "POST_ID")
	private Long id;
	@Column(name = "POST_TITLE")
	private String name;
	@Column(name = "POST_USER")
	private String user;
	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Comment> CommentGroups = new HashSet<Comment>();

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(String name, String user) {
		super();
		this.name = name;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Set<Comment> getCommentGroups() {
		return CommentGroups;
	}

	public void setCommentGroups(Set<Comment> commentGroups) {
		CommentGroups = commentGroups;
	}

	public void addComment(Comment comment) {
		comment.setPost(this);
		CommentGroups.add(comment);
	}

}
