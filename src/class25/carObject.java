package class25;

public class carObject {
    String model;
    int price;
    int quantity;

    carObject(String model, int price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;

    }

    void carStockValue() {
        double totalValue = price * quantity;
        System.out.println(model + " 2019 Stock Value " + totalValue);
    }

    class Main {
        public static void main(String[] args) {
            carObject toyota = new carObject("Toyota", 25000, 1000);
            carObject bmw = new carObject("BMW", 65298, 10);
            toyota.carStockValue();
            bmw.carStockValue();
        }
    }
}
