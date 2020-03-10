package com.classroom.service;

import com.classroom.ClassroomApplicationTests;
import com.classroom.enums.ClassroomAuditEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Clrvn
 * @description
 * @className ApplyServiceTests
 * @date 2019-05-17 9:37
 */
public class ApplyServiceTests extends ClassroomApplicationTests {
    
    @Autowired
    private IApplyService applyService;
    
    @Autowired
    private IClassroomService classroomService;
    
    @Test
    public void queryApplyVO() {

//        PageInfo<ApplyVO> applyVOList = applyService.queryApplyVOList(1, 5, null, 1, null, null);
//
//        System.err.println(JSON.toJSONString(applyVOList));
        
    }
    
    @Test
    public void addApply() {

//        int count = applyService.addApply(1, 2, new Date(), new Date());
//
//        System.err.println(count);
        
    }
    
    @Test
    public void cancelApply() {

//        int count = applyService.cancelApply(6);
//
//        System.err.println(count);
        
    }
    
    @Test
    public void auditApplyStatusById() {
        
        int count = applyService.auditApplyStatusById(1, ClassroomAuditEnum.CLASSROOM_AUDIT_PASS.getCode());
        
        System.err.println(count);
        
    }
    
    @Test
    public void test() {
        
        classroomService.queryClassroomTimeListById(4);
    }
}
