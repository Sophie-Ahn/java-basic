package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println(data.value1); // value1은 초기화를 하진 않았지만 자동으로 0으로 초기화를 해줌
        System.out.println(data.value2); // value2는 초기화 10으로 해놨음
    }
}
