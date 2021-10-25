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
        String inputEthnicity = scan.nextLine();

        scan.close();

        switch (inputEthnicity) {
            case "African":
                person01.setEthnicity(You.Ethnicity.African);
                break;
            case "American":
                person01.setEthnicity(You.Ethnicity.African);
                break;
            case "Australian":
                person01.setEthnicity(You.Ethnicity.Australian);
                break;
            case "Asian":
                person01.setEthnicity(You.Ethnicity.Asian);
                break;
            case "European":
                person01.setEthnicity(You.Ethnicity.European);
                break;
            case "Latin American":
                person01.setEthnicity(You.Ethnicity.Latin_American);
                break;
            default:
                System.out.println("Please enter a valid Ethnicity!");
        }

        System.out.println(person01.getYou());
    }   
}

