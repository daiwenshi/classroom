package com.classroom.vo;

import com.classroom.pojo.Apply;
import com.classroom.pojo.Classroom;
import lombok.Data;

import java.util.List;

/**
 * @author Clrvn
 * @description
 * @className ClassroomVO
 * @date 2019-05-24 10:56
 */
@Data
public class ClassroomApplyVO {
    
    private Integer classroomId;
    
    private List<Apply> applyList;
    
    private Classroom classroom;
    
}
