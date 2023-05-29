package OCP;

public class Main {
	public static void main(String[] args) {
		Video_Player player = new Video_Player(new MP4());
		player.start();
		player.setCodec(new MP21());
		player.start();
	}
}
