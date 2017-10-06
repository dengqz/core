package com.ds.ch03;


import java.util.Collection;
import java.util.Iterator;

/**
 * Created by carino on 2017/10/6.
 */
public class MyArraryList<T> implements Iterable<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private int theSize;
    private T [] theItems;

    public MyArraryList()
    {
        doClear();
    }

    public void clear(){
        doClear();
    }

    private void doClear(){
        theSize=0;
    }
    public Iterator<T> iterator() {
        return null;
    }

}
