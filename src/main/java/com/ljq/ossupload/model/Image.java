package com.ljq.ossupload.model;

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
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Image extends Model {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer parentId;

    private String url;

    private String title;

    private String intro;

    private Integer status;

    private String reviewer;

    private Integer size;

    private Integer width;

    private Integer height;

    private Integer userId;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    private Integer isDeleted;

    private Integer folderId;


}
