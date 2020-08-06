package cn.bytts.result;

import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author LZT
 * @Date 2020/8/6
 * @Time 13:11
 * @Description ss
 */
public class Response implements Serializable {
    private static final String DEFAULT_SUCCESS_MESSAGE = "success";
    private static final String DEFAULT_ERROR_MESSAGE = "error";
    private static final long serialVersionUID = 1L;
    private int code;
    private String message;
    private Map<String,Object> data = new HashMap<String, Object>();



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }



    public static Response success(Object data) {
        Response result = new Response();
        result.setCode(HttpStatus.OK.value());
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.data.put("data",data);
        return result;
    }


}
