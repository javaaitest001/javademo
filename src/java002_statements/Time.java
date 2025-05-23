package java002_statements;

public class Time {

	public static void main(String[] args) {
        // 광속에 대한 속도 비율 (예: 0.9999999999c)
        double v = 0.9999999999;

        // 지구 기준에서 우주 끝까지 걸리는 시간 (단위: 년)
        double earthTimeYears = 46_000_000_000.0; // 460억 년

        // 감마 (γ) 계산: 1 / sqrt(1 - v^2)
        double gamma = 1 / Math.sqrt(1 - Math.pow(v, 2));

        // 탑승자가 느끼는 시간 = 지구 시간 / 감마
        double travelerTime = earthTimeYears / gamma;

        // 결과 출력
        System.out.printf("속도: %.10fc\n", v);
        System.out.printf("지구 시간: %.0f 년\n", earthTimeYears);
        System.out.printf("탑승자 체감 시간: %.2f 년\n", travelerTime);

	}

}
