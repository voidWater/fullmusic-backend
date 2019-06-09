package com.fullmusic.Controller;

import com.fullmusic.common.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2019/6/9 0009.
 */
@RestController
@RequestMapping("xcx")
public class FullMusicController {

    ResponseResult ResponseResult = new ResponseResult();
    /**
     * 测试
     * @return
     */
    @RequestMapping("test")
    public ResponseResult test(){
        return ResponseResult.createMsg(0,"success");
    }

    /**
     * 打卡列表
     * @param userId
     * @return
     */
    @RequestMapping("clockList")
    public ResponseResult clockList(String userId){
        return null;
    }

    @RequestMapping("clock")
    public ResponseResult clockContext(String userId,String context,@RequestParam(value = "file", required = false) MultipartFile multipartFile){
        return null;
    }
}
