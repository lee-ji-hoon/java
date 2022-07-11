package 자바의정석.ch14;

import java.util.*;

class Ex14_8 {
    public static void main(String[] args) {
        Optional<String>  optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(s -> s.length());
        System.out.println("optStr=" + optStr.get());
        System.out.println("optInt=" + optInt.get());

        int result1 = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).get();

        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result3=%d%n", x));

        OptionalInt opt = OptionalInt.of(0); // 0을 저장
        OptionalInt opt2 = OptionalInt.empty(); // 빈값인 0을 저장
        // 위 opt opt2를 어떻게 비교하기?
        // isPresent로 비교!
        System.out.println(opt.isPresent()); // true
        System.out.println(opt2.isPresent()); // false
        System.out.println(opt.getAsInt());  // 0

//		System.out.println(optInt2.getAsInt());  // NoSuchElementException
        System.out.println("optInt1=" + opt);
        System.out.println("optInt2=" + opt2);
        System.out.println("optInt1.equals(optInt2)?" + opt.equals(opt2));
    }
}
