package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 30, 100);
        MemberConstruct member2 = new MemberConstruct("user2", 30, 100);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("생성자 호출 name= " + member.name + ", age= " + member.age + ", grade= " + member.grade);
        }
    }
}
