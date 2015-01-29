package com.xixb.java;

import com.jfinal.core.Controller;

/**
 * Created by xixuebin on 2015/1/29.
 *
 */
public class RootController extends Controller{

    public void index(){
        redirect("index.html");
    }

}
