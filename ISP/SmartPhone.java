package ISP;

public class SmartPhone implements Phone, Bluetooth, Wifi, Biometricsable {
	public void call(String number) {
		System.out.println(number+"에게 전화를 겁니다.");
	}
	
	public void message(String number, String text) {
		System.out.println("수신자 : " + number);
		System.out.println("전송 메시지 : " + text);
	}
	
	public void bluetooth() {
		System.out.println("블루투스를 켭니다.");
	}
	
	public void wifi() {
		System.out.println("와이파이를 켭니다.");
	}
	
	public void biometrics() {
		System.out.println("생체 인식 기능을 사용합니다.");
	}

}

class FolderPhone implements Phone {
	public void call(String number) {
		System.out.println(number+"에게 전화를 겁니다.");
	}
	
	public void message(String number, String text) {
		System.out.println("수신자 : " + number);
		System.out.println("전송 메시지 : " + text);
	}
}
