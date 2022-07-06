package 자바의정석.ch7;

class Point extends Object{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // toString 재정의
    public String toString() {
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point{
    int z;

//    public Point3D(int x, int y, int z){
//        // super(); 항상 첫줄에는 생성자를 호출하기 때문에 오류가 난다.
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }

    // 부모 클래스의 생성자가 존재할 경우 항상 super()를 사용해서 생성자를 호춣해서 초기화 및 선언을 해주자.
    public Point3D(int x, int y, int z){
       super(x, y);
       this.z = z;
    }
}


public class OverrideTest {
    public static void main(String[] args) {
        Point p = new Point(3, 5);
        System.out.println("p.toString = " + p.toString());
    }
}
