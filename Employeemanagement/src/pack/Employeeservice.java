package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Employeeservice {
	
	@Autowired
private EmployeeDAO dao;
	int status;
public int insert(Employee e)
{
	status = dao.insert(e);
	return status;
}
public List<Employee>getAllEmployee()
{
	return dao.getAllEmployee();
}
public void delete(Employee e)
{
	dao.delete(e);
}
public void updatename(Employee e)
{
	dao.updatename(e);
}
public void updatesalary(Employee e)
{
	dao.updatesalary(e);
}
public void updatedesignation(Employee e)
{
	dao.updatedesignation(e);
	
}
}



