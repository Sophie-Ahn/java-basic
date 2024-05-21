package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age){
        // 중복되는 값이 있으면 this()로 씀으로써 코드를 줄일 수 있다.
        this(name, age, 50); // 변경
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name= " + name + ", age= " + age + ", grade= " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
