package cn.bytts.controller;

import cn.bytts.domain.User;
import cn.bytts.result.Result;
import cn.bytts.service.LoginInfoService;
import cn.bytts.service.UserService;
import cn.bytts.utils.CookiesUtils;
import cn.bytts.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author LZT
 * @Date 2020/9/5
 * @Time 16:22
 * @Description 自动登录controller
 */
@Controller
public class AutoLoginController {

    @Autowired
    UserService userService;
    @Autowired
    LoginInfoService loginInfoService;

    @ResponseBody
    @RequestMapping(value = "/autoLogin", method = RequestMethod.POST)
    public Result autoLogin(@CookieValue(value = "token", defaultValue = "0") String cookie,@RequestParam(value = "tag")Integer tag){
        System.out.println(cookie);
        System.out.println(tag);
        if (loginInfoService.selectTokenByTag(tag).equals(cookie)) {
            return Result.success(HttpStatus.OK.value());
        }
        System.out.println(cookie);
        return Result.error(HttpStatus.BAD_REQUEST.value());
    }


    @ResponseBody
    @RequestMapping("/login")
    public Result login(@RequestParam(value = "email")String email, HttpServletResponse response){
        User user = userService.selectUserByEmail(email);
        if (user != null) {
            String token = TokenUtils.createToken();
            CookiesUtils.setCookie(response,"token", token,60*2,true);
            CookiesUtils.setCookie(response,"tag", user.getTag().toString(),60*2,false);
            loginInfoService.updateTokenByTag(token,user.getTag());
            return Result.success(user);
        }


        return Result.error(HttpStatus.BAD_REQUEST.value());
    }
}
