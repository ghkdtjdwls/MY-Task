package DIP;

public class Main {
	public static void main(String[] args) {
		GameServer gameserver = new GameServer();
		gameserver.Game_Play(new SuperMario());
		gameserver.Game_Play(new LOL());
	}

}
