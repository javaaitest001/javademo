package java001_basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoTest {

    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> userNumbers = new ArrayList<>();  // 직접 입력 리스트 생성
        List<Integer> randNumbers = new ArrayList<>();  // 무작위 생성 리스트 생성

        Scanner scan = new Scanner(System.in);
        
        System.out.println("숫자를 6개 입력하세요 (1부터 45 사이의 숫자):");
        
        // 6개 숫자 입력받기
        while (userNumbers.size() < 6) {
            int number = scan.nextInt();
            
            // 유효성 검사: 1과 45 사이의 숫자이며, 중복되지 않아야 한다.
            if (number >= 1 && number <= 45 && !userNumbers.contains(number)) {
            	userNumbers.add(number);  // 유효한 숫자만 리스트에 추가
            } else {
                System.out.println("잘못된 입력입니다. 1과 45 사이의 숫자만 입력하고, 중복된 숫자는 입력할 수 없습니다.");
            }
        }
        
        // 6개의 랜덤 숫자를 생성하여 리스트에 추가
        for (int i = 0; i < 6; i++) {
            int randomInt = rand.nextInt(45) + 1;  // 1 이상 45 이하의 랜덤 값
            // 랜덤 숫자도 중복되지 않도록 확인
            while (randNumbers.contains(randomInt)) {
                randomInt = rand.nextInt(45) + 1;
            }
            randNumbers.add(randomInt);  // 랜덤 숫자 추가
        }

        // 숫자들을 오름차순으로 정렬
        Collections.sort(userNumbers);
        Collections.sort(randNumbers);

        // 정렬된 숫자들을 출력
        System.out.println("입력한 숫자: " + userNumbers);
        System.out.println("랜덤 숫자: " + randNumbers);
        
     // 교집합 구하기: 입력한 숫자와 랜덤 숫자에서 일치하는 숫자 찾기
        List<Integer> commonNumbers = new ArrayList<>(userNumbers);  // userNumbers 리스트 복사
        commonNumbers.retainAll(randNumbers);  // 랜덤 숫자와 공통된 숫자만 남김

        // 일치하는 숫자 개수 출력
        System.out.println("일치하는 숫자 개수: " + commonNumbers.size());
        System.out.println("일치하는 숫자들: " + commonNumbers);
        
        scan.close();
    }
}
