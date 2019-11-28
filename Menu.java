package curd;
import java.util.*;

public class Menu {
	public void getMenu(){
		@SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
		boolean processing = true;
		int choice;
		
		StudentRepository obj2 = new StudentRepository();
		
		do {
			System.out.println("Press 1 For adding student");
			System.out.println("Press 2 For deleting student");
			System.out.println("Press 3 For updating student");
			System.out.println("Press 4 For all data");
			System.out.println("Any other key will exit");
			
			choice = cin.nextInt();
			switch(choice) {
			case 1: 
				    System.out.println("Enter Student ID");
				    int id = cin.nextInt();
				    System.out.println("Enter Student Name");
				    String name = cin.next();
				    Student obj = new Student(id,name);
				    obj2.addStudent(obj);
				    break;
				    
			case 2:
				System.out.println("Enter the ID to Delete the Student");
				id = cin.nextInt();
				cin.nextLine();
				obj2.deleteStudent(id);
				break;
				
			case 3:
				System.out.println("Enter the ID to Update");
				id = cin.nextInt();
				obj2.update(id);
				break;
				
			case 4:
				 obj2.show();
				 break;
				 
				 default:
					 processing = false;
			}
		}while(processing);
		
		
	}

}
