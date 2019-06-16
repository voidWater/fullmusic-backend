package com.fullmusic.common;

/**
 * Created by Administrator on 2019/6/9 0009.
 */
public interface SysParam {
    /**
     * 注册
     */
    public enum LoginIn {
        NO(-11,"没有注册"), YES(11,"已注册"),ERROR(22,"密码或用户名错误"),SUCCESS(33,"注册成功");
        LoginIn(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
        private int code;
        private String msg;
        public int getCode() {
            return code;
        }
        public void setCode(int code) {
            this.code = code;
        }
        public String getMsg() {
            return msg;
        }
        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
    /**
     * 登录状态
     */
    public enum LoginStatus {
        NO(-22,"登录失败"), YES(22,"登录成功");
        LoginStatus(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
        private int code;
        private String msg;
        public int getCode() {
            return code;
        }
        public void setCode(int code) {
            this.code = code;
        }
        public String getMsg() {
            return msg;
        }
        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    /**
     * 打卡
     */
    public enum Clockin {
        TYPE_AUDIO(20,"音频"),TYPE_WORD(30,"文字"),TYPE_VIDEO(40,"视频"),ERROR(-11,"打卡失败"), SUCCESS(11,"打卡成功");
        Clockin(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
        private int code;
        private String msg;
        public int getCode() {
            return code;
        }
        public void setCode(int code) {
            this.code = code;
        }
        public String getMsg() {
            return msg;
        }
        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    /**
     * 评论
     */
    public enum Talk {
        TYPE_WORD(41,"文字"), TYPE_AUDIO(42,"音频"),ERROR(-41,"评论出现错误"),SUCCESS(43,"评论成功");
        Talk(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
        private int code;
        private String msg;
        public int getCode() {
            return code;
        }
        public void setCode(int code) {
            this.code = code;
        }
        public String getMsg() {
            return msg;
        }
        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    /**
     * 用户
     */
    public enum User {
        TYPE_TEACHER(1,"老师"), TYPE_STUDENT(2,"学生");
        User(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
        private int code;
        private String msg;
        public int getCode() {
            return code;
        }
        public void setCode(int code) {
            this.code = code;
        }
        public String getMsg() {
            return msg;
        }
        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
