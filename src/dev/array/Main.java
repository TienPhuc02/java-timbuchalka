package dev.array;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] intArray =getRandomArray(5);
        System.out.println(Arrays.toString(intArray));
       int[] sortedResult =sortInteger(intArray);
        System.out.println(Arrays.toString(sortedResult));




    }
    private  static int[] getRandomArray(int len){
        int[] randomArray=new int[len];
        Random random =new Random();
        for(int i=0;i<len;i++){
            randomArray[i]=random.nextInt(1000);
        }
        return randomArray;
    }

    private static int[] sortInteger(int[] array){
        int[] sortedArray =Arrays.copyOf(array,array.length);
        boolean flag=true;
        int temp;
        while(flag){
            flag=false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
