package Practice02;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요.");
		
		System.out.print("기호: ");
		char op = sc.next().charAt(0);
		
		System.out.print("숫자1: ");
		double num01 = sc.nextDouble();
		System.out.print("숫자2: ");
		double num02 = sc.nextDouble();
		
		switch(op) {
			case '+' :System.out.println("결과는: "+ (num01+num02));
			break;
				
			case '-' :System.out.println("결과는: " + (num01-num02));
			break;
				
			case '*' :System.out.println("결과는: "+ (num01*num02));
			break;
				
			case '/' :
				if(num02 ==0) {
				System.out.println("계산할 수 없습니다.");
				break;
				}
				
				System.out.println("결과는: "+ (num01/num02));
				break;
				
			
			default : System.out.println("계산할 수 없는 기호입니다.");
			break;
		}
	}
}
