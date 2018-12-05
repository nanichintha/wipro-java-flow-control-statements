import java.util.Scanner;

public class MiddleString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int l1 = str1.length();
		String str2 = str1.substring(1,l1-1 );
		int l2 = str2.length();
		if(l2>=2){
			System.out.println(str2);
		}
		else{
			System.out.println("Resulted string length is less than 2");
		}
		sc.close();		
	}

}
