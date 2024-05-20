package construct;

public class MemberThis {
    String nameField;

    void initMember (String nameParameter){
        // nameField와 nameParameter 변수명이 다르기 때문에 this 생략가능
        nameField = nameParameter;
    }
}
