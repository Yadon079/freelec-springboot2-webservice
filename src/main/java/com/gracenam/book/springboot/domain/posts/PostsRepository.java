package com.gracenam.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC") // SpringDateJpa에서 제공하지 않는 메소드는 쿼리로 작성해도 된다
    List<Posts> findAllDesc();
}
