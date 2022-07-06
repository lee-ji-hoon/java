package 자바의정석.ch7;

abstract class Unit2{
    int x, y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈추겠습니다.");
    }
}

interface Fightable{
    void move(int x, int y); // public abstract 생략
    void attack(Fightable f); // public abstract 생략
}

class Fighter extends Unit2 implements Fightable{
    // 만약 public을 제거한다면??
    // 기본 default가 들어가기 때문에 default는 public 보다 접근 권한이 더 낮다(더 빡세다!, 더 좁다!)
    // 그러므로 오류가 생기기 때문에 public을 꼭 작성해줘야한다.
    // 항상 Override하는 메서드의 접근 제어자가 좁아서는 안된다.
    @Override
    public void move(int x, int y) {
        System.out.println("["+x+","+y+"]로 이동");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println(f + "를 공격");
    }

    Fightable getFightable() {
        // new Fighter()를 반환할 수 있는 이유는
        // 자동 형변환을 해주기 때문이다.
        // Fightable을 부모로 Fighter를 자손으로 생각하면
        // 자손 -> 부모로 가기 때문에 같거나 더 축소되기에 형변환에 문제가 없다
        return new Fighter();
    }
}
public class FighterTest {
    public static void main(String[] args) {
        Unit2 u = new Fighter();
        // attack이 없기에 불가능
        u.move(100, 200);
//        u.attack(new Fighter());
        u.stop();

        Fightable f = new Fighter();
        // stop이 없기에 불가능
        f.move(100, 200);
        f.attack(new Fighter());
//        f.stop();

        Fighter fi = new Fighter();
        // 실제 인스터스는 Fighter를 가리키고 있음
        Fightable fightable = fi.getFightable();

        fi.move(100, 200);
        fi.attack(new Fighter());
        fi.stop();
    }
}
