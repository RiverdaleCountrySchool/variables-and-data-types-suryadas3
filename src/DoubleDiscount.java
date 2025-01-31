public class DoubleDiscount {
    public static void main(String[] args) {

        double price = Double.valueOf(args[0]);
        double discount = Double.valueOf(args [1]);



        System.out.println ("The sale price is $" + (price - (discount * price)));

    }
}