package Practice02;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num01 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num02 = sc.nextInt();
		
		if (num01>=num02) {
			System.out.println("몫: "+(num01/num02));
			System.out.println("나머지: "+(num01%num02));
		}
		
		else if (num01<num02) {
			System.out.println("몫: "+(num02/num01));
			System.out.println("나머지: "+(num02%num01));
		}
		
		sc.close();
	}

}
