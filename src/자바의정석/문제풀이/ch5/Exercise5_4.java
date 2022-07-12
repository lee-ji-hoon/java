package 자바의정석.문제풀이.ch5;

class Exercise5_4 {

    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };
        int total = 0;
        float average = 0;
        /*
        (1) . 알맞은 코드를 넣어 완성하시오
        */
        int width = arr[0].length;
        int height = arr.length;

        for (int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                total += arr[i][j];

        average =  total / (float)(width * height);

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    } // end of main
} // end of class