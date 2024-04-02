public class Member {
	String FName;
	String lName;
	String country;
	int age;
	
	public Member() { this("티아고"); }
	public Member(String name) { this(name, 20); }
	public Member(String name, int age) {
		this(name, age, "브라질");
	}
	public Member(String name, int age, String country) {
		this.FName = name;
		this.age = age;
		this.country = country;
	}
	
	void printlnfo() {
		System.out.println("이름: " + this.FName);
		System.out.println("국적: " + this.country);
		System.out.println("나이: " + this.age);
	}
}
