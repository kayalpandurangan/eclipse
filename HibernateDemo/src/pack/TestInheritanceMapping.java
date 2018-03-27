package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestInheritanceMapping {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		person p = new person(111, "Raj");
		customer c = new customer(222,"Rahul","HDFC");
		student std = new student(333,"Alex","A");
		s.save(p);
		s.save(c);
		s.save(std);
		tx.commit();
		s.close();
		sf.close();
		
	}

}
