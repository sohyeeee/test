import java.util.Scanner;

public class While2_Gugu { //출력하고 싶은 구구단 입력받아 출력하기

	public static void main(String[] args) {
		int i=1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단 : ");
		int input = scanner.nextInt();
		
		while(i <= 9) {
			System.out.printf("%d * %d = %d%n",input,i,input*i);
			i++;
		}
	}
}
