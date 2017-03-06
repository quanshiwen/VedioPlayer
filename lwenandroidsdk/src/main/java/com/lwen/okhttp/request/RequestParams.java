package com.lwen.okhttp.request;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author  vision
 * @Describe 请求参数构建类
 */

public class RequestParams {

    public ConcurrentHashMap<String ,String> urlParams = new ConcurrentHashMap<String ,String>();
    public ConcurrentHashMap<String ,Object> fileParams = new ConcurrentHashMap<String ,Object>();

    /**
     * 构造一个新的空{ @code RequestParams }实例。
     */
    public RequestParams() {
        this((Map<String, String>) null);
    }

    /**
     *构造一个新的RequestParams实例添加一个包含键/值的字符串参数的Map集合。
     * @param source
     */
    public RequestParams(Map<String,String> source) {
        if (source != null) {
            for (Map.Entry<String,String> entry:source.entrySet()) {
                put(entry.getKey(),entry.getValue());
            }
        }

    }

    /**
     * 构造一个新的RequestParams实例,并实例化一个初始键/值字符串参数。
     * @param key
     * @param value
     */
    public RequestParams(final String key,final String value) {
       this(new HashMap<String, String>(){
           {
               put(key,value);
           }
       });
    }

    /**
     * 添加一个参数键值对进request中去
     * @param key
     * @param value
     */
    public void put(String key,String value){
        if (key != null && value != null) {
            urlParams.put(key,value);
        }
    }

    public void put(String key,Object value) throws FileNotFoundException{
        if (key != null) {
            fileParams.put(key,value);
        }
    }

    public boolean hasParams() {
        if (urlParams.size()>0 || fileParams.size()>0) {
            return true;
        }
        return false;
    }
}
