package cn.bytts.service;

/**
 * @Author LZT
 * @Date 2020/9/9
 * @Time 16:42
 * @Description 登录信息服务层
 */
public interface LoginInfoService {

    /**
     * 通过tag获取token
     * @param tag
     * @return
     */
    String selectTokenByTag(Integer tag);

    /**
     * 通过tag更新token
     * @param token
     * @param tag
     * @return
     */
    int updateTokenByTag(String token, Integer tag);
}
