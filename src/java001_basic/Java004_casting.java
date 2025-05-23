package java001_basic;

public class Java004_casting {

	public static void main(String[] args) {
		byte bNum = 127; // -128 ~ 127
		short sNum = 32767; // -32768 ~ 32767
		int iNum = 2147483647; // -2,147,483,648 ~ 2,147,483,647
		long lNum = 9223372036854775807L;  // L or l -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		float fNum = 2.5f; // F or f(안붙이면 int 로 인식해서 에러)
		double dNum = 4.5;
		char cData = 'a';
		String sData = "A"; // String 은 대문자
		
		System.out.println("bNum=" + bNum);
		System.out.println("sNum=" + sNum);
		System.out.println("iNum=" + iNum);
		System.out.println("lNum=" + lNum);
		System.out.println("fNum=" + fNum);
		System.out.println("dNum=" + dNum);
		System.out.println("cData=" + cData);
		System.out.println("sData=" + sData);
		
		// 형변환(casting)
		// 1. 묵시적(자동) 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할때 발생
		// 2. 명시적(강제) 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할때 발생
		
		float tNum = (float)2.6; // 강제 형변환 double => float
		System.out.println("tNum=" + tNum);
		
		int kNum = 128;
		byte data = (byte)kNum;
		System.out.println("data=" + data); // byte는 127까지지만 강제변환 시 128도 출력됨 -> 데이터 손실 발생
			
	}

}
