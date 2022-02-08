import java.util.Scanner;

public class Project_Ada_Jiang_Demo
{
   public static void main(String[] args)
   
   {  Scanner sc = new Scanner(System.in);
      System.out.print("Please enter the Policy Number: ");
      int policyNumber = Integer.parseInt(sc.nextLine());
      System.out.print("Please enter the Provider Name: ");
      String providerName = sc.nextLine();
      System.out.print("Please enter the Policyholder\'s First Name: ");
      String phFirstName = sc.nextLine();
      System.out.print("Please enter the Policyholder\'s Last Name: ");
      String phLastName = sc.nextLine();
      System.out.print("Please enter the Policyholder\'s Age: ");
      int age = sc.nextInt(); 
      sc.nextLine();
      System.out.print("Please enter the Policyholder\'s Smoking Status (smoker/non-smoker): ");
      String phSmokingStatus = sc.nextLine();
      System.out.print("Please enter the Policyholder\'s Height (in inches): ");
      double height = sc.nextDouble();
      System.out.print("Please enter the Policyholder Weight (in pounds): ");
      double weight = sc.nextDouble();

      //use the new keyword to call the constructor for the policy class
      Policy p1 = new Policy(policyNumber, providerName, phFirstName, phLastName, age, phSmokingStatus, height, weight);
     
      displayPolicyInfo(p1);
   }
      
      public static void displayPolicyInfo(Policy p)
   {
      System.out.println("Policy Number: " + p.getPolicyNumber());
      System.out.println("Provider Name: " + p.getProviderName());
      System.out.println("Policyholder's First Name: " + p.getFname());
      System.out.println("Policyholder's Last Name:  " + p.getLname());
      System.out.println("Policyholder's Age:  " + p.getAge());
      System.out.println("Policyholder's Smoking Status: " + p.getSmokingStatus());
      System.out.println("Policyholder's Height:  " + p.getHeight() + " inches");
      System.out.println("Policyholder's Weight:  " + p.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %,.2f\n", p.getBMI());
      System.out.printf("Policy Price: $%,.2f ", p.getInsurancePrice());
   }
   
}