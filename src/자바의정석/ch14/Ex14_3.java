package 자바의정석.ch14;

import java.util.function.*;

class Ex14_3 {
    public static void main(String[] args) {
        // 16진수로 변환
        Function<String, Integer>	f  = (s) -> Integer.parseInt(s, 16);
        // 2진수로 변환
        Function<Integer, String>	g  = (i) -> Integer.toBinaryString(i);

        // function 하나로 합치기
        Function<String, String>    h  = f.andThen(g);
        // f에서 String이 들어가서 Integer가 나온다.
        // g에서 Integer이 들어와서 String이 나온다.
        // 즉 합칠려면 앞에꺼 출력이 뒤에꺼 입력과 타입이 같아야만 한다.

        Function<Integer, Integer>  h2 = f.compose(g); // g.andThen(f)

        System.out.println(h.apply("FF")); // "FF" → 255 → "11111111"
        System.out.println(h2.apply(2));   // 2 → "10" → 16

        // x가 들어가면 x가 나온다.
        Function<String, String> f2 = x -> x; // 항등 함수(identity function)
        System.out.println(f2.apply("AAA"));  // AAA가 그대로 출력됨

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;

        Predicate<Integer> notP = p.negate();        // !(i < 100)-> i >= 100
        Predicate<Integer> all = notP.and(q).or(r);  // i >= 100 && i < 200 || i % 2 == 0
        Predicate<Integer> all2 = notP.and(q.or(r)); // i >= 100 && (i < 200 || i % 2 == 0)
        System.out.println("all.test(150) = " + all.test(150)); // true
        System.out.println("all2.test(200) = " + all.test(251)); // false

        String str1 = "abc";
        String str2 = "abc";

        // str1과 str2가 같은지 비교한 결과를 반환
        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        System.out.println(result);
    }
}
