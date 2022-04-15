package asgmt_5_3;

public class Rect {
    private int id;
    private String name;
    private String color;
    private double length;
    private int[] position;

    public double getArea(){
        double area = 0;
        area = length * length;
        return area ;
    } 

    public double getRound(){
        double round = 0;
        round = length * 4;
        return round ;
    } 

    public Rect(double length){
            id = nextNumber();
            this.length = length;
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
                "\n한 변의 길이: " + length + 
                "\n위치[x,y]: " + position);
        System.out.println("***************************");
    }
}
