//package student;
//
//public class StudentMain {
//	public static void main(String[] args) {
//		StudentService service = new StudentService();
//		
//		System.out.println("=========학생 점수 관리 프로그램=======");
//		
//		for(;;) {
//			try {
//				switch (StudentUtils.nextInt("1.등록 2. 조회 3.수정 4.삭제 5.과목별 평균 6. 석차순 조회 7. 종료 ")){ 
//					service.register();
//					break;				
//				case 2:
//					service.read();					
//					break;					
//				case 3:
//					service.modify();					
//					break;
//				case 4:
//					service.remove();					
//					break;
//				case 5:
//					service.allAvg();					
//					break;
//				case 6:
//					service.readOver();					
//					break;
//				case 7:
//					System.out.println(" bye~!");
//					return;
//					default:
//						break;				
//						System.out.println("지정된 범위의 숫자만 입력하시오");
//				}
//			}
//			catch(NumberFormatException e) {
//				System.out.println("정확한 숫자를 입력하시오");
//			}
//				catch(IllegalArgumentException e) {
//					System.out.println(e);
//			}
//		}
//	}
//}
//	
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
////		// 사용자로부터 문자열 입력을 받고 싶음
////		String str = StudentUtils.nextLine("값을 입력하세요 > ");
////		System.out.println(str);
////		
////		// 사용자로부터 숫자 입력을 받고 싶음
////		
////		System.out.println( StudentUtils.nextInt("숫자를 입력하세요 > "));
////		
//	