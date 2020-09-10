package cn.bytts.service.impl;

import cn.bytts.dao.LoginInfoDao;
import cn.bytts.service.LoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author LZT
 * @Date 2020/9/9
 * @Time 16:43
 * @Description 登录信息服务层接口实现类
 */
@Service
public class LoginInfoServiceImpl implements LoginInfoService {

    @Autowired
    LoginInfoDao loginInfoDao;

    @Override
    public String selectTokenByTag(Integer tag) {

        return loginInfoDao.selectTokenByTag(tag);
    }

    @Override
    public int updateTokenByTag(String token, Integer tag) {
        return loginInfoDao.updateTokenByTag(token,tag);
    }
}
