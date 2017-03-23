package me.yufan.gossip.mybatis.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import me.yufan.gossip.mybatis.entity.base.IdEntity;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Article extends IdEntity {
    private static final long serialVersionUID = 6986779319370876492L;

    private String name;

    private String uniqueKey;

    private String url;
}
