package ru.romashov.blogapp.model.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;
import ru.romashov.blogapp.utils.JsonViews;

import java.util.List;

public class PostListDTO {
    @Getter
    @JsonView(JsonViews.IdName.class)
    private final long count;

    @Getter @Setter
    @JsonView(JsonViews.IdName.class)
    private List<?> posts;

    public PostListDTO(Page<?> posts) {
        this.posts = posts.getContent();
        this.count = posts.getTotalElements();
    }
}
