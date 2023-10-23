import java.util.*;

class GradeCalculator
{
   public static void main(String arr[])
   {
	   
        System.out.println("\n---------------Welcome---------------");
        System.out.println("\nEnter marks of 5 subject of a student\n");

        Scanner sc = new Scanner(System.in);
        int sub_1 = sc.nextInt();
        int sub_2 = sc.nextInt();
        int sub_3= sc.nextInt();
        int sub_4 = sc.nextInt();
        int sub_5 = sc.nextInt();

        int total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5 ;
        float average = total/5;

        System.out.println("1.Subject_1 \t: " + sub_1);
        System.out.println("2.Subject_2 \t: " + sub_2);
        System.out.println("3.Subject_3 \t: " + sub_3);
        System.out.println("4.Subject_4 \t: " + sub_4);
        System.out.println("5.Subject_5 \t: " + sub_5);
        System.out.println("Total Marks \t: " + total);
        System.out.println("Average percent\t: " + average);

        if(average >= 85)
        System.out.println("Grade   \t: A");

        if(average >=70 && average <85)
        System.out.println("Grade   \t: B");

        if(average >=60 && average <70)
        System.out.println("Grade   \t: C");

        if(average >=50 && average <60)
        System.out.println("Grade   \t: D");
	
        if(average >=35 && average <50)
        System.out.println("Grade   \t: E");

        if(average < 35)	
        System.out.println("Grade   \t: F");

}
}