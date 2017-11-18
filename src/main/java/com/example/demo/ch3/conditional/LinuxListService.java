package com.example.demo.ch3.conditional;

/**
 * @author koou
 * @version 1.0
 * @since 2017-11-17 下午 23:00
 */
public class LinuxListService implements ListService {

    @Override
    public String showListCmd() {
        return "ls";
    }
}
