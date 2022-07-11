package 자바의정석.ch14;

import java.util.*;
import java.util.stream.*;

class Ex14_9 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr)
                .parallel() // 병렬 처리할 경우 여러 쓰레드가 나눠서 쓰기 때문에 요소 순서가 바뀌게 된다.
                .forEachOrdered(System.out::println); // 병렬처리를 하더라도 순서를 유지하고 싶으면 forEachOrdered
        boolean noEmptyStr = Stream.of(strArr)
                .noneMatch(s -> s.length() == 0); // 문자열 길이가 0인게 있나?

        Optional<String> sWord = Stream.of(strArr)
                .filter(s -> s.charAt(0) == 's') // 문자열 시작이 s인 것들만
                .findFirst();  // 첫 번째값만 반환

        System.out.println();
        System.out.println("noEmptyStr=" + noEmptyStr);
        System.out.println("sWord=" + sWord.get());

        // Stream<String>을 IntStream 으로 변환 -> mapToInt
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a,b) -> a + 1);
        int sum   = intStream2.reduce(0, (a,b) -> a + b);

        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);
        System.out.println();
        System.out.println("count="+count);
        System.out.println("sum="+sum);
        System.out.println("max="+ max.getAsInt());
        System.out.println("min="+ min.getAsInt());
    }
}
