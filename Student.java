

public class Student  
{
    private String firstName;
    private String lastName; 
    private double GPA ;

    public Student(){
        firstName = "" ;
        lastName = "";
        GPA = 0;
        
    }
    
    public Student(String firstName , String lastName ){
       
        this.firstName= firstName;
        this.lastName = lastName; 
        
    }
    
    public void setFirstName(String firstName ){
         this.firstName = firstName;
         
        
    }
    public void setLastName(String LastName ){
        this.lastName = lastName; }
        
  public String getName(){
      return "My Full name is " + firstName +" "+ lastName;
      
      
  }
  public String getfirstName(){ 
      return firstName ;
  }
      public String getLasName(){
          return lastName;
      }
      public void setGPA(double GPA ){
          this.GPA = GPA ;
          
          
      }
      public double getGPA (){
          return GPA ;
          
      }
    
}

 class main
{ public static void main (String[] args)
    

    { Student student1 = new Student ("Sarah" , "Matar");
        String myFullName = student1.getName();
        System.out.println(myFullName);
        student1.setGPA(3.5);
        System.out.println(student1.getGPA());
    }}

        
        
        
