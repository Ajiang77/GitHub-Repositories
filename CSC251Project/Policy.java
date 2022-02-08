import java.lang.Math;
public class Policy
{
   private int policyNumber;//variable declared for policy number.
   private String providerName;//name of the provider.
   private String fName;//Policyholder’s First Name
   private String lName;//Policyholder’s Last Name
   private int age;//Policyholder’s Age
   private String smokingStatus;//Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
   private double height;//Policyholder’s Height (in inches) name declared.
   private double weight;//Policyholder’s Weight (in pounds) name declared.
   private double BMI;//BMI Variable declared.
   
   //no-arg constructor
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      fName = "";
      lName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }

   //Constructor - the constuctor accepts all fields arguments to construct
   // an object.
   public Policy(int policyNum, String proName, String f, String l, int a, String smokStatus, double h, double w)
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
   
   //These are the Mutator (set) Methods:
   //setPolicyNumber - this method accepts a policy number and stores it in the policyNumber field.
   public void setPolicyNumber(int policyNum)
   {
      policyNumber = policyNum; 
   }
   
   //setProviderName - this method accepts a provider name and stores it in the proName field.
   public void setProviderName(String proName)
   {
      providerName = proName;
   }
   
   //setFname - this method accepts the first name and stores it in the f field.
   public void setFname(String f)
   {
      fName = f;
   }
   
   //setLname - this method accepts the last name and stores it in the l field.
   public void setLname(String l)
   {
      lName = l; 
   }
   
   //setAge - this method accepts the age and stores it in the a field.
   public void setAge(int a)
   {
      age = a;
   }
   
   //setSmokingStatus - this method accepts and tells the smoking status and stores it in the smokStatus field.
   public void setSmokingStatus(String smokStatus)
   {
      smokingStatus = smokStatus;
   }
   
   //setHeight - this method accepts the Height and stores it in the h field.
   public void setHeight(double h)
   {
      height = h;
   }
   
   //setWeight - this method accepts the weight and stores it in the w field.
   public void setWeight(double w)
   {
      weight = w;
   }

    
   //Accessor method for The name of the policy.
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
    public String getProviderName()
   {
      return providerName;
   }
   
    public String getFname()
   {
      return fName;
   }
   
    public String getLname()
   {
      return lName;
   }
   
    public int getAge()
   {
      return age;
   }
   
    public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
    public double getHeight()
   {
      return height;
   }
   
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
}


