package cn.bytts.controller;

import cn.bytts.domain.User;
import cn.bytts.result.Result;
import cn.bytts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author LZT
 * @Date 2020/7/23
 * @Time 15:48
 * @Description 用户controller
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;



    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Result selectUser(@RequestParam(value = "email")String email){

        System.out.println(email);

        User user = userService.selectUserByEmail(email);

        return Result.success(user);
    }


    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Result saveUser(User user , HttpServletResponse response){
        System.out.println("...");
        System.out.println(user);
        response.setStatus(201);
        return Result.success(201);
    }

    @ResponseBody
    @RequestMapping(value = "/{tag}",method = RequestMethod.DELETE)
    public Result deleteUser(@PathVariable("tag") Integer id, HttpServletResponse response){
        response.setStatus(204);
        System.out.println(id);
        return Result.success(HttpStatus.NO_CONTENT.value());
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public Result updateUser(User user){
        System.out.println("...");
        System.out.println(user);
        return Result.success(user);
    }

}
