package lesson05;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// 콘솔을 통한 값 입력
		Scanner scanner = new Scanner(System.in) ; //클래스라서 대문자 변수라서 소문자
		
		
		System.out.println("시험 점수 입력>");
		int score = scanner.nextInt();
	
		
		System.out.println("시험 시작");
		
		if(score >= 60) {
			System.out.println("합격입니다.");
		}
		else {System.out.println("불합격 입니다");}
		
		
		System.out.println("시험 끝");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
