package com.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.member.vo.MemberVO;

public interface MemberService {
	public List listMembers() throws DataAccessException;
	public int addMember(MemberVO member) throws DataAccessException;
	public void removeMember(String id)throws DataAccessException;
	
	
	
}
