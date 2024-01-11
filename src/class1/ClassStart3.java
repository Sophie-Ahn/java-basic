package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // Student 타입을 받을 수 있는 변수 선언
        student1 = new Student(); // Student 클래스 정보를 기반으로 새로운 객체를 생성
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 18;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
    }
}
