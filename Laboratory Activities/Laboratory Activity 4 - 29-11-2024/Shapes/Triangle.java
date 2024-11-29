public class Triangle implements Shape {
    private double a,b,c;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

        @Override
        public double getArea() {
            double t = (a + b + c) / 2;
            return Math.sqrt(t * (s - a) * (t - b) * (t - c));
        }

        @Override
        public double getPerimeter() {
            return a + b + c;
        }

        @Override
        public String printShapeType() {
            return "Triangle";
        }
}
