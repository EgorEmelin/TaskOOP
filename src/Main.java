import java.util.Arrays;
/*
    В реализациях классов не добавлена проверка на ввод правильности данных, так как по сути нет интерфейса для ввода.
    В случае необходимости я бы создал класс, наследующий исключения, который описывает исключение для неверно введенных
    данных. В конструкторах была бы проверка, котрая могла бы создавать объекты этого исключения, которые обрабатывались
    в Main в конструкции try-catch. Этот блок будет находиться в цикле while по переменной, которая при вводе становится
    false, а в catch - true. это позволит находиться в вводе, пока не будут введены верные данные.
    Можно прокомментировать насколько это эффективно, или как можно сделать иначе?
*/
public class Main {
    public static void main(String[] args) {

        Circle circleOne = new Circle();
        Circle circleTwo = new Circle(5.0);
        Circle circleThree = new Circle(3.7, "blue");

        System.out.println(circleThree.getColor());
        System.out.println(circleThree.getRadius());
        System.out.println(circleTwo.getArea());
        System.out.println(circleOne);

        Rectangle rectOne = new Rectangle();
        Rectangle rectTwo = new Rectangle(5f,6.5f);
        System.out.println(rectOne);
        System.out.println("Area: " + rectTwo.getArea() + ", Perimetr: " + rectTwo.getPerimetr());

        Employee empOne = new Employee(1, "Egor", "Emelin", 1000);
        System.out.println(empOne);
        System.out.println("Annual salary: " + empOne.getAnnualSalary() + ", getName: "
                + empOne.getName() + ", Rise salary: " + empOne.raiseSalary(13));

        Author authorOne = new Author("Oleg","oleg@email.ru",'m');
        Author authorTwo = new Author("Olga","olga@email.ru",'w');
        Author authorThree = new Author("Victor","victor@email.ru",'m');
        System.out.println(authorOne + ", " + authorTwo);
        Author authorsOne[] = {authorOne, authorTwo, authorThree};
        Author authorsTwo[] = {authorOne, authorTwo};

        Book bookOne = new Book("First", authorsOne, 1000, 2);
        Book bookTwo = new Book("Second", authorsTwo, 2000);
        System.out.println(bookOne);
        System.out.println(bookTwo.getAuthorNames());

        MyPoint pointOne = new MyPoint();
        MyPoint pointTwo = new MyPoint(2,5);
        MyPoint pointThre = new MyPoint(4,4);
        System.out.println(pointTwo);
        System.out.println(Arrays.toString(pointOne.getXY()) + ", Distance (3, 4): " + pointOne.distance(3,4) +
                ", Distance (2, 5): " + pointOne.distance(pointTwo) + ", Distance: " + pointOne.distance());

        MyTriangle triangleOne = new MyTriangle(pointOne,pointTwo,pointThre);
        MyTriangle triangleTwo = new MyTriangle(1,3,2,1,5,6);
        System.out.println(triangleOne + "   " + triangleTwo);
        System.out.println(triangleOne.getPerimetr());
        System.out.println(triangleTwo.getType());

    }
}