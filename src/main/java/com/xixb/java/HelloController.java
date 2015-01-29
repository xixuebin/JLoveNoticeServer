package com.xixb.java;

import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.xixb.java.interceptor.AuthInterceptor;

/**
 * Created by xixuebin on 2015/1/19.
 *
 */
@Before(AuthInterceptor.class)
public class HelloController extends Controller{
    /**
     * this is the default method, access url is base_url/controllerKey
     */
    @ActionKey("/hello")
    public void index(){
        renderText("hello ,JFinal World.");
    }

    /**
     * access this method with the url is base_url/controllerKey/sayFinal
     */
    public void sayFinal(){
        renderText("hello, I am JFinal !!!");
    }


}
