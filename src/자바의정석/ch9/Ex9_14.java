package 자바의정석.ch9;

class Ex9_14 {
    public static void main(String[] args) {
        Integer i  = new Integer(100); // 서로 다른 주소값을 가지고 있다.
        Integer i2 = new Integer(100);

        System.out.println("i==i2 ? " + (i == i2)); // false 주소값 비교이므로 다르다.
        System.out.println("i.equals(i2) ? " + i.equals(i2)); // true -> 재정의 돼있다.
        System.out.println("i.compareTo(i2)=" + i.compareTo(i2)); // 0 같다. 왼쪽이 작으면 -1 크면 + 1
        System.out.println("i.toString()=" + i.toString()); // 100

        System.out.println("MAX_VALUE=" + Integer.MAX_VALUE); // 2147483647
        System.out.println("MIN_VALUE=" + Integer.MIN_VALUE); // -2147483648
        System.out.println("SIZE=" + Integer.SIZE + " bits"); // 32bits
        System.out.println("BYTES=" + Integer.BYTES + " bytes"); // 4bytes
        System.out.println("TYPE=" + Integer.TYPE); // int
    }
}
