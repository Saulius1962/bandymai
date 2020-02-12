public class ForLoopAndArrays
{
public static void main (String[] args)
{
	int[] numbers = {1, 2, 3, 4, 5};
	int rows[][] = {
		{1, 2, 3, 4, 5},
		{6, 7, 8, 9, 10}
	};
	for (int i = 0; i < numbers.lenght; i++) {
		System.out.println("element #" + i + " is: " +  numbers[i]);
	}
	for (int i = 0; i < rows.length; i++) {
		for (int ii = 0; ii < rows[i].length; ii++) {
			System.out.println("Row: " + i + ", Col: " + ii + ", value: " + rows[i][ii]);
		}
	}
}

}
