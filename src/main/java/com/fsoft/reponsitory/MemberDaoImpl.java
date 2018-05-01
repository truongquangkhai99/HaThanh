package com.fsoft.reponsitory;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsoft.entities.Member;

@Repository
public class MemberDaoImpl implements MemberDao {
  @Autowired
  private SessionFactory sessionFactory;

  public SessionFactory getSessionFactory() {
    return sessionFactory;
  }

  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @SuppressWarnings({ "unchecked" })
  @Override
  public List<Object[]> getListMember() {
    List<Object[]> list = sessionFactory.getCurrentSession()
        .createSQLQuery("SELECT * FROM Member").addEntity(Member.class).list();
    return list;
  }

  @Override
  public int add(Member member) {
    /*Session session = sessionFactory.openSession();
    Transaction t = null;
    try {
      t = session.getTransaction();
      t.begin();
      int id = (Integer) session.save(member);
      if (!t.wasCommitted())
        t.commit();
      return id;
    } catch (Exception e) {
      if (t != null)
        t.rollback();
      return 0;
    } finally {
      session.close();
    }*/
    return 0;
  }

  @Override
  public int delete(Member member) {
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

  @SuppressWarnings("unchecked")
  @Override
  public List<Member> getAllMember() {
    Query query = sessionFactory.getCurrentSession().createQuery("FROM Member");
    return query.list();
  }

  @Override
  public Member checkLogin(Member member) {
    String hql = "FROM Member WHERE email = :email AND password = :password";
    Query query = sessionFactory.getCurrentSession().createQuery(hql);
    query.setParameter("email", member.getEmail());
    query.setParameter("password", member.getPassword());
    if (query.list().size() > 0)
      return (Member) query.list().get(0);
    else
      return null;
  }

}
