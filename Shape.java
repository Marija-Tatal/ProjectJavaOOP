package OOPJava;


    public interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }

 class Square implements Shape {
     private double side;

     public Square(double side) {
         this.side = side;
     }

     @Override
     public double calculateArea() {
         return side * side;
     }

     @Override
     public double calculatePerimeter() {
         return 4 * side;
     }


     public static void main(String[] args) {
         Circle c = new Circle(3.0);
         System.out.println("Area of circle: " + c.calculateArea());
         System.out.println("Perimeter of circle: " + c.calculatePerimeter());

         Square s = new Square(4.0);
         System.out.println("Area of square: " + s.calculateArea());
         System.out.println("Perimeter of square: " + s.calculatePerimeter());

     }

 }
