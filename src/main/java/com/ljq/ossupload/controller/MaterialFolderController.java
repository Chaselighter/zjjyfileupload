package com.ljq.ossupload.controller;


import com.ljq.ossupload.model.MaterialFolder;
import com.ljq.ossupload.service.IMaterialFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping("/count")
    public int countfolder(){
        int count = iMaterialFolderService.count();
        return count;
    }
    @RequestMapping("/id")
    @ResponseBody
    public MaterialFolder getbyId(@RequestParam("id") int id){
        MaterialFolder byId = iMaterialFolderService.getById(id);
        return byId;
    }
    @RequestMapping("/createfolder")
    @ResponseBody
    public boolean createFolder(@RequestBody MaterialFolder m){
        boolean save = iMaterialFolderService.save(m);
        return save;
    }


}
