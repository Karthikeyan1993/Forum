package com.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.forum.bean.Post;

@Repository("forumRepository")
public interface ForumRepository extends JpaRepository<Post, Long> {

}
