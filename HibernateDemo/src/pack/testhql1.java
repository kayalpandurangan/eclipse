package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class testhql1 {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		String hql = "Select e.name,e.salary from pack.Employee e";
		Query query = s.createQuery(hql);
		List list = query.list();
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Object[] obj = (Object[]) it.next();
			String name = (String)obj[0];
			Double salary = (Double)obj[1];
			System.out.println("Name ="+name+",Salary = "+salary);
		}
		sf.close();
		s.close();
	}
	

}
