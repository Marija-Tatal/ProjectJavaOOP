package OOPJava;


    class Car {
        protected double carPrice;
        protected String color;

        public Car(double carPrice, String color) {
            this.carPrice = carPrice;
            this.color = color;
        }

        public double calculateSalePrice() {
            return carPrice;
        }
    }

    class Truck extends Car {
        protected double weight;

        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        public double calculateSalePrice() {
            double salePrice;
            if (weight > 2000) {
                salePrice = carPrice * 0.9;
            } else {
                salePrice = carPrice * 0.8;
            }
            return salePrice;
        }
    }

    class Sedan extends Car {
        protected double length;

        public Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length = length;
        }

        public double calculateSalePrice() {
            double salePrice;
            if (length > 20) {
                salePrice = carPrice * 0.95;
            } else {
                salePrice = carPrice * 0.9;
            }
            return salePrice;
        }

        public static void main(String[] args) {
            Truck truck = new Truck(30000, "red", 2500);
            System.out.println("Sale price of the truck: " + truck.calculateSalePrice());

            Sedan sedan = new Sedan(20000, "blue", 18);
            System.out.println("Sale price of the sedan: " + sedan.calculateSalePrice());

        }

    }

