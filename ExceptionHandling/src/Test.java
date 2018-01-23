import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the employee name");
		String value=sc.nextLine();
		List l=new ArrayList<>();
		Employee e=new Employee("ishu",1);
		Employee e1=new Employee("ravi", 2);
		
		l.add(e);
		l.add(e1);
		
	Iterator it=l.iterator();
	while(it.hasNext())
	{
		Employee e2=(Employee) it.next();
		if(e2.getEname().equals(value))
		{
			System.out.println(e2.getEid()+e2.getEname());
		}
		else
		{
			throw new EmployeeNotFoundException();
		}
	}
		
		
		

	}

}