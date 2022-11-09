package retraining.collection;

public class Ipl {

	public static void main(String[] args) {
		Player p1 = new Player();
		p1.setPlayerId(1);
		p1.setPlayerName("Virat kohli");

		Player p2 = new Player();
		p2.setPlayerId(2);
		p2.setPlayerName("Rohit sharma");

		Player p3 = new Player();
		p3.setPlayerId(3);
		p3.setPlayerName("Rahul KL");

		Player[] p = new Player[3];
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;

		Ipl ipl = new Ipl();
		ipl.displayPlayer(p);
	}

	public void displayPlayer(Player[] player) {
		System.out.println(player[0].getPlayerId() + " " + player[0].getPlayerName());
		System.out.println(player[1].getPlayerId() + " " + player[1].getPlayerName());
		System.out.println(player[2].getPlayerId() + " " + player[2].getPlayerName());
		System.out.println(player[0].toString());

	}
}
