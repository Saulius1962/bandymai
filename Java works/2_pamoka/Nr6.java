import java.lang.Math;
public class Nr6
{
public static void main (String[] args)
	{
		System.out.print("Input floating-point number : ");
		double a = Math.round(Double.valueOf(System.console().readLine())*1000);	
		System.out.print("Input floating-point another number : ");
		double b = Math.round(Double.valueOf(System.console().readLine())*1000);	
		
		if (a == b) {
			System.out.println("They are the same up to three decimal places");
		}
		else
        {
            System.out.println("They are different");
        }
			
	}
}
