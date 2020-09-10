package cn.bytts.controller;

import cn.bytts.domain.UserInfo;
import cn.bytts.result.Result;
import cn.bytts.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author LZT
 * @Date 2020/8/15
 * @Time 9:15
 * @Description 用户信息controller
 */
@CrossOrigin
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;


    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Result selectUserInfo(@RequestParam("tag") Integer tag) {

        System.out.println(tag);

        UserInfo userInfo = userInfoService.selectUserInfoByTag(tag);

        System.out.println(userInfo);

        return userInfo == null ? Result.error(HttpStatus.BAD_REQUEST.value()) : Result.success(userInfo);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Result saveUserInfo(UserInfo userInfo, HttpServletResponse response) {

        System.out.println(userInfo);
        if (userInfoService.saveUserInfo(userInfo) == 1) {
            response.setStatus(HttpStatus.CREATED.value());
            return Result.success(HttpStatus.CREATED.value());
        }
        return Result.error(HttpStatus.BAD_REQUEST.value());
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public Result updateUserInfo(UserInfo userInfo) {
        System.out.println(userInfo);

        if (userInfoService.updateUser(userInfo) == 1){
            return Result.success(HttpStatus.OK.value());
        }
        return Result.success(HttpStatus.BAD_REQUEST.value());
    }
}
