package com.example.shesh.Models.utilModel;

import javax.persistence.AttributeConverter;

public class LocationTypeConverter implements AttributeConverter<LocationType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(LocationType locationType) {
        return locationType.getCode();
    }

    @Override
    public LocationType convertToEntityAttribute(Integer code) {
        return LocationType.getFromCode(code);
    }
}
