package chap_12;
class Car10 {
    protected String color;
    int speed;
}
class Sedan4 extends Car10 {
    void setSpeed(int speed){
        this.speed = speed;
    }
    void setColor(String color){
        this.color = color;
    }
}
public class Ex12_05 {
    public static void main(String[] args) {
        Sedan4 sedan1 = new Sedan4();

        sedan1.setSpeed(300);
        sedan1.setColor("빨강");
        System.out.println("승용차 속도 ==> " + sedan1.speed);
        System.out.println("승용차 색상 ==> " + sedan1.color);
    }
}
