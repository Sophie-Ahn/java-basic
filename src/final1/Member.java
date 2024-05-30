package final1;

public class Member {
    private final String id; // final 키워드사용
    private String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }

    public void changeData(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("id: " + id + " name: " + name);
    }
}
