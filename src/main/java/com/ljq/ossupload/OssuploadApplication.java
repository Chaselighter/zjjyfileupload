package com.ljq.ossupload;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ljq.ossupload.mapper")
public class OssuploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssuploadApplication.class, args);
    }

}
