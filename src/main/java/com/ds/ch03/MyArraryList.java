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
        ensureCapacity(DEFAULT_CAPACITY);
    }
    public int size(){
        return theSize;
    }
    public boolean isEmpty(){
        return size()==0;
    }

    public void trimToSize()
    {
        ensureCapacity(size());
    }

    public T get(int idx)
    {
        if(idx < 0 || idx >= size())
            throw new ArrayIndexOutOfBoundsException();
        return theItems[idx];
    }

    public T set (int idx, T newVal)
    {
        if(idx < 0 || idx >= size())
            throw new ArrayIndexOutOfBoundsException();
        T old = theItems[idx];
        theItems[idx] = newVal;
        return old;
    }
    public void ensureCapacity(int newCapacity)
    {
        if(newCapacity < theSize)
            return;

        T [] old =theItems;
        theItems = (T[]) new Object[ newCapacity];
        for(int i = 0; i < size(); i++)
            theItems[i] = old[i];
    }
    public Iterator<T> iterator() {
        return null;
    }

}
