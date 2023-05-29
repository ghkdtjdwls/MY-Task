package LSP;

public class Main {
	public static void main(String[] args) {
		LecturerNight lect01 = new LecturerNight();
		lect01.Lecturer();
		
		LecturerNomal lect02 = new LecturerNomal();
		lect02.Lecturer();
		
		Lecturer lect03 = new LecturerNight();
		lect03.Lecturer();
		
		Lecturer lect04 = new LecturerNomal();
		lect04.Lecturer();
	}

}
