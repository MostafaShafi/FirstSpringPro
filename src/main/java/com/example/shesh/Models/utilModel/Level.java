package com.example.shesh.Models.utilModel;

public enum Level {
    Master(1),
    Senior(2),
    Junior(3);

    private final Integer code;

    Level(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public Level getFromCode(Integer code) {
        if (code == 1)
            return Master;
        if (code == 2)
            return Senior;
        if (code == 3)
            return Junior;
        throw new UnsupportedOperationException(String.format("The code %c is not supported!", code));
    }
}
