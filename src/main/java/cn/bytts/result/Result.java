package cn.bytts.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

import java.io.Serializable;


/**
 * @Author LZT
 * @Date 2020/7/28
 * @Time 15:50
 * @Description 统一返回参数
 */
public class Result implements Serializable {

    private static final String DEFAULT_SUCCESS_MESSAGE = "success";
    private static final String DEFAULT_ERROR_MESSAGE = "error";
    private static final long serialVersionUID = 1L;

    private int code;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;



    private Result() {
    }


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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result success() {
        Result result = new Result();
        result.setCode(HttpStatus.OK.value());
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return result;
    }

    public static Result success(int code) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(HttpStatus.OK.value());
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    public static Result error(int code) {
        Result result = new Result();
        result.setCode(code);
        return result;
    }

    public static Result error(int code, String message ) {
        Result result = new Result();
        result.setCode(HttpStatus.BAD_REQUEST.value());
        if ("".equals(message) || message.length() < 1) {
            message = DEFAULT_ERROR_MESSAGE;
        }
        result.setMessage(message);
        return result;
    }

}
