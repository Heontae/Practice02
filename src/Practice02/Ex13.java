package Practice02;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		if(num<=0) {
			double x = (num*num*num)-9*num+2;
			System.out.println("계산결과는 " +x +" 입니다.");
		}
		if(num>0) {
			double x = (7*num)+2;
			System.out.println("계산결과는 " +x +" 입니다.");
		}
	}

}
