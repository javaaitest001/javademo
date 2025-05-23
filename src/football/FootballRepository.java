package football;

import java.util.ArrayList;

public class FootballRepository {
	private ArrayList<FootballPlayer> playerList = new ArrayList<FootballPlayer>();

	public FootballRepository() {

	}

	public void addFootballPlayer(InputReader inputScanner, ArrayList<FootballPlayer> playerList) {
		String playerName = inputScanner.inputMessage("선수 이름을 입력하세요.");
		String playerTeam = inputScanner.inputMessage("선수가 뛸 팀을 입력하세요.");
		int playerBackNumber = inputScanner.inputNum("등번호를 입력하세요. (0 ~99)");
		
		FootballPlayer newFootballPlayer = new FootballPlayer(playerName, playerTeam, playerBackNumber);
		playerList.add(newFootballPlayer);
		System.out.println("새로운 선수가 등록되었습니다.");
	} // end addFootballPlayer()

	public void deleteFootballPlayer(ArrayList<FootballPlayer> playerList, int index) {

		int realIndex = index - 1;
		if (isValid(playerList, realIndex)) {
			playerList.remove(realIndex);
			System.out.println("선택한 선수가 삭제되었습니다.");
		} else {
			System.out.println("잘못된 번호입니다. 다시 입력해 주세요.");
		}
	} // end deleteFootballPlayer()

	public void displayFootballPlayerList(ArrayList<FootballPlayer> playerList) {
		for (int i = 0; i < playerList.size(); i++) {
			System.out.println("선수 이름:" + playerList.get(i).getPlayerName());
			System.out.println("팀 이름:" + playerList.get(i).getPlayerTeam());
			System.out.println("등번호:" + playerList.get(i).getPlayerBackNumber());
			System.out.println();
		}
	} // end displayFootballPlayerList()

	public void displayFootballPlayerListName(ArrayList<FootballPlayer> playerList) {
		for (int i = 0; i < playerList.size(); i++) {
			System.out.printf("%d. %s\n", i + 1, playerList.get(i).getPlayerName());
		}
	} // end displayFootballPlayerListName()

	public boolean isValid(ArrayList<FootballPlayer> playerList, int index) {
		if (index >= 0 && index < playerList.size() && playerList.get(index).getPlayerName() != null)
			return true;
		else
			return false;
	} // end isVaild()

	public ArrayList<FootballPlayer> getFootballTeamList() {
		return this.playerList;
	}

	public void setFootballTeamList(ArrayList<FootballPlayer> playerList) {
		this.playerList = playerList;
	}

} // end class
