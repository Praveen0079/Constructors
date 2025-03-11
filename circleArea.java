public class circleArea {
    public class Circle{
        double radius;

        //default constructor
        Circle(){
            this.radius = 5.2;
        }

        //parameterized function
        Circle(double radius){
            this.radius = radius;
        }

        // method to calculate area or circle
        double AreaOfCircle(){
            double area = Math.PI*radius*radius;
            return area;
        }

        //display
        void display(){
            System.out.println(AreaOfCircle());
        }
    }
    public static void main(String[] args) {

    }
}
