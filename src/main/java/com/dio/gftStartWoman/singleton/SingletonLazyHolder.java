package com.dio.gftStartWoman.singleton;

public class SingletonLazyHolder {

    private static class IntaceHolder {
        public static SingletonLazyHolder instacia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstacia() {
        return IntaceHolder.instacia;

    }
}
