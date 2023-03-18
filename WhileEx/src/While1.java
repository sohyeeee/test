
public class While1 {

	public static void main(String[] args) {
		int i = 0;   // i는 0부터 시작 5번 반복하기 위한 카운트 변수

		String today = "20230318";

		while (i < 5) { // 0 1 2 3 4
			System.out.println("환영합니다. ");
			System.out.println(i);
			i++;  // 1씩 증가
		}
		System.out.println("반복이 종료되었습니다." + today);
	}
}
