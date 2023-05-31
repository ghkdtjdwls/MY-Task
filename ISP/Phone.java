package ISP;

public interface Phone {
	void call(String number);
	void message(String number, String text);
}

interface Bluetooth {
	void bluetooth();
}

interface Wifi {
	void wifi();
}

interface Biometricsable {
	void biometrics();
}
