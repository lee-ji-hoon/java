package 자바의정석.ch8;

import java.io.*;

class Ex8_10 {
    public static void main(String[] args) {
        File f = createFile("ljh");
        System.out.println( f.getName()+"파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        // 떠넘기지 않고 본인이 처리하는 경우
        try{
            if (fileName==null || fileName.equals(""))
                throw new Exception();
        } catch (Exception e){
            fileName = "제목없음.txt";
        }

        //  File클래스의 객체를 만든다.
        File f = new File(fileName);
        try {
            // File객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return f;
    }
}