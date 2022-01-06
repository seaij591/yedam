package Quiz3;

public class MainExample {

	//문제3) 다음을 만족하는 클래스 StudentScores를 작성하시오.
	//		-필드로 학생이름(String), 학급(int),
	//		 국어점수(int), 영어점수(int), 수학점수(int)를 가진다.
	//		-기본 생성자는 없으며
	// 		-생성자를 통해 핵생이름과 학급을 저장한다.
	//		-메서드는 다음과 같이 구성된다.
	//		1) 각 필드별 gerrer와 setter
	//		2) 메서드 getTotal()은 모든 과목의 점수를 더한 총합을 반환한다.
	//		3) 메서드 getAverage()은 모든 과목의 점수의 평균을 반환한다.
	public static void main(String[] args) {
		
	StudentScores studenthong = new StudentScores("홍길동",1);
	studenthong.setKorean(100);
	studenthong.setEnglish(60);
	studenthong.setMath(76);
	
	System.out.println("학생 " + studenthong.getName() + "의 총 점수는 "+
			studenthong.getTotal() + "이고, 평균은 " 
			+ studenthong.getAverage() + "입니다.");
	}
}
