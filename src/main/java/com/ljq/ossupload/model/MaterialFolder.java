package com.ljq.ossupload.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2020-12-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MaterialFolder extends Model {

    private static final long serialVersionUID = 1L;
    @TableId
    private Integer id;

    private String name;

    private String contentType;

    private Integer parentId;

    private Integer userId;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    private Integer idDeleted;


}
