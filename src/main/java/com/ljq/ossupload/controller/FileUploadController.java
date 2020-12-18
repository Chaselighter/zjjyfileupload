package com.ljq.ossupload.controller;


import com.ljq.ossupload.service.FileUploadService;
import com.ljq.ossupload.vo.FileUploadResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
    @Autowired
    private FileUploadService fileUploadService;
    @RequestMapping("file/upload")
    @ResponseBody
    public FileUploadResult upload(@RequestParam("file") MultipartFile uploadFile){
        return this.fileUploadService.upload(uploadFile);
    }




}
