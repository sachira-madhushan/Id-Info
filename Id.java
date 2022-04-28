import java.util.Scanner;

public class Id {
    Scanner input=new Scanner(System.in);
    String getId(){
        input.nextLine();
        System.out.print("[?]Enter Your Id Number :");
        String idNumber=input.nextLine();
        return idNumber;
    }

    public int getInputs(){
        int choise =0;
        System.out.println("\t[1] Enter Id");
        System.out.println("\t[2] Go Back");
        System.out.print("[?]Enter Your Option :");
        try {
            choise=input.nextInt();
        } catch (Exception e) {
            System.out.println("[*]Invalid Input!");
        }
        return choise;
    }
}
