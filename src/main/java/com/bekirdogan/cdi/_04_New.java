package com.bekirdogan.cdi;

import com.bekirdogan.StudentDto;
import lombok.Getter;

import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
public class _04_New {

    // producing
    @Produces
    public String producingData (@New StudentDto studentDto){
        studentDto = StudentDto.builder().studentId(0L).studentName("student name").build();

        return studentDto.getStudentName();
    }

    @Getter
    @Inject
    private String consumingData;
}
