import java.util.Scanner;
public class Details {
    public static void main(String[]args){
        Scanner myobj = new Scanner(System.in);
        System.out.print("Entername,age,coursename,registrationNo");
        String name = myobj.nextLine();
        int age  = myobj.nextInt();
        String coursename = myobj.nextLine();
        int registrationNo =  myobj.nextInt();
        String course = myobj.nextLine();

        System.out.print("Name" +name);
        System.out.print("Age" +age);
        System.out.print("Course name" +coursename);
        System.out.print("registrationNo" +registrationNo);
        System.out.print("course" +course);
    }
}
