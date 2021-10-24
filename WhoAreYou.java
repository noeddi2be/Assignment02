import java.util.Scanner;

public class WhoAreYou {

    public static void main(String[] args) {

        You person01 = new You();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        person01.setFirstname(scan.nextLine());

        System.out.println("Please enter your last name: ");
        person01.setLastname(scan.nextLine());

        System.out.println("Please enter your Age: ");
        person01.setAge(scan.nextInt()); 
        scan.nextLine();
        
        System.out.println("Please enter your ethnicity: ");
        person01.setEthnicity(scan.nextLine()); // needs enum (European, Asian, American, African, Australian)

        scan.close();

        System.out.println(person01.getYou());
    }   
}

