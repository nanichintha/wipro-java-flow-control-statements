import java.util.Scanner;

public class H7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch>=97&&ch<=122){
			System.out.println(ch+"->"+Character.toUpperCase(ch));
		}
		if(ch>=65&&ch<=90){
			System.out.println(ch+"->"+Character.toLowerCase(ch));
		}
		sc.close();
	}
}
