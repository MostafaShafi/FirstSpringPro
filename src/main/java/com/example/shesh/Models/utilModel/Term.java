package com.example.shesh.Models.utilModel;

public enum Term {
    Autumn(1), Spring(2);

    private final Integer code;

    Term(Integer code) {
        this.code = code;
    }

    public static Term getFromCode(Integer code) {
        if (code == 1) return Autumn;
        if (code == 2) return Spring;
        throw new UnsupportedOperationException("The code " + code + " is not supported!");
    }

    public Integer getCode() {
        return code;
    }
}
