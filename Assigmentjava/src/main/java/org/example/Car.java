package org.example;

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public double getSalePrice() {
        return regularPrice;
    }

    class Truck extends Car{
        private int weight;

        public Truck(int speed, double regularPrice, String color, int weight) {
            super(speed, regularPrice, color);
            this.weight = weight;
        }

        public double getSalePrice() {
            return super.getSalePrice() * (weight > 2000 ? 0.85 : 0.75);
        }
        class Ford extends Car{
            private int year;
            public int manufacturerDiscount;

            public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
                super(speed, regularPrice, color);
                this.year = year;
                this.manufacturerDiscount = manufacturerDiscount;
            }

            public double getSalePrice() {
                return super.getSalePrice() - manufacturerDiscount;
            }

        }
    }
    class Sedan{
        private int length;

        public Sedan(int speed, double regularPrice, String color, int length) {
            super(speed, regularPrice, color);
            this.length = length;
        }

        public double getSalePrice() {
            return super.getSalePrice() * (length < 20 ? 0.9 : 0.85);
        }

    }
    public class MyOwnAutoStop{
        public static void main(String[] args) {
            Truck truck = new Truck(89,500,"red",12);
            Ford ford = new Ford(23,5600,"black",15);
            Sedan sedan = new Sedan(133,3600,"white",1000);
            System.out.println("truck"+Truck.);
        }
    }

}
