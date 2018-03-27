package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	@Autowired
	private JdbcTemplate template;
	int status;
	public int insert(Employee e)
	{
		template.update("insert into employee values(?,?,?,?)",new Object[] {e.getId(),e.getName(),e.getSalary(),e.getDesignation()});
		status =1;
		return status;
	}
	public void delete(Employee e)
	{
		template.update("delete from employee where (?)",new Object[]{e.getId()});
	}
	public List<Employee>getAllEmployee()
	{
		List<Employee> list = template.query("Select * from employee",new EmployeeRowmapper());
		return list;
	}
	public void updatename(Employee e)
	{
		template.update("UPDATE Employee SET name = ? Where id = (?)",new Object[]{e.getName(),e.getId()});
			
	}
	public void updatesalary(Employee e)
	{
		template.update("UPDATE Employee SET name = ? Where id = (?)",new Object[]{e.getSalary(),e.getId()});
		
		}
	public void updatedesignation(Employee e)
	{
		template.update("UPDATE Employee SET name = ? Where id (?)",new Object[]{e.getDesignation(),e.getId()});
	}
	}
	

