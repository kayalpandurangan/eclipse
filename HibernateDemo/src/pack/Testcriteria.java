package pack;

import java.util.Iterator;
import java.util.List;






import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class Testcriteria {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s =sf.openSession();
		Criteria crt =s.createCriteria(Employee.class);
		crt.add(Restrictions.between("id",100,600));
		crt.add(Restrictions.gt("salary",30000.0));
		@SuppressWarnings("rawtypes")
		List list = crt.list();
		
		@SuppressWarnings("rawtypes")
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Employee e =(Employee)it.next();
			System.out.println("Id=" + e.getId()+"Name=" + e.getName()+"salary= "+e.getSalary());
			
		}
				
		
	}

}
