package com.codido.hodor.index.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);


    /**
     * 测试beetl模板
     *
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        logger.info("index request");
        modelAndView.addObject("email", "apk2sf@163.com");
        modelAndView.setViewName("/views/login.html");
        return modelAndView;
    }

}
