package Practice02;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if(age>20) {
			System.out.println("\"1번그룹\"");
		}
		else {
			System.out.println("\"2번그릅\"");
		}
		System.out.println("입니다.");
		
		sc.close();
		
		//15,19,20는 2번그룹 21,100번 1번그룹
	}

}
