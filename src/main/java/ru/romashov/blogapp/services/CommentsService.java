package ru.romashov.blogapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.romashov.blogapp.components.TelegramClient;
import ru.romashov.blogapp.config.Config;
import ru.romashov.blogapp.model.Comment;
import ru.romashov.blogapp.model.Post;
import ru.romashov.blogapp.model.User;
import ru.romashov.blogapp.repositories.CommentsRepository;
import ru.romashov.blogapp.utils.StringUtils;

@Service
public class CommentsService {
    @Autowired
    private CommentsRepository commentsRepository;

    @Autowired
    private TelegramClient telegramClient;

    public int addComment(User user, Comment parentComment, Post post, String text) {
        Comment newComment = new Comment();

        newComment.setParentComment(parentComment);
        newComment.setUser(user);
        newComment.setPost(post);
        newComment.setText(text);

        Comment savedComment = commentsRepository.save(newComment);

        telegramClient.sendMessage(String.format(Config.STRING_TELEGRAM_COMMENT_ADDED,
                StringUtils.escapeString(user.getName()),
                StringUtils.escapeString(user.getEmail()),
                StringUtils.escapeString(post.getTitle()), post.getId(),
                StringUtils.escapeString(savedComment.getText())
        ));

        return savedComment.getId();
    }
}
