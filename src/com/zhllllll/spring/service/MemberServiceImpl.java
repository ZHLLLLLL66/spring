package com.zhllllll.spring.service;

import com.zhllllll.spring.dao.MemberDAOImpl;

public class MemberServiceImpl {
    private MemberDAOImpl memberDAO;

    public MemberDAOImpl getMemberDAO() {
        return memberDAO;
    }

    public void setMemberDAO(MemberDAOImpl memberDAO) {
        this.memberDAO = memberDAO;
    }

    public void add(){
        System.out.println("Service中的add方法被调用");
        memberDAO.add();
    }
}
