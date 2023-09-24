package Class21;

public class Car {

        // Instance variables
        private String model;
        private double price;
        private int quantity;

        // Constructor to initialize instance variables
        public Car(String model, double price, int quantity) {
            this.model = model;
            this.price = price;
            this.quantity = quantity;
        }

        // Method to calculate the total value of cars in stock
        public double carStockValue() {
            return price * quantity;
        }

        public static void main(String[] args) {
            // Create instances of Car
            Car car1 = new Car("Toyota Camry", 25000.0, 5);
            Car car2 = new Car("Honda Civic", 22000.0, 3);
            Car car3 = new Car("Ford Focus", 18000.0, 7);

            // Calculate the total value of cars in stock and print the result
            double totalValue = car1.carStockValue() + car2.carStockValue() + car3.carStockValue();
            System.out.println("Total Value of Cars in Stock: $" + totalValue);
        }
    }

