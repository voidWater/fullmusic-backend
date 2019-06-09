package com.fullmusic.common;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Map;

/**
 * Created by voidshell on 2019/6/9 0009.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseResult<T> {
    private Integer code;
    private String msg;

    private Integer size;
    private List<T> list;

    private Map<String,Object> data;

    public  ResponseResult createMsg(Integer code,String msg){
        return new ResponseResult(code,msg,null,null,null);
    }
    public  ResponseResult createList(Integer code,String msg,Integer size,List<T> list){
        return new ResponseResult(code,msg,size,list,null);
    }
    public ResponseResult createData(Integer code,String msg,Integer size,Map<String,Object> data){
        return new ResponseResult(code,msg,size,null,data);
    }
    public ResponseResult createData(Integer code,String msg,Integer size,List<T> list,Map<String,Object> data){
        return new ResponseResult(code,msg,size,list,data);
    }
    public ResponseResult() {
    }
    public ResponseResult(Integer code, String msg, Integer size, List<T> list, Map<String, Object> data) {
        this.code = code;
        this.msg = msg;
        this.size = size;
        this.list = list;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
