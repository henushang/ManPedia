package com.manpedia.web.admin.controller;

import com.manpedia.global.constants.URLConst;
import com.manpedia.web.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 后台管理首页控制器
 * @Author: Jianguo Shang
 * @Createtime: 2014-07-13 16:04
 */
@Controller
@RequestMapping(value = URLConst.baseAdminPath)
public class AdminIndex extends BaseController{

    @RequestMapping(value = {"/","index"})
    public String adminIndex(HttpServletRequest request, HttpServletResponse response){

        return "Admin/adminindex";
    }
}
