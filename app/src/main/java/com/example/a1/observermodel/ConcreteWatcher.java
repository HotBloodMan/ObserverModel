package com.example.a1.observermodel;

/**
 * Created by 1 on 2017/6/30.
 */

public class ConcreteWatcher implements Watcher {
    @Override
    public void update(String str) {
        System.out.println("str= "+str);
    }
}
