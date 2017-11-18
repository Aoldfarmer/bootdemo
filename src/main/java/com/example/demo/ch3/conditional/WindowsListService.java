package com.example.demo.ch3.conditional;

/**
 * @author koou
 * @version 1.0
 * @since 2017-11-17 下午 22:59
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }
}
