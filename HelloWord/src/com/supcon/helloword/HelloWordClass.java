package com.supcon.helloword;


import java.util.ArrayList;

public class HelloWordClass {
    public String myname;
    public String age;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String myname = "zhangxiaoqiang";
        System.out.println("My myname is:" + myname);
        myname = "lilanzhen";
        ArrayList mynamelist_list = new ArrayList();
        String toString = mynamelist_list.toString();
        ArrayList<String> strings = new ArrayList<String>();
        System.out.println(strings);
        if (myname != null) {

        }

    }

    public String getmyname() {
        return myname;

    }


}
