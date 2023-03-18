import java.util.Scanner;

public class While4_Bank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int save,withdraw,sum = 0;

		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			int select = scanner.nextInt();

			switch(select) {
			case 1:
				System.out.print("예금할 액수는? ");
				save = scanner.nextInt();
				sum = sum + save;
				break;
			case 2:
				System.out.print("출금할 액수는? ");
				withdraw = scanner.nextInt();
				sum = sum - withdraw;
				break;
			case 3:
				System.out.println("잔고는 "+sum+"원 입니다.");
				break;
			case 4:
				System.out.print("종료됩니다.");
				System.exit(0);
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
				break;
			}
		}
	}
}
