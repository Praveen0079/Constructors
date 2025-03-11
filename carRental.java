public class carRental {
    static class CarRental {
        String customerName;
        String carModel;
        int rentalDays;
        static final double DAILY_RATE = 1000.0; // Rental cost per day

        // Default constructor
        public CarRental() {
            this("Unknown", "Standard", 1);
        }

        // Parameterized constructor
        public CarRental(String customerName, String carModel, int rentalDays) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
        }

        // Method to calculate total rental cost
        public double calculateTotalCost() {
            return rentalDays * DAILY_RATE;
        }

        // Display rental details
        public void displayRentalInfo() {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Car Model: " + carModel);
            System.out.println("Rental Days: " + rentalDays);
            System.out.println("Total Cost: ₹" + calculateTotalCost());
        }


    }
    public static void main(String[] args) {
        // Using default constructor
        CarRental rental1 = new CarRental();
        rental1.displayRentalInfo();

        System.out.println();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Rahul Sharma", "Honda City", 5);
        rental2.displayRentalInfo();
    }

}
