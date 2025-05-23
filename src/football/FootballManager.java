package football;

public class FootballManager {
	MenuDrawer draw = new MenuDrawer();
	FootballRepository repository = new FootballRepository();
	InputReader inputReader = new InputReader();

	public FootballManager() {

	}

	public FootballManager(MenuDrawer draw, FootballRepository repository, InputReader inputReader) {
		this.draw = draw;
		this.repository = repository;
		this.inputReader = inputReader;
	}

	public void run() {
		while (true) {
			draw.drawMainMenu();

			int selectNum = inputReader.inputNum();

			switch (selectNum) {
			case 1:
				repository.addFootballPlayer(inputReader, repository.getFootballTeamList());
				break;
			case 2:
				draw.drawFootballPlayerListMenu();
				if (repository.getFootballTeamList().isEmpty())
					System.out.println("등록된 선수가 없습니다.");
				repository.displayFootballPlayerList(repository.getFootballTeamList());
				break;
			case 3:
				draw.drawFootballPlayerDeleteMenu();
				if (repository.getFootballTeamList().isEmpty()) {
					System.out.println("현재 선수가 등록되어 있지 않습니다.");
					break;
				}

				repository.displayFootballPlayerListName(repository.getFootballTeamList());
				while (true) {
					int deleteNum = inputReader.inputNum("삭제할 선수를 선택하세요. (뒤로가기 0번)");

					if (deleteNum == 0) {
						break;
					} else if (deleteNum >= 1 && repository.getFootballTeamList().size() >= deleteNum) {
						repository.deleteFootballPlayer(repository.getFootballTeamList(), deleteNum);
						break;
					} else {
						System.out.println("잘못된 번호입니다. 다시 선택해 주세요.");
						repository.displayFootballPlayerListName(repository.getFootballTeamList());
					}
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 선택해 주세요.");
				break;
			}
		}
	} // end run()
} // end class
