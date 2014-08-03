package com.manpedia.global.constants;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @Description: 项目页面相关的常量类
 * @Author: Jianguo Shang
 * @Createtime: 2014-07-11 23:20
 */
@Component
public class WebConf {
    public static  String base;
    public static  String basecss;
    public static  String baseimg;
    public static  String basejs;
    public static  String basefile;
    public static  String webimg;
    public static  String userimg;

    @Value("#{web}")
    public void setWebConf(Properties web){
        base = web.getProperty("base");
        basecss = web.getProperty("basecss");
        baseimg = web.getProperty("baseimg");
        basejs = web.getProperty("basejs");
        basefile = web.getProperty("basefile");
        webimg = web.getProperty("webimg");
        userimg = web.getProperty("userimg");
    }
}
