package com.ljq.ossupload.mapper;

import com.ljq.ossupload.model.MaterialFolder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2020-12-18
 */
public interface MaterialFolderMapper extends BaseMapper<MaterialFolder> {
    @Update("UPDATE  `material_folder` SET parent_id=#{tid} WHERE parent_id=#{id};")
    boolean updateparetnid(int tid,int id);
}
