package com.ljq.ossupload.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.ljq.ossupload.model.Image;
import com.ljq.ossupload.model.MaterialFolder;
import com.ljq.ossupload.service.IImageService;
import com.ljq.ossupload.service.IMaterialFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/material-folder")
public class MaterialFolderController {
    @Autowired
    private IMaterialFolderService iMaterialFolderService;
    @Autowired
    private IImageService iImageService;
    @RequestMapping("/list/{id}")
    public List<MaterialFolder> countfolder(@PathVariable("id") int id){
        QueryWrapper<MaterialFolder> materialFolderQueryWrapper = new QueryWrapper<MaterialFolder>();
        materialFolderQueryWrapper.eq("parent_id",id);
        List list = iMaterialFolderService.listObjs(materialFolderQueryWrapper);
        return list;
    }

    @RequestMapping("/{id}/createfolder")
    public String createFolder(@RequestParam("name")String name,@RequestBody MaterialFolder m,@PathVariable("id") int id){
        boolean save=false;
        QueryWrapper<Image> imageQueryWrapper = new QueryWrapper<>();
        QueryWrapper<Image> imageQueryWrapper2 = new QueryWrapper<>();
        imageQueryWrapper2.eq("name",name);
        imageQueryWrapper.eq("folder_id",id);
        Image one = iImageService.getOne(imageQueryWrapper2);
        List list = iImageService.listObjs(imageQueryWrapper);
        if (list.isEmpty()&&one!=null){
            m.setGmtCreate(LocalDateTime.now());
            m.setGmtModified(LocalDateTime.now());
            save = iMaterialFolderService.save(m);
            if(save)
                return "新建成功";
            else
                return "新建失败";
        }else
            return "非叶子节点不能新建image";

    }
    @RequestMapping("/{id}/delete")
    public boolean deleteFolder(@PathVariable("id") int id){
        boolean b = iMaterialFolderService.removeById(id);
        return b;
    }
    @RequestMapping("/{id}/rename")
    public boolean deleteFolder(@RequestParam("name") String name,@PathVariable int id){
        UpdateWrapper<MaterialFolder> materialFolderUpdateWrapper = new UpdateWrapper<>();
        materialFolderUpdateWrapper.eq("id",id).set("name",name);
        boolean update = iMaterialFolderService.update(null, materialFolderUpdateWrapper);
        return update;
    }
    @RequestMapping("/{id}/update")
    public boolean updateFolder(@PathVariable int id,@RequestParam("Targetid") int tid){
        UpdateWrapper<MaterialFolder> materialFolderUpdateWrapper = new UpdateWrapper<>();
        materialFolderUpdateWrapper.eq("parent_id",id);
        MaterialFolder materialFolder = new MaterialFolder();
        materialFolder.setParentId(tid);
        boolean update = iMaterialFolderService.update(materialFolder, materialFolderUpdateWrapper);
        return update;
    }


}
