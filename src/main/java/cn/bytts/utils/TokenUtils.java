package cn.bytts.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.util.DigestUtils;
import sun.misc.BASE64Encoder;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Author LZT
 * @Date 2020/9/6
 * @Time 15:18
 * @Description token生成和验证
 */
public class TokenUtils {

    /**
     * 设置过期时间
     */
    private static final long EXPIRE_DATE=30*60*100000;

    /**
     * token秘钥
     */
    private static final String TOKEN_SECRET = "ZCfasfhuaUUHufguGuwu2020BQWE";
    private static final String MESSAGE = "messge";
    public static String createToken()  {

        String s = System.nanoTime() + new Random().nextInt((999999-100000)+100000) +"";
        return DigestUtils.md5DigestAsHex(s.getBytes());
    }

    public static String createToken(String str)  {

        return DigestUtils.md5DigestAsHex(str.getBytes());
    }


    /**
     * 生成token
     * @param username
     * @param password
     * @return
     */
    public static String createToken (String username, String password){

        String token = "";
        try {
            //过期时间
            Date date = new Date(System.currentTimeMillis()+EXPIRE_DATE);
            //秘钥及加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            System.out.println(algorithm.getName());
            //设置头部信息
            Map<String,Object> header = new HashMap<>();
            header.put("typ","JWT");
            header.put("alg","HS256");
            //携带username，password信息，生成签名
            token = JWT.create()
                    .withHeader(header)
                    .withClaim("username",username)
                    .withClaim("password",password).withExpiresAt(date)
                    .sign(algorithm);
            System.out.println(token);
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
        return token;
    }


    /**
     * @desc   验证token，通过返回true
     * @params [token]需要校验的串
     **/
    public static boolean verify(String token){

        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return  false;
        }
    }
}
