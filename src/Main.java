public class Main {
    public static void main(String[] args) {

        Circle circleOne = new Circle();
        Circle circleTwo = new Circle(5.0);
        Circle circleThree = new Circle(3.7, "blue");

        System.out.println(circleThree.getColor());
        System.out.println(circleThree.getRadius());
        System.out.println(circleTwo.getArea());
        System.out.println(circleOne);


    }
}