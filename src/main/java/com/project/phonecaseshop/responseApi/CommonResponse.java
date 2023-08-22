package com.project.phonecaseshop.responseApi;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommonResponse {
    SUCCESS("0", "성공하였습니다"),
    FAIL("-1", "실패하였습니다");

    private String code;
    private String msg;
}