package com.hoangminhng.lesson4.REST;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentErrorRespone {
    private int status;
    private String message;
    private long timeStamp;

    public StudentErrorRespone() {
    }

    public StudentErrorRespone(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }
}
