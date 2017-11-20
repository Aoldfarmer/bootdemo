package com.example.demo.ch7.domain;

/**
 * @author koou
 * @version 1.0
 * @since 2017-11-20 下午 21:17
 */
public class WiselyResponse {

    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
