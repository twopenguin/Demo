package com.better517na.demo.annotation.autocode.manager.impl;

import java.util.List;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;

import com.dobby.common.page.Page;

import com.better517na.demo.annotation.autocode.manager.MemberManager;
import com.better517na.demo.annotation.autocode.dao.MemberDao;
import com.better517na.demo.annotation.model.Member;


/**
*
* User: dobby
* Date: 2016-06-22
* Time: 14:07:50
* Version: 1.0
*
*/
@Component(value = "memberManager")
public class MemberManagerImpl implements MemberManager{

    @Resource( name = "transactionMemberManager")
    private PlatformTransactionManager transactionMemberManager;

    @Autowired
    private MemberDao memberDao;

    public void setTransactionMemberManager (PlatformTransactionManager transactionMemberManager) {
        this.transactionMemberManager = transactionMemberManager;
    }
    public void setMemberDao (MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public int save(final Member member){
        int result = 0;
        TransactionTemplate template = new TransactionTemplate(this.transactionMemberManager);
        result = (Integer)template.execute(new TransactionCallback() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                return memberDao.insert(member);
            }
        });
        return result;
    }

    @Override
    public int update(final Member member) {
        int result = 0;
        TransactionTemplate template = new TransactionTemplate(this.transactionMemberManager);
        result = (Integer)template.execute(new TransactionCallback() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                return memberDao.update(member);
            }
        });
        return result;
    }

    @Override
    public int delete(final java.lang.Integer primaryKey){
        int result = 0;
        TransactionTemplate template = new TransactionTemplate(this.transactionMemberManager);
        result = (Integer)template.execute(new TransactionCallback() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                return memberDao.delete(primaryKey);
            }
        });
        return result;
    }

    @Override
    public int deleteObjects(final Member member) {
        int result = 0;
        TransactionTemplate template = new TransactionTemplate(this.transactionMemberManager);
        result = (Integer)template.execute(new TransactionCallback() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                return  memberDao.deleteObjects(member);
            }
        });
        return result;
    }

    @Override
    public Member select(java.lang.Integer primaryKey) {
        return  this.memberDao.select(primaryKey);
    }

    @Override
    public List<Member> selectObjects(Member member){
        return this.memberDao.selectObjects(member);
    }

    @Override
    public Page<Member> selectPage(Member member, Integer pageNow, Integer pageSize){
        Page<Member> page  = null;
        try {
            List<Member> list = this.memberDao.selectPagination(member, (pageNow - 1) * pageSize, pageSize);
            int recordTotal = this.memberDao.selectPageCount(member);
            page = new Page<Member>(list,recordTotal,pageNow);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return page;
    }


}
