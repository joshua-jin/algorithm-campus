package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/23/16
 */
public class Singleton {

    private static class SingletonHolder {
        static Singleton instance = new Singleton();
    }


    public static Singleton getInstance() {
        // write your code here
        return SingletonHolder.instance;
    }
}
