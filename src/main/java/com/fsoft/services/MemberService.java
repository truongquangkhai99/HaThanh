package com.fsoft.services;

import java.util.List;

import com.fsoft.entities.Member;

public interface MemberService {
	public List<Object[]> getListMember();

	public int add(Member member);

	public int delete(Member member);

	public int update(Member member);

	public Member getMemberById(int id);

	public List<Member> getAllMember();

	public Member checkLogin(Member member);
}
