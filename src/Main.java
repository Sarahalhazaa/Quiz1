import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

////Q1------------------------------------------------
//        System.out.println(" Enter number1 :");
//        int num1 = scanner.nextInt();
//        System.out.println(" Enter number2 :");
//        int num2 = scanner.nextInt();
//        System.out.println(" Enter number3 :");
//        int num3 = scanner.nextInt();
//                max( num1 , num2,  num3);
//
////Q2--------------------------------------------------
//        System.out.println(" Enter String :");
//        String string = scanner.nextLine();
//        System.out.println(" Enter number :");
//        int num4 = scanner.nextInt();
//        CheckChar(string , num4);


////Q3--------------------------------------------------

//
//            System.out.println(" Enter number :");
//           int num4 = scanner.nextInt();
//           int sum = 0;
//           while (num4!=0){
//           sum+=num4;
//           System.out.println(" Enter number :");
//           num4 = scanner.nextInt();
//       }
//        System.out.println(sum);

////Q4-------------------------------------------------
//     ArrayList<Integer> A= new ArrayList<Integer>();
//        A.add(10);
//        A.add(-21);
//        A.add(30);
//        A.add(31);
//        A.add(-25);
//        CheckArray( A );

////Q5-------------------------------------------------
//        ArrayList<String> S= new ArrayList<String>();
//
//        S.add("Tuwaiq");
//        S.add("Bootcamp");
//        S.add("JAVA");
//        S.add("Student");
//
//
//        CheckShortest( S );
    }


    public static void max(int num1 ,int num2, int num3){
        System.out.println( Math.max(num1,Math.max(num2,num3)));
    }


    public static void CheckChar(String string ,int num){
        System.out.println(string.charAt(num));

    }
    public static void CheckArray(ArrayList<Integer> A ){
        for( int i=0 ; i<A.size();i++){
            if( A.get(i)>0){
                System.out.println(A.get(i)+"is positive number");
            }else   System.out.println(A.get(i)+"is negative number");
        }

    }

    public static void CheckShortest(ArrayList<String> s ){
        int min=s.get(0).length();
        int min1=0;
    for (int i = 0 ; i<s.size();i++){
     if(s.get(i).length()<min){
        min=s.get(i).length();
        min1=i;
    }
}
        System.out.println(s.get(min1));
    }
}