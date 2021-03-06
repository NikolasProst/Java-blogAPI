package ru.romashov.blogapp.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import ru.romashov.blogapp.components.ValidModerationDecision;
import ru.romashov.blogapp.config.Config;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class ModerationDTO {
    @JsonProperty("post_id")
    @Min(value = 1, message = Config.STRING_WRONG_POST_ID)
    private int postId;

    @NotBlank
    @ValidModerationDecision
    private String decision;
}
