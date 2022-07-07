package 자바의정석.ch10;
import java.util.Calendar;

class Ex10_4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2022, Calendar.AUGUST, 7);	// 2022 년 7월 7일

        System.out.println(toString(date));
        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 6달 전 =");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        // add와 달리 roll은 다른 필드에 영향을 주지 않는다.
        // 3월 3일에서 31일후면 무조건 월이 4월이 돼야 하지만 일수만 달라진다.
        // 이렇게 월에는 영향을 주지 않는다.
        System.out.println("= 31일 후(roll) =");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) =");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1)
                +"월 " + date.get(Calendar.DATE) + "일";
    }
}
