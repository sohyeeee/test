import java.util.Scanner;

public class While3_Ex1 {

	public static void main(String[] args) {
		int cnt=0;

		Scanner scanner = new Scanner(System.in);
		while(true) { //무한반복문. 메뉴에 종료있을때
			System.out.println("------------------------------");
			System.out.println("1.증속 | 2.감속 | 3.종료");
			System.out.println("------------------------------");
			System.out.print("선택: ");
			int menu = scanner.nextInt();
			
			if(1<=menu&&menu<=3) {
				if(menu==1) {
					cnt++;
				}else if(menu==2) {
					cnt--;
				}else {
					System.exit(0);
				}
			}else {
				System.out.println("메뉴 이외의 값이에요. 다시 선택하세요.");
				continue;
			}
			System.out.println("현재속도="+cnt);
		}
	}
}
