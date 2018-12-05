import java.util.Scanner;

public class SlsString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int l1 = str1.length();
		int l2 = str2.length();
		if(str1.equals("")){
			System.out.print(str1);
		}
		if(l1!=l2){
			if(l1>l2){
				System.out.print(str2+str1+str2);
			}
			else{
				System.out.print(str1+str2+str1);
			}
		}
		sc.close();		
	}

}
