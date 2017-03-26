package me.yufan.gossip.mybatis.entity.base;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public abstract class GeneralEntity extends IdEntity {
    private static final long serialVersionUID = 7896864693045705673L;

    private Date createTime;
}
