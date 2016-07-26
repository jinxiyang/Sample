package com.yang.library.base;

/**
 * Created by yang on 16/7/3.
 */
public interface BaseView<T> {
    /**
     * 设置presenter
     * @param presenter
     */
    void setPresenter(T presenter);
}
