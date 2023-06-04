package org.ass.ums.repository;

import java.util.List;

import org.ass.ums.entity.RegisterEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterRepositroy {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<RegisterEntity> findAllUsers(){
		try {
			String hqlQuery ="from RegisterEntity";
			Session session =sessionFactory.openSession();
			Query query = session.createQuery(hqlQuery);
			return query.getResultList();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
		
	}
	
	public void saveUser(RegisterEntity registerEntity) {
		try {
			
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(registerEntity);
			transaction.commit();
		} catch (Exception e) {

		}
	}
	


}
