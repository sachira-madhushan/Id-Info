import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Clear clear =new Clear();
        Decoration d=new Decoration();
        NewId newID=new NewId();
        OldId oldId=new OldId();
        Scanner input=new Scanner(System.in);
        int choise=0;

        loop:
        while(choise!=3){
            clear.cleanScreen();
            d.startDecoration();
            System.out.println("[info]Old Id Contains 9 Numbers And Ends With Letter 'V'.");
            System.out.println("[info]New Id Only Contains 12 Numbers.");
            System.out.println("");
            System.out.println("\t[1] New Id Card");
            System.out.println("\t[2] Old Id Card");
            System.out.println("\t[3] Exit");
            System.out.print("[?]Enter Your Option :");
            try {
                choise=input.nextInt();
            } catch (Exception e) {
                System.out.println("[*]Invalid Input!");
            }
            if(choise==1){
                clear.cleanScreen();
                d.newIdDecoration();
                int inputChoise=newID.getInputs();
                if(inputChoise==1){
                    input.nextLine();
                    String idNumber=newID.getId();
                    boolean trueOrFalse=newID.isNewId(idNumber);
                    if(trueOrFalse){
                        newID.printDetails(idNumber);
                        clear.pause();
                        continue loop;
                        
                    }
                    else{
                        System.out.println("[!]Invalid Id Number!");
                        clear.pause();
                        continue loop;
                    }
                }
                else if(inputChoise==2){
                    continue loop;
                }
            }
            else if(choise==2){
                clear.cleanScreen();
                d.oldIdDecoration();
                int inputChoise=oldId.getInputs(); 
                if(inputChoise==1){
                    input.nextLine();
                    String idNumber=oldId.getId();
                    boolean trueOrFalse=oldId.isOldId(idNumber);
                    if(trueOrFalse){
                        oldId.printDetails(idNumber);
                        clear.pause();
                        continue loop;
                    }
                    else{
                        System.out.println("[!]Invalid Id Number!");
                        clear.pause();
                        continue loop;
                    }
                }
                else if(inputChoise==2){
                    continue loop;
                }
            }
            else if(choise==3){
                break loop;
            }
            else{
                continue loop;
            }
        }
	}

}
