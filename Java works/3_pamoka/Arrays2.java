public class Arrays2
{
public static void main (String[] args)
{
	int number[] = {1, 2, 3, 4, 5, 6};
	int kontrole = number.length;
	int k2 = 0;
	int ii = 0;

	for (int i = 0; i < kontrole; i++) {
		ii = i + 1;
		if (ii == kontrole) {
			break;
		}
		if (number[i] < number[ii]) {
			k2 = k2 + 1;
		}
	}
		kontrole = kontrole -1;
		if (k2 == kontrole) {
			System.out.println("Seka didejanti");
		}
		if (k2 == 0) {
			System.out.println("Seka mazejanti");
		}
		if (k2 > 0 && k2 < kontrole) {
			System.out.println("Tai ne seka");
		}
}

}
