package com.ljq.ossupload.service.impl;

import com.ljq.ossupload.model.Image;
import com.ljq.ossupload.mapper.ImageMapper;
import com.ljq.ossupload.service.IImageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-12-17
 */
@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image> implements IImageService {

}
