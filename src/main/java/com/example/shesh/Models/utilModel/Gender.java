package com.example.shesh.Models.utilModel;


public enum Gender {
    Male('M'),
    Female('M');

    private final Character code;

    Gender(Character code) {
        this.code = code;
    }

    public Character getCode() {
        return code;
    }

    public static Gender getFromCode(Character code) {
        if (code == 'M' || code == 'm')
            return Male;
        if (code == 'F' || code == 'f')
            return Female;
        throw new UnsupportedOperationException(String.format("The code %c is not supported!", code));
    }
}
