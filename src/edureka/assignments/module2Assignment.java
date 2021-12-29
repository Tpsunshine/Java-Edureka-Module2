package edureka.assignments;

import java.util.Scanner;

public class module2Assignment {
	
	//Display the arrays.
	void display(int id[], double salary[], String name[]) {
		
		System.out.println("ID             Name              Salary");
		
		int length = id.length;
		for (int i = 0; i < length; ++i) {
			
			System.out.println(id[i] + "                " + name[i] + "               " + salary[i]);
		}
	}
	
	//Display the arrays
	void display(int id[], String name[] ) {
		
		System.out.println("ID                   Name     ");
		
		int length = id.length;
		for (int i = 0; i < length; ++i) {
			
			System.out.println(id[i] + "              " + name[i] + "          ");
		}
	}
	
	//Displays the arrays.
	void display(String SearchName, int id[], String name[], double sal[]) {
		
		System.out.println("ID                  Name                   Salary");
		
		int length = id.length;
		for (int i = 0; i < length; ++i) {
			
			if(name[i].equals(SearchName))
				System.out.println(id[i] + "              " + name[i] + "                " + sal[i]);
		}
		
	}
	
	public static void main (String args[]) {
		
		int id[] = new int[5];
		double salary[] = new double[5];
		String name[] = new String[5];
		
		//Accepting Data
		
		Scanner sc = new Scanner (System.in);
		
		
		for (int i = 0; i < 5; ++i) {
			
			System.out.println("Enter employee record in ID Name salary format....");
			id[i] = sc.nextInt();
			name[i] = sc.next();
			salary[i] = sc.nextDouble();
		}
		 
		
		module2Assignment m1 = new module2Assignment();
		m1.display(id, salary, name);
		System.out.println();
		
		m1.display(id, name);
		
		System.out.println("Enter a name to search for...");
		String searchName = sc.next();
		m1.display(searchName, id, name, salary);
		
		
		
	}
} 

	
