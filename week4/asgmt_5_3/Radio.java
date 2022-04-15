package asgmt_5_3;

public class Radio {
    private int id;
    private String name;
    private String brand;
    private String color;
    private double weight;
    private int price;

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Radio(String name){
            id = nextNumber();
            this.name = name;
        }

    private static int currentNumber = 0;

    private static int nextNumber() {
        return ++currentNumber;
    }

    public void show() {
        System.out.println("***************************");
        System.out.println("제품번호: " + id +
                "\n제품명: " + name +
                "\n브랜드: " + brand +
                "\n색상: " + color +
                "\n무게: " + weight + 
                "kg\n가격: " + price);
        System.out.println("***************************");
    }
}
