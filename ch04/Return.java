package ch04;

public class Return {
    public static void main(String[] args) {
        System.out.println(calcTax(( int ) 1.99999999));
    }
    public static int calcTax(int price) {
        int calcPrice = (int) (price * 1.1);
        return calcPrice;
    }
}