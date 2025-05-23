package football;

public class MenuDrawer {
	
	public MenuDrawer() {
	
	}
	
	public void drawMainMenu() {
		System.out.println("=================================================");
		System.out.println("  1. 선수 등록   2. 선수 보기   3. 선수 삭제   4. 종료"  );
		System.out.println("=================================================");
	} // drawMainMenu()
	
	public void drawFootballPlayerListMenu() {
		System.out.println("=================================================");
		System.out.println("                       선수 목록                   ");
		System.out.println("=================================================");
	} // end drawFootballPlayerListMenu()
	
	public void drawFootballPlayerDeleteMenu() {
		System.out.println("=================================================");
		System.out.println("                       삭제 목록                   ");
		System.out.println("=================================================");
	} // end drawFootballPlayerDeleteMenu()
	
} // end class
