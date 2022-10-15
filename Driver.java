import javax.swing.text.html.Option;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        new Driver().menu();
    }

    public void menu(){
        System.out.print("""
                Press 1 to add a lab in a department
                Press 2 to remove a lab from a department
                Press 3 to add a system in a lab
                Press 4 to remove a system from a lab
                Press 5 to quit
                Press 6 for menu
                """);
        Scanner s = new Scanner(System.in);
        int Option = s.nextInt();

        switch (Option){
            case 1:
            {new Department().getInput();}

            case 2:
            {
                System.out.println( "Enter Lab number to remove : " );
                int labNo = s.nextInt();
                new Department().removeLab( labNo );}

            case 3:
            {new Lab().askForInput();}

            case 4:
            {
                System.out.println( "Enter System number to remove : ");
                int sysNo = s.nextInt();
                new Lab().removeSystem( sysNo );}

            case 5 :
            break;

            case 6:
            {new Driver().menu();}

        }
    }
}