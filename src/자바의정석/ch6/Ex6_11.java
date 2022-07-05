package 자바의정석.ch6;

class Data_1{
    int value;
}
class Data_2{
    int value;
    public Data_2(int value){
        this.value = value;
    }
}
public class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1(); // 기본 생성자 자동 생성
        Data_2 d2 = new Data_2(5); // 기본생성자가 아닌 우리가 커스텀한 생성자의 규격에 맞춰서 생성해야 한다.
    }
}
