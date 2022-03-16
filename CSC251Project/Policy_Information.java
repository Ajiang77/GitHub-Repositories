import java.util.*;
import java.io.*;
import java.util.Scanner;
 
public class Policy_Information

{ //open the class container


   public static void main(String[] args)
   { //open the main method                              
      
      /*The book uses the "throws IOException" option in the main method header. In this exercise we use a "try" and "catch" process. We "try" to open the file and process it, but if something goes wrong, 
        an IOException will be "thrown" and we can "catch" it and deal with the problem. By taking this approach instead of adding a "throws IOException" clause to the main method header, we can 
        gracefully handle problems related to reading the file without having our program crash. If a problem occurs while processing the file, the IOException is immediately "thrown", the code 
        immediately jumps to the "catch" block of code. The message in the "catch" block will display. */
        
      try 
      {
         /*Create an instance of the File class. Pass the string "tuition.txt" to the constructor. 
         This process creates a File object that represents the file tuition.txt.*/
         File file = new File("PolicyInformation.txt"); 
         
         /* Pass a reference to the File object as an argument to the Scanner class constructor (i.e., file) */                             
         Scanner inputFile = new Scanner(file);
      
         //declare the variables
         int policyNumber = 0, age = 0;
         String providerName = "", fName = "", lName = "", smokingStatus = "";
         double height = 0.0, weight = 0.0, BMI = 0.0, insurancePrice = 0.0;

         //Create an array list to store objects. The ArrayList will hold Policy objects.
         ArrayList<Policy> policies = new ArrayList<Policy>();
      
         /* Use a while loop to read the file. Use the hasNext() method to determine whether 
            the file has more data to be read. Use an "if statement" to determine the end of the file and 
            to consume newline characters */
      
         while(inputFile.hasNext())       
         { //open loop
            
            policyNumber = inputFile.nextInt();
            providerName = inputFile.nextLine();  
            fName = inputFile.nextLine();
            lName = inputFile.nextLine();
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble(); 
            weight = inputFile.nextDouble();
         
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
            /* Create Policy objects using the Policy class type - we are still under the while loop. Objects will be created as long as there are records
            in the file to read.*/
            Policy p = new Policy(policyNumber, providerName, fName, lName, age, smokingStatus, height, weight); //Passing variables as arguments to the constructor

            /* Add Policy objects to the ArrayList (Note: policies is the reference variable for the ArrayList and p is the
            reference variable for the Policy objects)*/
            policies.add(p); 
            
         } //close loop
      
         inputFile.close();//close the file
      
         //use a for loop to display the output
         for(int i =0; i < policies.size(); i++)
         { 
            System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());//instance method - returns the Policy Number
            System.out.println("Provider Name: " + policies.get(i).getProviderName());//instance method - returns the Provider Name
            System.out.println("Policyholder's First Name: " + policies.get(i).getFname());//instance method - returns the Policyholder's First Name
            System.out.println("Policyholder's Last Name:  " + policies.get(i).getLname());//instance method - returns the Policyholder's Last Name
            System.out.println("Policyholder's Age:  " + policies.get(i).getAge());//instance method - returns the Policyholder's Age
            System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());//instance method - returns the Policyholder's Smoking Status
            System.out.println("Policyholder's Height:  " + policies.get(i).getHeight() + " inches");//instance method - returns the Policyholder's Height
            System.out.println("Policyholder's Weight:  " + policies.get(i).getWeight() + " pounds");//instance method - returns the Policyholder's Weight
            System.out.printf("Policyholder's BMI: %,.2f\n", policies.get(i).getBMI());//instance method - returns the Policyholder's BMI by calculating the height and weight
            System.out.printf("Policy Price: $%,.2f ", policies.get(i).getInsurancePrice());//method that returns the policy price for each insurance

            BMI += policies.get(i).getBMI();//add the person BMI to the current policy to our accumulator
            insurancePrice += policies.get(i).getInsurancePrice();//add the insurance price of the current policy to our accumulator 
            
         }  
           
         System.out.printf("Policyholder's BMI: $%,.2f \n", BMI); //print out the person BMI
         System.out.printf("Policy Price: $%,.2f \n", insurancePrice); //print out the total policy price
      
      }//close the "try" block of code
      
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
      
   } //close main
   
} //close the class container