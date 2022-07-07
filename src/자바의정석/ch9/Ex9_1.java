package 자바의정석.ch9;

import java.util.Objects;

class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    } // main
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof  Value))
            return false;
        Value v  = (Value) obj;
        return this.value == v.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
