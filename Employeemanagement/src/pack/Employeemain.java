package pack;
	
		import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

		public class Employeemain 
		{
			public static void main(String[] args)
			{
				ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
				Employeeservice service = (Employeeservice)context.getBean("service");
				Employee employee = (Employee) context.getBean("employeeObject");
				int i=1,r;
				do {
					
					System.out.println("******** Employee Management System ********");
					System.out.println("1)	Add   2) Delete by Id  3) Display All  4) Update by id  5) Exit");
					
					String a;
				Scanner sc = new Scanner(System.in);
				sc.nextInt();
				switch(i)
				{
				case 1:
				{
				System.out.println("Enter id");
				employee.setId(sc.nextInt());
				System.out.println("Enter name");
			employee.setName(sc.next());
				System.out.println("Enter salary");
			employee.setSalary(sc.nextDouble());
			System.out.println("Enter designation");
			employee.setDesignation(sc.next());
			 r = service.insert(employee);
			if(r == 1)
				System.out.println("Employe info stored");
			break;
		
				}
				case 2:
				{
					System.out.println("delete");
					System.out.println("Enter id");
					employee.setId(sc.nextInt());
					service.delete(employee);
					break;
				}
				case 3:
				{
					System.out.println("display");
					List<Employee> EmployeeList = service.getAllEmployee();
					for(Employee e :EmployeeList)
					{
						System.out.println(e.getId()+e.getName()+e.getSalary()+e.getDesignation());
					}
					break;
				}
				case 4:
				{
								System.out.println("Enter Id");
								employee.setId(sc.nextInt());
								do
								{
								System.out.println("***** A sub menu to update the following ****");
								System.out.println("(a)Name	(b)Salary 	(c)Designation	(d)Exit");
								a=sc.next();
								switch (a) 
								{
								case "a" :
								{
						System.out.println("Enter new name");
									employee.setName(sc.next());
									service.updatename(employee);
							    	break;
								} 
								
								case "b":
												{
													System.out.println("Enter new salary");
													employee.setSalary(sc.nextDouble());
													service.updatesalary(employee);
													break;
												}
								case "c":
												{
													System.out.println("Enter new designation");
													employee.setDesignation(sc.next());
													service.updatesalary(employee);
													break;
												}

												default:
													break;
												}
								
												}while(a=="d");
											
				
						default:
						break;
				}
				}while(i<5);
				
				
				
				System.out.println("main exits");
				System.out.println("thankyou");
			}
		}
		}
		

								
								
										
								
										
												
			

	


