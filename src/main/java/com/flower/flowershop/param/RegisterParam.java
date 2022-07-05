package com.flower.flowershop.param;

import lombok.Data;

import java.io.Serializable;

@Data
public class RegisterParam implements Serializable {

    private String username;
    private String pwd;
    private String phone;
    private String hobby;

}
