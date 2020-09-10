package cn.bytts.controller;

import cn.bytts.domain.User;
import cn.bytts.result.Result;
import cn.bytts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author LZT
 * @Date 2020/7/23
 * @Time 15:48
 * @Description 用户controller
 */
@CrossOrigin
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

        return user == null ? Result.error(HttpStatus.BAD_REQUEST.value()):Result.success(user);
    }


    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Result saveUser(User user ){

        System.out.println("...");

        System.out.println(user);

        if (user.getEmail().isEmpty() || user.getPassword().isEmpty()) {

            return Result.error(HttpStatus.BAD_REQUEST.value());
        }

        userService.insertUser(user);

        return Result.success(HttpStatus.CREATED.value());
    }

    @ResponseBody
    @RequestMapping(value = "/{tag}",method = RequestMethod.DELETE)
    public Result deleteUser(@PathVariable("tag") Integer tag, HttpServletResponse response){

        System.out.println(tag);
        if (userService.deleteUserByTag(tag) == 1) {
            response.setStatus(204);
            return Result.success(HttpStatus.NO_CONTENT.value());
        }
       return Result.error(HttpStatus.BAD_REQUEST.value());
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public Result updateUser(User user){
        System.out.println("...");
        System.out.println(user);
        if (userService.updateUser(user) != 0){
            userService.updateUser(user);
            return Result.success(user);
        }

        return Result.error(HttpStatus.BAD_REQUEST.value());
    }




}
