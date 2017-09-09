package org.lanqiao.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.lanqiao.bean.RtnObj;
import org.lanqiao.bean.User;
import org.lanqiao.bean.UserList;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lizq on 2017/9/2.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;


    //自定义对象类型
    @RequestMapping("/reg.do")
    public String reg(User user){
        System.out.println(user);
        return "result";
    }

    //基本数据类型
    @RequestMapping("/baseType.do")
    @ResponseBody  //该注解指的是将内容或对象作为 HTTP 响应正文返回
    public String baseType(Integer id){
        return id+"";
    }


    //自定义混合对象
    @RequestMapping("/myFixObj.do")
    @ResponseBody
    public String myFixObj(RtnObj rtn){
        return rtn.toString();
    }

    //list绑定
    @RequestMapping("/myList.do")
    @ResponseBody
    public String myList(UserList userList){

        return userList.toString();
    }
    @RequestMapping("/cond.do")
    public  ModelAndView  getUserByCondition(User user){
        System.out.println(user);
        List<User> list=userService.getUserByCondition(user);
        System.out.println(list);
        Map map=new HashMap();
        map.put("userList",list);
        return new  ModelAndView("showStu",map);
    }

    @RequestMapping("/condition.do")
    public  ModelAndView  findUserByCondition(User user){
        System.out.println(user);
        List<User> list=userService.findUserByCondition(user);
        System.out.println(list);
        Map map=new HashMap();
        map.put("userList",list);
        return new  ModelAndView("showStu",map);
    }

    //获取全部用户
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public  List<User>  getAllUser(){
        List<User> list=userService.getAllUser();
        return list;
    }

    //根据id获取某一个用户
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable  Integer id){
        User user=userService.getUserById(id);
        return user;
    }

    //根据id删除某个用户
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public int delUserById(@PathVariable  Integer id){
        return userService.delUserById(id);
    }

    //添加一个用户
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public int adddUser(@RequestBody User user){
        return userService.addUser(user);
    }

    //更新用户
    @RequestMapping(value = "",method = RequestMethod.PUT)
    @ResponseBody
    public int updateUser(@RequestBody  User user){
        return userService.updateUserById(user);
    }
}
