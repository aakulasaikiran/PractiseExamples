import java.util.ArrayList;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		Employee b1 = new Employee(1, "sai", 2000, "developer");
		Employee b2 = new Employee(2, "kiran", 2500, "sals");
		Employee b3 = new Employee(3, "saikiran", 3000, "manager");
		Employee b4 = new Employee(1, "sai", 2000, "gd");
		Employee b5 = new Employee(4, "naidu", 5000, "TeamLead");
		Employee b6 = new Employee(1, "sai", 2000, "developer");

		Employee b7 = new Employee();
		b7.setEid(1);
		b7.setEname("sai");
		b7.setSal(3500);
		b7.setRole("production");
		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		System.out.println("Before do anything ");
		for (Employee s1 : list) {

			System.out.println(s1.getEid() + "," + s1.getEname() + "," + s1.getSal() + "," + s1.getRole());

		}

		HashSet<Employee> s = new HashSet<Employee>();
		s.addAll(list);
		list = new ArrayList<Employee>();
		list.addAll(s);
System.out.println("\n");
System.out.println("\n");
System.out.println("\n");
System.out.println("After Modify the code");
		for (Employee s1 : list) {

			System.out.println(s1.getEid() + "," + s1.getEname() + "," + s1.getSal() + "," + s1.getRole());

		}

	}

}
