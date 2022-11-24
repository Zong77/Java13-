package Java13;

public class Class01 {

	public static void main(String[] args) {
		int num = 12, den = 0;
		int ans = num / den;
		System.out.println("end of main() method!!");
	}
}
//(a)編譯時不會有錯誤訊息出現
//(b)是指發生運算上的錯誤，由於程式中將 den 值設為0，又將 den 放在除數，在數學上這是沒有意義的，因此 Java 在執行時拋出這個例外。
//(c)因為 Java 在執行時拋出例外，並暫停程式的執行，因此第8行還來不及執行即被停止。