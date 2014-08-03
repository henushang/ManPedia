package com.manpedia.web.front.official.controller;

import com.manpedia.global.constants.SysConf;
import com.manpedia.web.base.controller.BaseController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @Description: 网站首页控制器
 * @Author: Jianguo Shang
 * @Createtime: 2014-07-09 23:23
 */
@Controller

public class IndexController extends BaseController{
    /**
     * @Description: 网站首页请求
     * @Author: Jianguo Shang
     * @Createtime: 2014-07-09 23:23
     */
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) {

        return "Web/index";
    }
}
