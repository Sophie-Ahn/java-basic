package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstrucInit construcInit1 = new ConstrucInit(10);
        ConstrucInit construcInit2 = new ConstrucInit(20);
        System.out.println(construcInit1.value);
        System.out.println(construcInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
