package com.lwj.PaintNail.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author Administrator
 * @title: UploadFileConfig
 * @description: TODO
 * @date 2020-11-1116:39
 */
@Configuration
public class UploadFileConfig extends WebMvcConfigurationSupport {
    @Value("${upload-path}")
    private  String path;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        /**
         * 配置资源映射
         * 意思是：如果访问的资源路径是以“/images/”开头的，
         * 就给我映射到path这个文件夹内，去找你要的资源
         **/
        registry.addResourceHandler("/images/**").
                addResourceLocations("file:"+path);
        System.out.print("上传配置类path="+path+"\n");
        super.addResourceHandlers(registry);

    }

}