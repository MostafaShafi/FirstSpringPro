package com.example.shesh.Models.utilModel;

import javax.persistence.AttributeConverter;

public class TermConverter implements AttributeConverter<Term, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Term term) {
        return term.getCode();
    }

    @Override
    public Term convertToEntityAttribute(Integer code) {
        return Term.getFromCode(code);
    }
}
