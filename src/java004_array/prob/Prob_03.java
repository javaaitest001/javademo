package java004_array.prob;
/*
 * num배열의 합계와 평균을 구하는 프로그램을 구현하시오.
 *  출력결과
 *  합계: 243
 *  평균:  81
 */

public class Prob_03 {

	public static void main(String[] args) {
       int num[]=new int[]{60,95,88};
       int sum = 0;
       double avg;
       
       for(int i = 0; i < num.length; i++) {
    	   sum = sum + num[i];
       }
       avg = sum / (double) num.length;
       
       System.out.printf("합계 : %d\n평균 : %.1f\n", sum , avg);
      
       
	}//end main()

}//end class
