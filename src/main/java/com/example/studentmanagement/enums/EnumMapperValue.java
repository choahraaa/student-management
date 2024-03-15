package com.example.studentmanagement.enums;

import lombok.Getter;

@Getter
public class EnumMapperValue {

    private final String code;
    private final String name;

    public EnumMapperValue(EnumMapperType mapperType) {
        code = mapperType.getCode();
        name = mapperType.getName();
    }

    @Override
    public String toString() {
        return "{"
            + "code:" + code
            + ","
            + "name:" + name
            +
            "}";
    }
}
