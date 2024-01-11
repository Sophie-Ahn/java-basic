package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // nullPointerException;
        System.out.println("bigData.data.value = " + bigData.data.value);
        // 참조형값이 null임으로 nullpointer가 뜨는 => 예외발생
    }
}
