package dev.array;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] newArray= getRandomArray(10);
        System.out.println(Arrays.toString(newArray));
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));

        int[] secondArray =new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));


        int[] thirdArray=getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        int[] fourthArray=Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray=Arrays.copyOf(thirdArray,5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray=Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(largerArray));
    }
    private static int[] getRandomArray(int len){
        Random random =new Random();
        int[] intArray=new int[len];
        for(int i=0;i<len;i++){
            intArray[i]=random.nextInt(100);
        }
        return intArray;
    }


}
