package Sem2;

public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task1(){
        int[] arr = {1,2,3,4,5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static void task2(){
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void task3(){
        int[] arr = {1,2,3,6};
        int summFirstPartOfArr = 0;
        for (int i = 0; i < arr.length; i++) {
            int summSecondPartOfArr = 0;
            summFirstPartOfArr = summFirstPartOfArr + arr[i];
//            System.out.println("1: " + summFirstPartOfArr);
            for (int j = i + 1; j < arr.length ; j++) {
                summSecondPartOfArr = summSecondPartOfArr + arr[j];
//                System.out.println("2: " + summSecondPartOfArr);
            }
            if (summFirstPartOfArr == summSecondPartOfArr){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);

    }
    public static void task4(){

    }
}


