package com.example.shesh.Models.utilModel;

public enum LocationType {
    COUNTRY(1),
    PROVINCE(2),
    TOWN(3),
    DISTRICT(4),
    RURAL_DISTRICT(5),
    VILLAGE(6);

    private final Integer code;

    LocationType(Integer code) {
        this.code = code;
    }

    public static LocationType getFromCode(Integer code) {
        if (code == 1) return COUNTRY;
        if (code == 2) return PROVINCE;
        if (code == 3) return TOWN;
        if (code == 4) return DISTRICT;
        if (code == 5) return RURAL_DISTRICT;
        if (code == 6) return VILLAGE;

        throw new UnsupportedOperationException("The code " + code + " is not supported!");
    }

    public Integer getCode() {
        return code;
    }
}
