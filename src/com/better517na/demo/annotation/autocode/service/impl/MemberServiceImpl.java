package com.better517na.demo.annotation.autocode.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.dobby.common.page.Page;

import com.better517na.demo.annotation.autocode.service.MemberService;
import com.better517na.demo.annotation.autocode.manager.MemberManager;
import com.better517na.demo.annotation.model.Member;

/**
 *
 * User: dobby
 * Date: 2016-06-22
 * Time: 14:07:50
 * Version: 1.0
 *
 */
@Service(value = "memberService")
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberManager memberManager;


    /**
     * save  member <br/>
     *
     * @param member
     *         member
     * @return
     *         effect of row number
     */
    @Override
    public int save(Member member){
        return this.memberManager.save(member);
    }


    /**
     * update member <br/>
     *
     * @param member
     *         member
     * @return
     *         effect of row number
     */
    @Override
    public int update(Member member) {
        return this.memberManager.update(member);
    }


    /**
     * delete member by primary key <br/>
     *
     * @param primaryKey
     *         primaryKey
     * @return
     *         effect of row number
     */
    @Override
    public int delete(java.lang.Integer primaryKey){
        return this.memberManager.delete(primaryKey);
    }


    /**
     * delete  member by condition <br/>
     *
     * @param member
     *         condition member
     * @return
     *         effect of row number
     */
    @Override
    public int deleteObjects(Member member) {
        return  this.memberManager.deleteObjects(member);
    }


    /**
     * select  member by primary key <br/>
     *
     * @param primaryKey
     *         primaryKey
     * @return
     *         with the conditions of the one object
     */
    @Override
    public Member select(java.lang.Integer primaryKey) {
        return  this.memberManager.select(primaryKey);
    }

    /**
     * select list  member by condition <br/>
     *
     * @param member
     *         condition member
     * @return
     *         with the conditions of the result set
     */
    @Override
    public List<Member> selectObjects(Member member){
        return this.memberManager.selectObjects(member);
    }


    /**
     * select list  member by condition for page show<br/>
     *
     * @param member
     *          query condition
     * @param pageNow
     *          get data for which page
     * @param pageSize
     *          pageSize for each page
     * @return
     *         with the conditions of the result set
     */
    @Override
    public Page<Member> selectPage(Member member, Integer pageNow, Integer pageSize){
        return this.memberManager.selectPage(member , pageNow , pageSize);
    }


    public void setMemberManager (MemberManager memberManager) {
        this.memberManager = memberManager;
    }

}
