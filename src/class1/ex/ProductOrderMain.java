package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;

        ProductOrder[] product = {dubu, kimchi, coke};
        int sum = 0;
        for(ProductOrder p : product){
            System.out.println("상품명: "+p.productName+", 가격: "+p.productName+", 수량: "+p.quantity);
            sum += p.price * p.quantity;
        }
        System.out.println("총 결제 금액: "+sum);




    }
}
