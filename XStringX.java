import java.util.Scanner;

public class XString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int l1 = str1.length();
		if((str1.charAt(0)=='x' || str1.charAt(0)=='X')&& (str1.charAt((l1-1))=='x'||str1.charAt((l1-1))=='X')){
			String str2 = str1.substring(1,l1-1 );
			System.out.println(str2);

		}
		else if((str1.charAt(0)=='x' || str1.charAt(0)=='X') ){
			String str2 = str1.substring(1,l1 );
			System.out.println(str2);
		}
		else if((str1.charAt((l1-1))=='x'||str1.charAt((l1-1))=='X')){
			String str2 = str1.substring(0,l1-1 );
			System.out.println(str2);
		}
		else{
			System.out.println(str1);
		}
		sc.close();
	}

}
