package com.forum.bean;

import javax.persistence.*;

@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CMT_ID")
	private Long id;
	
	@Column(name = "CMT_POST_COMMENT")
	private String post_comment;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "post_id")
	private Post post;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(String post_comment) {
		super();
		this.post_comment = post_comment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPost_comment() {
		return post_comment;
	}

	public void setPost_comment(String post_comment) {
		this.post_comment = post_comment;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
