package maximum;

import java.util.Comparator;

public class Student  {//implements Comparable{
	
	private String name;
	private Integer id;
	
	
	
	public Student(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	/*
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		 int val= this.getName().compareTo(((Student) o).getName());
		 if(val ==0)
		 {
			 val = this.getId()-(((Student) o).getId());
		 }
		 return val;
	}
	*/
	

}

class StudentCom implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		 int val= o1.getName().compareTo(((Student) o2).getName());
		 if(val ==0)
		 {
			 val = o1.getId()-(((Student) o2).getId());
		 }
		 return val;
	}
	
}
