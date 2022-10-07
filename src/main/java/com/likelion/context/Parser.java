package com.likelion.context;

public interface Parser<T> {
    T parse(String str);
}
