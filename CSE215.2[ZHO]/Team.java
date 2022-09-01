package Mid;

public class Team {

	private Player player[];

	public Team(int size) {

		player = new Player[size];

	}

	public addPlayer(Player p, int index) {

        player[index] = p;

    }

	class Player {

		private String name;

		private String position;

		Player(String n, String p) {

			name = n;
			position = p;

		}
	}
}