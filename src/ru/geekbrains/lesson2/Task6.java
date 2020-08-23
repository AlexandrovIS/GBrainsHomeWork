package ru.geekbrains.lesson2;

public class Task6 {
    int[] arr ={10,10,10,2,3};
    public static void main(String[] args) {
        Task6 array=new Task6();
        array.myArray();
    }
    private void myArray(){
      int counter=0;
        for (int i = 0; i < arr.length - 1; i++) {
        int summ=0;
        counter = counter + arr[i];
          for (int j = arr.length - 1; j > 0; j--) {
          summ = summ + arr[j];
             if(summ==counter){
             System.out.println(true);
             }
          }
        }

    }

}
