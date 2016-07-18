package com.better517na.demo.annotation.autocode.dao;

import java.util.List;

import com.dobby.common.base.BaseCudDao;
import com.dobby.common.base.BaseReadDao;

import com.better517na.demo.annotation.model.Member;

/**
*
* User: dobby
* Date: 2016-06-22
* Time: 14:07:50
* Version: 1.0
*
*/
public interface MemberDao extends BaseReadDao<Member,java.lang.Integer>,BaseCudDao<Member,java.lang.Integer>{

}
