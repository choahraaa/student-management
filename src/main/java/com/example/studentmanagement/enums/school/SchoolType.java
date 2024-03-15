package com.example.studentmanagement.enums.school;

import com.example.studentmanagement.enums.EnumMapperType;

public enum SchoolType implements EnumMapperType {
    ELEMENTARY("초등학교"),
    MIDDLE("중학교"),
    HIGH("고등학교");

    private final String name;

    SchoolType(String name){
        this.name = name;
    }

    @Override
    public String getCode() {
        return name();
    }

    @Override
    public String getName() {
        return name;
    }
}
