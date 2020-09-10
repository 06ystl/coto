package cn.bytts.controller;

import cn.bytts.result.Result;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author LZT
 * @Date 2020/8/17
 * @Time 14:42
 * @Description 上传controller
 */
@Controller
public class UploadController {


    @ResponseBody
    @RequestMapping(value = "/upload", headers = "Content-Type= multipart/form-data", method = RequestMethod.POST)
    public Result upload(@RequestParam(value = "headImg")MultipartFile file) {

        String path = System.getProperty("rootPath")+"files/images";
        File files = new File(path);
        if (!files.exists()) {
            files.mkdirs();
        }

        String filename = file.getOriginalFilename();
        if (filename != null) {
            filename = System.nanoTime() + "." + FilenameUtils.getExtension(filename);
        }
        System.out.println(filename);
        try {
            file.transferTo(new File(files,filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Result.success(filename);
    }
}
