import java.util.Scanner;

public class ArrayExcept2 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int no = sc.nextInt();
		int[] arr = new int[no];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<no;i++){
			try{
				String s=sc.next();
				int k =Integer.parseInt(s);
				arr[i]=k;
			}
			catch(Exception e){
				System.out.println(e);
				System.exit(0);
			}
		}
		try{
			System.out.println("Enter the index of the array element you want to access");
			int ind = sc.nextInt();
			if(ind<arr.length){
				System.out.println("The array element at index "+ind+" = "+arr[ind]);
				System.out.println("The array element successfully accessed");
			}
			else
				throw new ArrayIndexOutOfBoundsException();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
