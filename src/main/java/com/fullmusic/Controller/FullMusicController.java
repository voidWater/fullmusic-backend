package com.fullmusic.Controller;

import com.fullmusic.common.ResponseResult;
import com.fullmusic.common.SysParam;
import com.fullmusic.dao.UserMapper;
import com.fullmusic.pojo.User;
import com.fullmusic.pojo.UserExample;
import com.fullmusic.service.FullMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2019/6/9 0009.
 */
@RestController
@RequestMapping("xcx")
public class FullMusicController {

    @Autowired
    private FullMusicService fullMusicService;

    ResponseResult ResponseResult = new ResponseResult();
    @Value("${sys.uploadPath}")
    String uploadPath;
    /**
     *测试
     * @return
     */
    @RequestMapping("test")
    public ResponseResult test(){
        return ResponseResult.createMsg(12,"234234324");
    }
    /**
     * 没有注册
     * @return
     */
    @RequestMapping("noLoginIn")
    public ResponseResult noLoginIn(){
        return ResponseResult.createMsg(SysParam.LoginIn.NO.getCode(),SysParam.LoginIn.NO.getMsg());
    }

    /**
     * 注册
     * @param userId
     * @param password
     * @param session
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping("loginIn")
    public ResponseResult loginIn(String userId, String password, HttpSession session, HttpServletRequest request, HttpServletResponse response) throws IOException {
        if(userId==null||password==null){
            return ResponseResult.createMsg(SysParam.LoginIn.ERROR.getCode(),SysParam.LoginIn.ERROR.getMsg());
        }
        if(password.equals("iLoveYouXYL")||password.equals("XYLloveMe")){
            User user = fullMusicService.userLoginIn(userId,password);
            if(user!=null){
                session.setAttribute("user",user);
                return ResponseResult.createMsg(SysParam.LoginIn.SUCCESS.getCode(),SysParam.LoginIn.SUCCESS.getMsg());
            }else {
                return ResponseResult.createMsg(SysParam.LoginIn.ERROR.getCode(),SysParam.LoginIn.ERROR.getMsg());
            }
        }
        return ResponseResult.createMsg(SysParam.LoginIn.ERROR.getCode(),SysParam.LoginIn.ERROR.getMsg());
    }
    /**
     *登录
     * @param userId
     * @param session
     * @return
     */
    @RequestMapping("login")
    public ResponseResult Login(String userId, HttpSession session){
        User user = fullMusicService.getUser(userId);
        if(user!=null){
            return ResponseResult.createMsg(SysParam.LoginStatus.YES.getCode(),SysParam.LoginStatus.YES.getMsg());
        }else{
            return ResponseResult.createMsg(SysParam.LoginStatus.NO.getCode(),SysParam.LoginStatus.NO.getMsg());
        }
    }

    /**
     * 文字打卡
     * @param session
     * @param content
     * @return
     */
    public ResponseResult ClockInByWord(HttpSession session,String content){
        User user = (User)session.getAttribute("user");
        if(fullMusicService.ClockInByWord(user.getId(),content)==1){
            return ResponseResult.createMsg(SysParam.Clockin.SUCCESS.getCode(),SysParam.Clockin.SUCCESS.getMsg());
        }else{
            return ResponseResult.createMsg(SysParam.Clockin.ERROR.getCode(),SysParam.Clockin.ERROR.getMsg());
        }
    }

    /**
     * 评论
     * @param session
     * @param clockInId
     * @param content
     * @return
     */
    @RequestMapping("comment")
    public ResponseResult comment(HttpSession session,String clockInId,String content){
        User user = (User)session.getAttribute("user");
        if(fullMusicService.addComment(user.getId(),clockInId,content)==1){
            return ResponseResult.createMsg(SysParam.Talk.SUCCESS.getCode(),SysParam.Talk.SUCCESS.getMsg());
        }else {
            return ResponseResult.createMsg(SysParam.Talk.ERROR.getCode(),SysParam.Talk.ERROR.getMsg());
        }
    }

    /**
     * 获取打卡列表
     * @param userId
     * @return
     */
    @RequestMapping("clockInList")
    public ResponseResult clockList(String userId,String currPage){
        return fullMusicService.getClockList(userId,currPage);
    }
    /**
     *打卡
     * @param userId
     * @param context
     * @param file
     * @return
     */
    @PostMapping("clock")
    public ResponseResult clockContext(String userId,String context,@RequestParam(value = "file", required = false) MultipartFile file){
        try {
            if (file.isEmpty()) {
                return ResponseResult.createMsg(-1,"文件为空");
            }
            // 获取文件名
            String fileName = file.getOriginalFilename();
            // 获取文件的后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            // 设置文件存储路径
            String filePath = "/Users/dalaoyang/Downloads/";
            String path = uploadPath + fileName;
            File dest = new File(path);
            // 检测是否存在目录
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();// 新建文件夹
            }
            file.transferTo(dest);// 文件写入
            return ResponseResult.createMsg(0,"上传成功");
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return ResponseResult.createMsg(-1,"上传失败");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseResult.createMsg(-1,"上传失败");
        }
    }
}
