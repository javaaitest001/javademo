package java003_statements;

public class Java035_for {

	public static void main(String[] args) {

		go: // label for문에 대한 라벨을 붙일 수 있음 반복문 안에서 break 라벨명; 을 통해 반복문 자체를 빠져나오게 할 수 있음
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("j=%d\n", j);
				if (j == 3)
//					break; // 현재 반복문 정지 > 이전 반복문(go)의 증감식으로 이동
					break go; // go 반복문 정지
//					continue; // for 문에서 continue를 만나면 현재 수행중인 for문의 증감식으로 이동한다. 
//							  반복문에서는 조건식으로 간다라고 이해.(증감식이 없는 반복문도 있기 때문)
//					continue go; // for 문에서 continue 라벨명을 만나면 라벨명 for문의 증감식으로 이동한다.
			}
		}

	} // end main()

} // end class
