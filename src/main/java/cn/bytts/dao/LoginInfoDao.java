package cn.bytts.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @Author LZT
 * @Date 2020/9/6
 * @Time 13:18
 * @Description 登录信息dao层接口
 */
public interface LoginInfoDao {

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
    int updateTokenByTag(@Param("token") String token,@Param("tag") Integer tag);
}
