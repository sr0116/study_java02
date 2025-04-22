package lesson11;

import java.util.Locale.Category;

public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			throw new Exception("예외발생");
			}
	catch (Exception e) {
		//System.out.println(e.getMessage());
//		  e.printStackTrace();
		System.out.println(e);
		System.out.println(e.getMessage());
		  StackTraceElement[] ste = e.getStackTrace();
		  for(StackTraceElement st : ste) {
			  System.out.println(st.getLineNumber());
		  }
	}
	System.out.println("프로그램 종료");
	}
	static void m() throws Exception {
		System.out.println(1);
		throw new Exception("m의 예외");
	}
	static void m2() {
		try {
		m();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
