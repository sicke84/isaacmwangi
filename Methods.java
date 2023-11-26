import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        findminmax();

    }
    /**
     * 
     */
    public static void findminmax() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int smallest = num1;
        int largest  =num1;

        if(num2 < smallest) {
         smallest = num2;
        }
        if(num3 < smallest){
            smallest = num3;
        }
        if (num2 > largest){
            largest = num2;     
        }
        if (num3 >largest) {
            lagest = num3;
        }

        System.out.println("Smallest number:"  + smallest);
        System.out.println("The largest number:" + largest);
        System.out.println(largest +"is your largest and" + smallest + "is your smallest" );
       
        scanner.close();

    }


}