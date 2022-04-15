package asgmt_5_3;

public class Circle {
    private int id;
    private String name;
    private String color;
    private double radius;
    private int[] position;

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPosition(int[] position){
        this.position = position;
    }

    public String getPosition(){
        String pos="";
        pos += position[0];
        pos += ", ";
        pos += position[1];
        return pos;
    }

    public double getArea(){
        double area = 0;
        area = radius * radius * 3.14;
        return area ;
    } 

    public double getRound(){
        double round = 0;
        round = 2 * 3.14 * radius;
        return round;
    }

    public Circle(double radius){
            id = nextNumber();
            this.radius = radius;
        }

    private static int currentNumber = 0;

    private static int nextNumber() {
        return ++currentNumber;
    }

    public void show() {
        System.out.println("***************************");
        System.out.println("원ID: " + id +
                "\n이름: " + name +
                "\n색상: " + color +
                "\n반지름: " + radius + 
                "\n위치[x,y]: " + getPosition());
        System.out.println("***************************");
    }
}
