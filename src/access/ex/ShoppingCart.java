package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        items[itemCount] = new Item(item.getName(), item.getPrice(), item.getQuantity());
        itemCount++;

        if (itemCount > 10){
            System.out.println("장바구니가 꽉 찼습니다.");
        }
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        int sum = 0;
        for(int i = 0; i < itemCount; i++){

            System.out.println("상품명: " + items[i].getName() + ", 합계: " + (items[i].getPrice() * items[i].getQuantity()));
            sum += (items[i].getPrice() * items[i].getQuantity());
        }
        System.out.println("전체 가격 합: " + sum);

    }
}
