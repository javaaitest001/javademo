package java010_abstract_interface.prob.part02;

public class MotorBicycle implements IBicycle, IMotor {
    // 멤버변수 추가
    int id;
    String brand;
    
    // IBicycle에 있는 추상 메소드를 구현하세요
    public void prtInfo() {
        System.out.printf("ID : %d\nBrand : %s\nFrame Size : %d\nMotor Size : %d\n", id, brand, IBicycle.FrameSize_M, IMotor.Motor_Size_Large);
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void start() {
       System.out.println("## 모터 start!!");
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void stop() {
        System.out.println("## 모터 stop!!");
    }

}
