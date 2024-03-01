package dev.array;

public class Main {

    public static void main(String... args) {

        System.out.println("hello world again");
        String[] splitStrings="Hello World Again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));

        printText("Hello");

        System.out.println("_".repeat(20));

        printText("Hello","World","Again");
        System.out.println("_".repeat(20));

        printText();


        String[] sArray={"Guma","Keria","Feker","Zues","Oner"};
        System.out.println(String.join(",",sArray));
    }
    public static void printText(String... textlist){
        for(String t : textlist){
            System.out.println(t);
        }
    }
}
