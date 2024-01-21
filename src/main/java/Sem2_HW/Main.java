package Sem2_HW;

public class Main {
    public static void main(String[] args) {
    task3();
    }

    public static void task1(){
//        1. Написать метод, возвращающий количество чётных элементов массива.
//        countEvens([2, 1, 2, 3, 4]) → 3
//        countEvens([2, 2, 0]) → 3
//        countEvens([1, 3, 5]) → 0
        
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                summ ++;
            }
        }
        System.out.println(summ);
    }
    public static void task2(){
//        2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
//        переданного не пустого массива.

        int[] arr = {3,6,7,8,12,13};
        int max = arr[0];
        int min = arr[0];;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(max - min);
    }
    public static void task3(){
//        3. Написать функцию, возвращающую истину, если в переданном массиве есть два
//        соседних элемента, с нулевым значением.

        int[] arr = {1,2,3,0,4,5,0,0,7,8,2,2};
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i] && arr[i] == 0){
                System.out.println(true);
                return;
            }
        }

    }
}
