package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHQL {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		String hibernateQuery = "select obj from pack.Employee obj where obj.salary>30000";
		Query query = s.createQuery(hibernateQuery);
		List list = query.list();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Employee e = (Employee)it.next();
			System.out.println(e.getId()+""+e.getName()+" "+e.getSalary());
		
			
		}
		System.out.println("**** To retrieve only name of employee");
		String secondQuery = "select obj.name from pack.Employee obj";
		Query query2 = s.createQuery(secondQuery);
		List list2 = query2.list();
		Iterator it2 = list2.iterator();
		while(it2.hasNext())
		{
			String empNames =(String)it2.next();
			System.out.println(empNames);
		}
				sf.close();s.close();
				
		
	}

}
