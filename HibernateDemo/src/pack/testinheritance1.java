package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class testinheritance1 {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		Criteria crt = s.createCriteria(person.class);
		List list = crt.list();
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			person p = (person)it.next();
			if(p instanceof customer )
		
		{
			customer c = (customer)p;
			System.out.println("Id = "+c.getUid()+" , Name = "+c.getName()+",Bank = "+ c.getBankName());
			
		}
		else if(p instanceof student)
		{
			student s1 = (student)p;
			System.out.println("Id = "+s1.getUid()+",Name ="+s1.getName()+",Grades = "+s1.getGrades());
		}
		else
		{
			System.out.println("Id = "+p.getUid()+"Name="+p.getName());
		}
		
		
		}
	s.close();
	sf.close();
}
}


