package java007_class.prob.part04;
/* 1 display()메소드에서 code별 가격합계를 구현하는 프로그램을 구현하시오.
 * 
 * 2 출력결과
 *   컴퓨터 75000
 *   소설   25000
 * 
 */
public class Prob04_class {

	public static void main(String[] args) {
		BookShop[] shop=new BookShop[5];
		shop[0]=new BookShop("Java의 정석","컴퓨터",20000);
		shop[1]=new BookShop("나그네","소설",10000);
		shop[2]=new BookShop("실무에 바로쓰는 엑셀","컴퓨터",25000);
		shop[3]=new BookShop("초인","소설",15000);
		shop[4]=new BookShop("웹구현 JSP","컴퓨터",30000);
		display(shop);
		
		}//end main()	
		
		public static void display(BookShop[] shop){
	      //code별 가격 합계를 구하는 프로그램을 구현하시오.
			int sumComputer = 0;
			int sumNovel = 0;
			String codeName1 = "";
			String codeName2 = "";
			
			for(int i = 0; i < shop.length; i++) {
				if(shop[i].code == "컴퓨터") { 
					sumComputer += shop[i].price;
					codeName1 = shop[i].code;
				}else if(shop[i].code == "소설") {
					sumNovel += shop[i].price;
					codeName2 = shop[i].code;
				}else
					System.out.println("존재하지 않는 코드입니다.\n");
			}
			
			System.out.printf("%s %d\n", codeName1, sumComputer);
			System.out.printf("%s %d\n", codeName2, sumNovel);
			
			
		}//end display()

}//end class