package com.flower.flowershop.param;

import lombok.Data;

import java.io.Serializable;


@Data
public class LoginParam implements Serializable {

    private String phone;
    private String pwd;
}
