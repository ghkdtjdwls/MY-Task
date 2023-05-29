package OCP;

public class Video_Player {
	public Video_Player(playCodec pc) {
		setCodec(pc);
	}
	public void setCodec(playCodec pc) {
		pc.play();
	}
	public void start() {
		System.out.println("비디오가 실행됩니다.\n");
	}

}
