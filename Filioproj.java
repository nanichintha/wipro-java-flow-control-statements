package iostreams;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MiniProject {
	
	public static void main(String[] args) throws IOException{
		Scanner stringsc = new Scanner(System.in);
		Scanner intsc = new Scanner(System.in);
		File inputFile = new File("C:\\Users\\DELL\\Desktop\\code\\source.txt");
		FileReader in = new FileReader(inputFile);
		BufferedReader reader = new BufferedReader(in);
		FileWriter out = new FileWriter(inputFile, true);
		BufferedWriter writer = new BufferedWriter(out);
		int no;
		do{
			System.out.println("MAIN MENU");
			System.out.print("1.Add an Employee\n2.Display All\n3.Exit\n");
			no = intsc.nextInt();
			switch(no){
			case 1:
				System.out.print("Enter Employee ID: ");
				int ID = intsc.nextInt();
				writer.write(" "+ID);
				System.out.print("Enter Employee Name: ");
				String Name = stringsc.nextLine();
				writer.write(" "+Name);
				System.out.print("Enter Employee Age: ");
				int age = intsc.nextInt();
				writer.write(" "+age);
				System.out.print("Enter Employee Salary: ");
				int salary = intsc.nextInt();
				writer.write(" "+salary);
				System.out.println();
				writer.newLine();
				break;
			case 2:
				writer.close();
				System.out.println("----Report----");
				String line = null;
				 while ((line = reader.readLine()) != null) {
				   System.out.println(line);
				 }
				 System.out.println("----End of Report----");
				System.out.println();
				
				break;
			case 3:
				reader.close();
				System.out.println("Exiting...!! Thanks for using the application.");
				System.exit(0);
			}
			
		}while(no!=3);
		stringsc.close();
		intsc.close();
		
	}
	

}
