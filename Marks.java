package OOPJava;


    abstract class Marks {
        abstract double getPercentage();
    }

    class A extends Marks {
        private double marks1;
        private double marks2;
        private double marks3;

        public A(double m1, double m2, double m3) {
            marks1 = m1;
            marks2 = m2;
            marks3 = m3;
        }

        public double getPercentage() {
            return (marks1 + marks2 + marks3) / 3;
        }
    }

    class B extends Marks {
        private double marks1;
        private double marks2;
        private double marks3;
        private double marks4;

        public B(double m1, double m2, double m3, double m4) {
            marks1 = m1;
            marks2 = m2;
            marks3 = m3;
            marks4 = m4;
        }

        public double getPercentage() {
            return (marks1 + marks2 + marks3 + marks4) / 4;
        }

        public static void main(String[] args) {
            A a = new A(70, 80, 90);
            System.out.println("Percentage of student A: " + a.getPercentage());

            B b = new B(60, 70, 80, 90);
            System.out.println("Percentage of student B: " + b.getPercentage());

        }
    }


