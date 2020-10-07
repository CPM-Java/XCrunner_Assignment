/**Showing identifier naming conventions 
 * and introducing the constructor method
 * 
 * @author GrayKnight
 * @version 9/9/15, 8/11/17
 */
public class XC_runner
{
    //instance identifiers,     times are in minutes
    private String myName;   // set by the constructor
    private double my5Ktime; // set by the constructor
    private double myPRtime; // set by the constructor
    
    // a boolean variable can only be true or false
    private boolean amTired = false;
    private int myPractices = 0;
    private int myRaces = 0;
    
    private final double PRACTICE_REWARD = 0.25; //minutes
    private final double TIRED_RACE_PENALTY = 0.75; //minutes
    
    //Design an implement a constructor for XCrunner
    // and place it here.
    

    public String race()
    {
        //explain what the next three lines are doing using line comments
        my5Ktime = my5Ktime - PRACTICE_REWARD * myPractices;
        
        if(amTired) my5Ktime = my5Ktime + TIRED_RACE_PENALTY;
        
        if(myPRtime > my5Ktime) myPRtime = my5Ktime;
        
        //now complete the method
        
        return "";
    }
    
   // Write the methods practice() and rest()  such that
   // they behave identically to the example given in the XC_runner_demo project
   
    public String toString()
    {
        String status = "My name is: " + myName +
                        " I have attended " + myPractices + " practices" +
                        " and competed in " + myRaces + " races." +
                        " amTired = " + amTired +
                        " My PR in the 5k is " + myPRtime + " minutes.";
        return status;                                          
    }
}