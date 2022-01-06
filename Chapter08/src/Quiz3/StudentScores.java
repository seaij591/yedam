package Quiz3;

public class StudentScores {
	// 필드
	private String name;
	private int cass;
	private int korean;
	private int English;
	private int Math;

	// 메서드

	public StudentScores(String name, int cass) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCass() {
		return cass;
	}

	public void setCass(int cass) {
		this.cass = cass;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public int getTotal() {
		int StudentScores = 0;
		StudentScores = korean + English + Math;
		return StudentScores;
	}

	public double getAverage() {

		return getTotal() / 3.0;
	}
}
