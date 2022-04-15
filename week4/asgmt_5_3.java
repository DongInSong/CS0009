import asgmt_5_3.Bicycle;
import asgmt_5_3.Circle;

public class asgmt_5_3 {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("buru");
        bicycle.setBrand("new brand");
        bicycle.setColor("Yellow");
        bicycle.setPrice(100000);
        bicycle.setWeight(10.5);
        bicycle.show();

        Circle circle = new Circle(5.5);
        int[] position = {1,2};
        circle.setColor("Red");
        circle.setName("Circle 1");
        circle.setPosition(position);
        circle.show();
        System.out.println("원 넓이: " + circle.getArea() + "\n원 둘레: " + circle.getRound());
    }
}
