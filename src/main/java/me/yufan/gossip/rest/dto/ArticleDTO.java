package me.yufan.gossip.rest.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import me.yufan.gossip.rest.support.Pagination;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
@Accessors(chain = true)
public class ArticleDTO extends Pagination {
    private static final long serialVersionUID = 657199462340722189L;

    @Null(message = "Using key as the article's identity")
    private Long id;

    @NotNull(message = "Need article identity")
    private String key;

    @NotNull(message = "Empty article name")
    private String name;

    // TODO support custom config in db for url validate
    // TODO trim the query string
    @URL(regexp = "^http[s]?://.*", message = "Illegal article link")
    private String url;
}