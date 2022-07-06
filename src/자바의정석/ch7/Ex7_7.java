package 자바의정석.ch7;


public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // 형변환 자식 -> 부모
//        car.water()
        fe2 = (FireEngine) car; // 형변환 부모 -> 자손
        fe2.water();

        Car car2 = new Car();
        // car2의 실제 인스턴스는 Car이기 때문에 FireEngine으로 형변환을 시도할 경우 오류가 나게 된다.
        FireEngine fireEngine = (FireEngine) car2; // 형변환 에러 발생
        fireEngine.water();
    }
}

class Car{
    String color;
    int door;

    void drive(){
        System.out.println("자동차 동작");
    }
    void stop(){
        System.out.println("자동차 멈춤");
    }
}


class FireEngine extends Car {	// 소방차
    void water() {	// 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}
