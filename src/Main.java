public class Main {
    public static void main(String[] args) {

        Characteristics sale = new Characteristics();
        sale.price = 32;
        sale.tax = 2;
        sale.quantity = 9;
        System.out.println("I want to buy " + sale.quantity + " shirt!");
        sale.total = sale.price * sale.quantity * sale.tax;
        System.out.println("Total cost with tax is = " + sale.total);
    }
}