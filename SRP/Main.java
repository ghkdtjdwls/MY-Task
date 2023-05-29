package SRP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("메뉴를 선택하세요... 1. 수강관리  2. 성적관리");
		input = sc.nextInt();
		switch(input){
		case 1:
			CourseManagement cm = new CourseManagement();
			System.out.println("메뉴를 선택하세요... 1. 수강신청  2. 시간표조회  3. 개설과목조회");
			input = sc.nextInt();
			switch(input) {
			case 1:
				cm.courseRegistration();
				break;
			case 2:
				cm.timetableCheck();
				break;
			case 3:
				cm.establishedCoursesCheck();
				break;
			}
			break;
		case 2:
			ScoreManagement sm = new ScoreManagement();
			System.out.println("메뉴를 선택하세요... 1. 성적입력  2. 성적조회  3. 누적성적조회");
			input = sc.nextInt();
			switch(input) {
			case 1:
				sm.scoreInput();
				break;
			case 2:
				sm.scoreCheck();
				break;
			case 3:
				sm.allScoreCheck();
				break;
			}
		}
	}

}
