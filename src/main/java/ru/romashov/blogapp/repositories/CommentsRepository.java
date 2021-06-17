package ru.romashov.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.romashov.blogapp.model.Comment;
import ru.romashov.blogapp.model.Post;

import java.util.List;

@Repository
public interface CommentsRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findByPost(Post post);
}
