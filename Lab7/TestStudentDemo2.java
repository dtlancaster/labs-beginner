import static org.junit.Assert.fail;
import org.junit.Test;
import java.io.PrintStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.util.IllegalFormatPrecisionException;
/**
 * Write a description of class TestStudentDemo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestStudentDemo2
{
    private PrintStream terminal;
    private InputStream keyboard;
    private ByteArrayOutputStream output;
    private String studentData;    
    private String[] result;
    private int grade;    
    
    /**
     * Perform multiple checks of the main method from
     * the StudentDemo class.
     */
    @Test
    public void testMain()
    {
        checkMain1();
        checkMain2();
        checkMain3();
        checkMain4();
    }
    /**
     * Perform one check of the StudentDemo main method.
     */
    public void checkMain1()
    {
        String[] exp = new String[6];
        exp[0] = "Hello Barack Obama.\n";
        exp[1] = "The letter grade corresponding to your average grade is B.\n";
        exp[2] = "This grade is passing.\n";
        exp[3] = "The number of grade credits you have earned is 4128.69.";
        exp[4] = "The number of grade credits you have earned is 4128.70.";
        exp[5] = "The number of grade credits you have earned is 4128.71.";
        checkMain("Barack Obama", 46, 86.92, 40, exp);
    }
    
    /**
     * Perform one check of the StudentDemo main method.
     */
    public void checkMain2()
    {
        String[] exp = new String[6];
        exp[0] = "Hello Homer Simpson.\n";
        exp[1] = "The letter grade corresponding to your average grade is F.\n";
        exp[2] = "This grade is failing.\n";
        exp[3] = "The number of grade credits you have earned is 1767.60.";
        exp[4] = "The number of grade credits you have earned is 1767.61.";
        exp[5] = "The number of grade credits you have earned is 1767.62.";
        checkMain("Homer Simpson", 33, 53.564, 35, exp);
    }
    
    /**
     * Perform one check of the StudentDemo main method.
     */
    public void checkMain3()
    {
        String[] exp = new String[6];
        exp[0] = "Hello Marge Simpson.\n";
        exp[1] = "The letter grade corresponding to your average grade is A.\n";
        exp[2] = "This grade is passing.\n";
        exp[3] = "The number of grade credits you have earned is 5174.99.";
        exp[4] = "The number of grade credits you have earned is 5175.00.";
        exp[5] = "The number of grade credits you have earned is 5175.01.";
        checkMain("Marge Simpson", 50, 100, 43, exp);
    }
    
    /**
     * Perform one check of the StudentDemo main method.
     */
    public void checkMain4()
    {
        String[] exp = new String[6];
        exp[0] = "Hello Fozz E. Bear.\n";
        exp[1] = "The letter grade corresponding to your average grade is B.\n";
        exp[2] = "This grade is passing.\n";
        exp[3] = "The number of grade credits you have earned is 6693.74.";
        exp[4] = "The number of grade credits you have earned is 6693.75.";
        exp[5] = "The number of grade credits you have earned is 6693.76.";
        checkMain("Fozz E. Bear", 75, 85.0, 60, exp);
    }    
    /**
     * Test the main method from the StudentDemo class.  Run the 
     * student main and see if the output matches any one of exp1, 
     * exp2, or exp3.
     * @param name The name to use for testing.
     * @param credits The number of credits to use for testing.
     * @param average The grade average to use for testing.
     * @param required The required number of credits  to use 
     * for testing.
     * @param exp An array of expected output strings.
     * 
     */
    public void checkMain(String name, int credits, 
        double average, int required, String[] exp)
    {
        StringBuilder fb = new StringBuilder();
        try 
        {        
            //terminal now prints to the Terminal window like this
            //terminal.println("Hello");
            terminal = System.out;
            keyboard = System.in;
            
            //Set up System to print to byte array
            output = new ByteArrayOutputStream();
            System.setOut(new PrintStream(output));
    
            //Set up System to read from a string.        
            String inputString = String.format("%s\n%d\n%f\n%d\n", 
                name, credits, average, required);
            ByteArrayInputStream inContent = new ByteArrayInputStream(
                inputString.getBytes());
            System.setIn(inContent);
    
            //Run the students main and capture the results
            //STUDENT: If you are reading this because the following
            //line caused a compile error then you did not 
            //create a proper main in your class.        
            StudentDemo.main(null);
            System.out.flush();
    
            //Print user output to terminal
            terminal.println(output);
            
            //Restore IO.
            System.setOut(terminal);
            System.setIn(keyboard);
            
            //Replace all crnl with nl
            //Replace all cr with nl
            //Only nl should remain
            studentData =  output.toString().trim();
            studentData = studentData.replaceAll("\r\n", "\n");
            studentData = studentData.replaceAll("\r", "\n");        
    
            int helloPos = studentData.indexOf("Hello ");
            if (helloPos >= 0)
            {
                studentData = studentData.substring(helloPos);
                //javax.swing.JOptionPane.showMessageDialog(null, studentData);
            }
            else
            {
                fail("Your output does not contain the \"Hello\" line.");
            }
            
            if (!studentData.contains(exp[0]))
            {
                failMain(0, exp[0], studentData);
            }
            else if (!studentData.contains(exp[1]))
            {
                failMain(1, exp[1], studentData);
            }
            else if (!studentData.contains(exp[2]))
            {
                failMain(2, exp[2], studentData);
            }
            else if (!studentData.contains(exp[3]) 
                && !studentData.contains(exp[4]) 
                && !studentData.contains(exp[5]))
            {
                failMain(3, exp[4], studentData);
            }
        }
        catch (IllegalFormatPrecisionException e)
        {
            String msg = "Fail in TestStudentDemo2.\n";
            msg += "Bad format specifier in printf.\n";
            msg += "";
            fail(msg);            
        }
        catch (Exception e)
        {   
            e.printStackTrace();
            String msg = "Fail in TestStudentDemo2.\n";
            msg += "Can't run main.\n";
            msg += e.getMessage();
            fail(msg);
        }
        finally
        {
            if (terminal != null)
            {                
                System.setOut(terminal);
            }
            if (keyboard != null)
            {
                System.setIn(keyboard);
            }
        }
            
        
    }
    
    /**
     * Print an error message for main depending on the line
     * the error was detected.
     * @param failLine The output should be four lines.  This
     * is the line number that failed.
     * @param expected The correct line to show to the student
     * so they will know the correct line for which the test
     * is looking.
     * @param studentData The incorrect four lines of output from 
     * the students program.
     */
    public void failMain(int failLine, String expected, String studentData)
    {
        StringBuilder fb = new StringBuilder();
        String line = "-----------------------------------------" 
            + "--------------------------------------\n";
        fb.append("Fail in TestStudentDemo2.\n");
        
        if (failLine == 0)
        {
            fb.append("The hello line is missing or malformed in ");
            fb.append("your output.\n");
            
        }
        else if (failLine == 1)
        {
            fb.append("The letter grade line is missing or malformed ");
            fb.append("in your output.\n");
        }
        else if (failLine == 2)
        {
            fb.append("Your passing/failing line is missing or malformed in ");
            fb.append("your output.\n");
        }        
        else if (failLine == 3)
        {
            fb.append("Your grade credits line is missing or malformed in ");
            fb.append("your output.\n");
        }        
        fb.append("You should have a line that matches the following ");
        fb.append("exactly.\n");
        fb.append("(Take care with spelling, case, spaces, punctuation, ");
        fb.append("and newlines.)\n");
        fb.append(line);
        fb.append(expected);
        if (!expected.endsWith("\n"))
        {
            fb.append("\n");
        }
        fb.append(line);
        fb.append("Your code follows:\n");
        fb.append(line);
        fb.append(studentData.trim());
        fb.append("\n");
        fb.append(line);
        fail(fb.toString());
    }
}
