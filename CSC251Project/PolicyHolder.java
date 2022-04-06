/* This program will use @param and @return documentation to provide practice with using method documentation. 
   You should include this type of documentation in all your programs.*/

/**Create the PolicyHolder class to hold the policyholder-related data. 
   An instance of this class will be used as a "field" in the Policy class*/
import java.util.Scanner;

public class PolicyHolder
{

   //fields 
      
   private int policyNumber;
   private int age;
   private String providerName;
   private String fName;
   private String lName;
   private String smokingStatus;
   private double height;
   private double weight;
   private double BMI;
   private double InsurancePrice;//Known as the Policy Price
   

  /*
    Constructor that accepts arguments for the policyholder: policyNumber, age, providerName, fName, lName, smokingStatus, height, weight, *BMI, and the policy price which is known as *insurancePrice.
    This constructor can be used to initialize the fields. 
    @param policyNum - policy number
    @param proName - provider name
    @param f - policyholder's First Name
    @param l - policyholder's Last Name //the book price
    @param a - policyholder's age
    @param smokStatus - policyholder's smoking status
    @param h - policyholder's height
    @param w - policyholder's weight
  */
  
   public PolicyHolder(int policyNum, String proName, String f, String l, int a, String smokStatus, double h, double w)
   {
      policyNumber = policyNum; 
      providerName = proName;
      fName = f;
      lName = l;
      age = a;
      smokingStatus = smokStatus;
      height = h;
      weight = w;
   }
   
   /*The copy constructor creates a copy of the PolicyHolder class that it is passed as a parameter.
     We use this to avoid secuirty holes.  See Chapter 7 for more information about this.
     @param object2 - the object to copy
   */
   public PolicyHolder(PolicyHolder object2)
   {
      policyNumber = object2.policyNumber; 
      providerName = object2.providerName;
      fName = object2.fName;
      lName = object2.lName;
      age = object2.age;
      smokingStatus = object2.smokingStatus;
      height = object2.height;
      weight = object2.weight;
   }
   
               //SETTERS
  /**
      @param policyNum - policy number
  */
    public void setPolicyNumber(int policyNum)
   {
      policyNumber = policyNum; 
   }
 
   
  /**
      @param proName - provider name
  */
   public void setProviderName(String proName)
   {
      providerName = proName;
   }
   
   
  /**
      @param f - policyholder's First Name
  */
   public void setFname(String f)
   {
      fName = f;
   }
   
  
  /**
      @param l - policyholder's Last Name
  */
   public void setLname(String l)
   {
      lName = l; 
   }
   
   
  /**
      @param a - the policyholder's age
  */
   public void setAge(int a)
   {
      age = a;
   }
   
   
  /**
      @param smokStatus - the policyholder's smoking status
  */
   public void setSmokingStatus(String smokStatus)
   {
      smokingStatus = smokStatus;
   }
   
   
  /**
      @param h - policyholder's height
  */
   public void setHeight(double h)
   {
      height = h;
   }
   
   
  /**
      @param w - policyholder's weight
  */
   public void setWeight(double w)
   {
      weight = w;
   }
  

                 //GETTERS
   
 /**
      @return - the value in the policyNumber field
 */
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
 /**
      @return - the value in the providerName field
 */
   public String getProviderName()
   {
      return providerName;
   }
 
 /**
      @return - the value in the fName field
 */
   public String getFname()
   {
      return fName;
   }   
  
 /**
      @return - the value in the lName field
 */
   public String getLname()
   {
      return lName;
   }
   
 /**
      @return - the value in the age field
 */
   public int getAge()
   {
      return age;
   }
  
 /**
      @return - the value in the smokingStatus field
 */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
  
 /**
      @return - the value in the height field
 */
   public double getHeight()
   {
      return height;
   }
  
 /**
      @return - the value in the weight field
 */
   public double getWeight()
   {
      return weight;
   }
  
   //getter for returns the BMI of the policyholder.
   public double getBMI()
   {
      double BMI =  (weight * 703 ) / ( Math.pow(height,2));
      return BMI;
   }
   
   //getter for returns the price of the insurance policy
   public double getInsurancePrice()
   {
      double baseFee = 600.00;
      
      if(age > 50)
      {
         baseFee += 75;
      }
      
      if(smokingStatus.equals("smoker"))
      {
         baseFee += 100;
      }
      
      if(getBMI() > 35)
      {
         baseFee += ( getBMI() - 35 ) * 20;
      }
      return baseFee;
   }
  
  /**
      "Added toString method"
      toString method
      @return - A string containing the policyholder information
  */ 

   /*
     We make use of the String.format method to format the price. See Chapter 3 for information about this method.
   */
   
   public String toString()
   {
      return String.format("\nPolicy Number: " + policyNumber +          
                           "\nProvider Name: " + providerName +
                           "\nPolicyholder's First Name: " + fName +
                           "\nPolicyholder's Last Name:  " + lName +            
                           "\nPolicyholder's Age:  " + age +
                           "\nPolicyholder's Smoking Status: " + smokingStatus +
                           "\nPolicyholder's Height:  " + height + " inches" +            
                           "\nPolicyholder's Weight:  " + weight + " pounds" +            
                           "\nPolicyholder's BMI: %,.2f\n", BMI + 
                           "\nPolicy Price: $%,.2f \n", InsurancePrice);
                           
   }
}