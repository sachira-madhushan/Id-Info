import java.util.Scanner;

public class NewId extends Id{  
    Scanner sc=new Scanner(System.in);
    boolean isNewId(String idNumber){
        boolean NewOrNot=true;
        if( idNumber.length()!=12){
            NewOrNot=false;
        }
        else if((idNumber.charAt(9)=='v'||idNumber.charAt(9)=='V')){
            NewOrNot=false;
        }
        else if(idNumber.length()==12 && (idNumber.charAt(9)!='v'||idNumber.charAt(9)!='V') ){
            NewOrNot=true;
        }
        
        return NewOrNot;
    }

    void printDetails(String idNumber){
        BirthDay(idNumber);
        maleOrFemale(idNumber);
    }


    void BirthDay(String idNumber){
        int[] leafYear={31,29,31,30,31,30,31,31,30,31,30,31};
        int[] normalYear={31,28,31,30,31,30,31,31,30,31,30,31};
        String year="";
        int monthDay=0,month=0,days=0;
        year=String.valueOf(idNumber.charAt(0))+String.valueOf(idNumber.charAt(1))+String.valueOf(idNumber.charAt(2))+String.valueOf(idNumber.charAt(3));
        int monthAndDay=Integer.valueOf(String.valueOf(idNumber.charAt(4))+String.valueOf(idNumber.charAt(5))+String.valueOf(idNumber.charAt(6)));
        if(monthAndDay>500){
            monthAndDay-=500;
        }
        if(Integer.valueOf(year)%4==0){
            for(int i=0;i<12;i++){
                
                if(monthDay<monthAndDay){
                    month++;
                    monthDay+=leafYear[i];
                }
                else{
                    monthDay-=leafYear[i-1];
                    break;
                }
            }
            days=monthAndDay-monthDay;
        
        }
        else if(Integer.valueOf(year)%4!=0){
            for(int i=0;i<12;i++){
                
                if(monthDay<monthAndDay){
                    month++;
                    monthDay+=normalYear[i];
                }
                else{
                    monthDay-=normalYear[i-1];
                     break;
                }
            }
            days=monthAndDay-monthDay;
        }
        String dateOfBirth=year+"."+String.valueOf(month++)+"."+String.valueOf(days);
        System.out.println("[1]Date Of Birth :"+dateOfBirth);
        
    }
    
    void maleOrFemale(String idNumber){
        int monthAndDay=Integer.valueOf(String.valueOf(idNumber.charAt(4))+String.valueOf(idNumber.charAt(5))+String.valueOf(idNumber.charAt(6)));
        if(monthAndDay>500){
            System.out.println("[2]Gender :Female");
        }
        else{
            System.out.println("[2]Gender :Male");

        }
    }
}
