public class H9 {
	public static void main(String args[]){
		int n = 11;
		String[] monthNames = {"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"};
		switch(n-1){
		case 0:
			System.out.println(monthNames[0]);
			break;
		case 1:
			System.out.println(monthNames[1]);
			break;
		case 2:
			System.out.println(monthNames[2]);
			break;
		case 3:
			System.out.println(monthNames[3]);
			break;
		case 4:
			System.out.println(monthNames[4]);
			break;
		case 5:
			System.out.println(monthNames[5]);
			break;
		case 6:
			System.out.println(monthNames[6]);
			break;
		case 7:
			System.out.println(monthNames[7]);
			break;
		case 8:
			System.out.println(monthNames[8]);
			break;
		case 9:
			System.out.println(monthNames[9]);
			break;
		case 10:
			System.out.println(monthNames[10]);
			break;
		case 11:
			System.out.println(monthNames[11]);
			break;
		default:
			System.out.println("Invalid month");
		}
	}
}
