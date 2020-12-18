package com.ljq.ossupload.vo;

import lombok.Data;

/**
 * @Author 10421
 * @create 2020/12/17 15:03
 */
@Data
public class FileUploadResult {
    // 文件唯一标识
    private String uid;
    // 文件名
    private String name;
    // 状态有：uploading done error removed
    private String status;
    // 服务端响应内容，如：'{"status": "success"}'
    private String response;
}
