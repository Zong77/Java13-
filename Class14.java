package Java13;

import java.util.*;

class IntegerTooSmall extends Exception {

}

class IntegerTooLarge extends Exception {

}

public class Class14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		try {
			System.out.print("�п�J�@�Ӿ��:");
			num = sc.nextInt();
			if (num < 10)
				throw new IntegerTooSmall(); // (a)
			else if (num > 70)
				throw new IntegerTooLarge(); // (b)
			else
				System.out.println("num=" + num); // (c)
		} catch (IntegerTooSmall e) {
			System.out.println("�z��J����ƭȤӤp");
		} catch (IntegerTooLarge e) {
			System.out.println("�z��J����ƭȤӤj");
		} catch (InputMismatchException e) {
			System.out.println("�z��J�����O���"); // (d)
		}
	}
}