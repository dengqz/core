package com.ds.ch03;

import java.util.Iterator;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: dengqz<br>
 * 开发时间: 2017/10/9<br>
 * <br>
 */
public class Test {
    public static void main(String[] args) {
        MyArraryList myArraryList = new MyArraryList<String>();
        System.out.println("hello");
        System.out.println(myArraryList.size());
        myArraryList.add("ni");
        myArraryList.add("mei");
        myArraryList.add("de");
        System.out.println(myArraryList.size());
        myArraryList.trimToSize();
        System.out.println(myArraryList.size());
        Iterator iterator = myArraryList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(myArraryList.size());
    }

}
