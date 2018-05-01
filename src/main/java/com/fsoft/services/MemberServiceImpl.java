package com.fsoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fsoft.entities.Member;
import com.fsoft.reponsitory.MemberDao;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {
  @Autowired
  private MemberDao memberDao;

  @Override
  public List<Object[]> getListMember() {
    return memberDao.getListMember();
  }

  @Override
  public int add(Member member) {
    return memberDao.add(member);
  }

  @Override
  public int delete(Member member) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int update(Member member) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public Member getMemberById(int id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Member> getAllMember() {
    return memberDao.getAllMember();
  }

  @Override
  public Member checkLogin(Member member) {
    return memberDao.checkLogin(member);
  }

}
