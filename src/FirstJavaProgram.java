import java.util.Calendar;

public class FirstJavaProgram {

    static int a = 90;
    static int b = 10;

    public static void main(String[] args) {

        //      PersonalDetails
        String name            = "Yash Patel";
        String address         = "21,Rugby Avenue,wembley,London,HA0 3DF ";
        String mobileNo        = "07459895873";
        String age             = "23";
        String securityCode    = "29.19";
        String eligibleForVote = "True";
        String grade           = "A";

        //        Calendar
        int total  =a+b;
        int total1 =a-b;
        int total2 =a*b;
        int total3 =a/b;

        String space = " ";

        //      PersonalDetails
        System.out.println("Name              : " + name);
        System.out.println("Address           : " + address);
        System.out.println("Mobile No         : " + mobileNo);
        System.out.println("Age               : " + age);
        System.out.println("Security Code     : " + securityCode);
        System.out.println("Eligible For Vote : " + eligibleForVote);
        System.out.println("Grade             : " + grade);

        //        Calculator
        System.out.println(a+b);
        System.out.println("Addition of "+a+" and "+b+" = "+total);
        System.out.println(a-b);
        System.out.println("Subtraction of "+a+" and "+b+" = "+total1);
        System.out.println(a*b);
        System.out.println("Multiplication of "+a+" and "+b+ " = "+total2);
        System.out.println(a/b);
        System.out.println("Division of "+a+" and "+b+ " = "+total3);

    }
}























