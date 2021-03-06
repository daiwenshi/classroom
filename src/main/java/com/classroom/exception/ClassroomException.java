package com.classroom.exception;

import com.classroom.enums.ResultFailureEnum;

public class ClassroomException extends RuntimeException {

    private Integer code;

    public ClassroomException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ClassroomException(ResultFailureEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
