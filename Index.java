package curd;
import java.util.*;

class Student{
    private int id;
    private String name;
    
@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

class StudentRepository{
	Scanner cin = new Scanner(System.in);
	List<Student> list = new ArrayList<>();
	
	
	public void addStudent(Student S) {
		list.add(S);
	}
	
	public void deleteStudent(int id){
		for(Student x : list) {
			int num = x.getId();
			if(num==id) {
				list.remove(x);
				break;
			}
		}
		
	}
	
	public void update(int id) {
		for(Student x : list) {
			int num  = x.getId();
			if(num==id) {
				System.out.println("Enter New Name");
				String name = cin.nextLine();
				x.setName(name);
				
				
			}
			
		}
	}
	
	public void show() {
		for(Student x : list) {
			System.out.println(x.toString());
			
		}
	}

}

public class Index {
	public static void main(String[] args) {
		Menu m = new Menu();
		m.getMenu();
	}
	
	   
	}

