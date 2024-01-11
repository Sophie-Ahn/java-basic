package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] order = new ProductOrder[3];
        order[0] = createOrder("두부", 2000, 2);
        order[1] = createOrder("김치", 5000, 1);
        order[2] = createOrder("콜라", 1500, 2);

        printOrders(order);
        int totalCost = getTotalAmount(order);
        System.out.println("총 결제 금액: " + totalCost);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        // 배열을 받아 배열에 들어있는 전체 ProductOrder의 상품명, 가격, 수량 출력
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        // 배열을 받아 전체 ProductOrder의 총 결제 금액을 계산하고 결과 반환
        int totalCost = 0;
        for (int i = 0; i < orders.length; i++) {
            totalCost += orders[i].price * orders[i].quantity;
        }

        return totalCost;
    }
}
