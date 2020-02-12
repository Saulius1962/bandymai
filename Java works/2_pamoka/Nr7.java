public class Nr7
{
public static void main (String[] args)
	{
		int dienuSkaicius = 0;
		System.out.print("Enter month number 1 .. 12 : ");
		int menuo = Integer.valueOf(System.console().readLine());	
		
		switch (menuo) {
			case 1 : dienuSkaicius = 31;
					break;
			case 2 : dienuSkaicius = 28;
					break;
			case 3 : dienuSkaicius = 31;
					break;
			case 4 : dienuSkaicius = 30;
					break;
			case 5 : dienuSkaicius = 31;
					break;
			case 6 : dienuSkaicius = 30;
					break;
			case 7 : dienuSkaicius = 31;
					break;	
			case 8 : dienuSkaicius = 31;
					break;
			case 9 : dienuSkaicius = 30;
					break;
			case 10 : dienuSkaicius = 31;
					break;
			case 11 : dienuSkaicius = 30;
					break;
			case 12 : dienuSkaicius = 31;
					break;
			}
			System.out.println();
			System.out.println(dienuSkaicius);
	}
}