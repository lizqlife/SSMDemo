package org.lanqiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lizq on 2017/9/1.
 */
@Controller     //告诉spring，这个类是一个controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/hello.do")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/test.do")
    public String test(){
        //进行了一些业务处理....
        return "redirect:/test/hello.do";
    }

    @RequestMapping("/forTest.do")
    public String forwardTest01(){
        System.out.println("进行了业务处理....");
        return "forward:/hello.jsp";
    }

    @RequestMapping("/forwardTest.do")
    public ModelAndView forwardTest02(){
        Map map=new HashMap();
        map.put("name","lizq");
        System.out.println("进行了业务处理....");
        return new ModelAndView("forward:/hello.jsp",map);
    }

}
