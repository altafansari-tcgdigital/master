package maximum;

import java.util.SortedSet;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student( "A" , 1);
		Student student1 = new Student( "CD" , 2);
		Student student2 = new Student( "DD" , 3);
		Student student3 = new Student( "CD" , 4);
		SortedSet<Student> sSet  = new TreeSet<Student>(new StudentCom());
		sSet.add(student3);
		sSet.add(student2);
		sSet.add(student1);
		sSet.add(student);
		
		for (Student s : sSet)
		{
			System.out.print(s.getName());
			System.out.println(" "+s.getId());
		}
		
		try()

	}

}
