package java.array;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray= new int[10];// khong the thay doi
//        myIntArray[0]=45.0;//error -> double
//        myIntArray[1]="1"; //error->string
         myIntArray[5] =50;

        double[] myDOubleArray=new double[10];
        myDOubleArray[2]=3.5;
        System.out.println(myDOubleArray[2]);//3.5

        int[] firstFivePositives =new int[]{1,2,3,4,5};
        int[] firstFivePositives1={1,2,3,4,5};//cach2
        System.out.println("first =" +firstFivePositives[0]);
        int arrayLength = firstFivePositives.length;
        System.out.println("firstFivePositive length of array "+  arrayLength);
//        System.out.println(firstFivePositives[arrayLength]);//error
        String[] names={"Phuc","Nam","hieu"};

        int[] newArray;
//        newArray = {5,4,3,2,1};//error
        newArray= new int[]{5,4,3,2,1};
        for(int i =0; i<newArray.length;i++){
            System.out.println(newArray[i]+ " ");
        }
    }


}
