package ISP;

public class Main {
	public static void main(String[] args) {
		SmartPhone sphone = new SmartPhone();
		FolderPhone fphone = new FolderPhone();
		
		sphone.call("010-3312-3739");
		sphone.message("010-3312-3739", "안녕");
		sphone.bluetooth();
		sphone.wifi();
		sphone.biometrics();
		System.out.println();
		
		fphone.call("010-3312-3739");
		fphone.message("010-3312-3739", "안녕");
	}
}
