import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * Verify correct method operation.
 *
 * @author Joel Swanson
 * @version 02.22.2014
 */
public class TestStudent2
{
    /**
     * Run TestStudent1.
     */
    @Test
    public void testOperations001()
    {
        TestStudent1 ts1 = new TestStudent1();
        ts1.checkDeclarations();
        
    }

    /**
     * Check mutator and accessor for studentName.  
     */
    @Test
    public void testStudentNameAccessorsAndMutators002()
    {
        checkStudentNameAM("Test1");
        checkStudentNameAM("Test2");
    }
    
    /**
     * Check mutator and accessor for credits.  
     */
    @Test
    public void testCreditsAccessorsAndMutators003()
    {
        checkCreditsAM(10);
        checkCreditsAM(20);
    }
    
    /**
     * Check mutator and accessor for averageGrade.  
     */
    @Test
    public void testAverageGradeAccessorsAndMutators004()
    {
        checkAverageGradeAM(10.1);
        checkAverageGradeAM(20.2);
    }
    
    /**
     * Check Student constructor.  
     */
    @Test
    public void testConstructor005()
    {
        checkConstructor("A", 1, 2.0);
        checkConstructor("B", 3, 4.0);
    }  
    
    /**
     * Check letterGrade method.
     */
    @Test
    public void testLetterGrade006()
    {
        checkLetterGrade("A", 1, 91.5, 'A');
        checkLetterGrade("A", 1, 85.3, 'B');
        checkLetterGrade("A", 1, 72.0, 'C');
        checkLetterGrade("A", 1, 65.9, 'D');
        checkLetterGrade("A", 1, 0.0, 'F');
    }  
    
    /**
     * Check hasPassed method.
     */
    @Test
    public void testHasPassed007()
    {
        checkHasPassed('A', "passing");
        checkHasPassed('B', "passing");
        checkHasPassed('C', "passing");
        checkHasPassed('D', "passing");
        checkHasPassed('F', "failing");
    }  
    
    /**
     * Check gradeCredits method.
     */
    @Test
    public void testGradeCredits008()
    {
        checkGradeCredits("Barack Obama", 46, 86.92, 40, 4128.70);
        checkGradeCredits("Homer Simpson", 33, 53.564, 35, 1767.61);
        checkGradeCredits("Marge Simpson", 50, 100.0, 43, 5175.0);
        checkGradeCredits("Fozz E. Bear", 75, 85.0, 60, 6693.75);
    }  
    
    /**
     * Check the accessor and mutator for proper operation.
     * @param testData The name to set for testing.
     */
    public void checkStudentNameAM(String testData)
    {
        String fb = "";
        try 
        {
            Student student = new Student("", 0, 0);
            student.setStudentName(testData);            
            String setData = student.getStudentName();

            if (!setData.equals(testData))
            {
                fb += "Fail in TestStudent2.\n";
                fb += "Failure in the accessor or mutator for studentName.\n";
                fail(fb);
            }
        } 
        catch (Exception e)
        {
            fb += "Fail in TestStudent2.\n";
            fb += "Can't access studentName field.\n";
            fail(fb);
        }        
    }
    
    /**
     * Check the accessor and mutator for proper operation.
     * @param testData The credits value to set for testing.
     */
    public void checkCreditsAM(int testData)
    {
        String fb = "";
        try 
        {
            Student student = new Student("", 0, 0);
            student.setCredits(testData);            
            int setData = student.getCredits();

            if (setData != testData)
            {
                fb += "Fail in TestStudent2.\n";
                fb += "Failure in the accessor or mutator for credits.\n";
                fail(fb);
            }
        } 
        catch (Exception e)
        {
            fb += "Fail in TestStudent2.\n";
            fb += "Can't access credits field.\n";
            fail(fb);
        }        
    }
    
    /**
     * Check the accessor and mutator for proper operation.
     * @param testData The average grade value to set for testing.
     */
    public void checkAverageGradeAM(double testData)
    {
        String fb = "";
        try 
        {
            Student student = new Student("", 0, 0);
            student.setAverageGrade(testData);            
            double setData = student.getAverageGrade();

            if (setData != testData)
            {
                fb += "Fail in TestStudent2.\n";
                fb += "Failure in the accessor or mutator for " 
                    + "averageGrades.\n";
                fail(fb);
            }
        } 
        catch (Exception e)
        {
            fb += "Fail in TestStudent2.\n";
            fb += "Can't access averageGrade field.\n";
            fail(fb);
        }        
    }    
    
    /**
     * Check the accessor and mutator for proper operation.
     * @param testName The name value to set for testing.
     * @param testCredits The credit value to set for testing.
     * @param testAverage The grade average value to set for testing.
     */
    public void checkConstructor(String testName, int testCredits, 
        double testAverage)
    {
        String fb = "";
        try 
        {
            Student student = new Student(testName, testCredits, 
                testAverage);
            String setName = student.getStudentName();
            int setCredits = student.getCredits();
            double setAverage = student.getAverageGrade();

            if (!testName.equals(setName) || testCredits != setCredits 
                || testAverage != setAverage)
            {
                fb += "Fail in TestStudent2.\n";
                fb += "Failure in the student constructor.\n";
                fail(fb);
            }
        } 
        catch (Exception e)
        {
            fb += "Fail in TestStudent2.\n";
            fb += "Can't access one or more fields.\n";
            fail(fb);
        }    
    }
    
    /**
     * Check the accessor and mutator for proper operation.
     * @param testName The name value to set for testing.
     * @param testCredits The credit value to set for testing.
     * @param testAverage The grade average value to set for testing.
     * @param expected The letter grade that should be returned from
     * the students letterGrade method given the testAverage value.
     */
    public void checkLetterGrade(String testName, int testCredits, 
        double testAverage, char expected)
    {
        String fb = "";
        try 
        {
            Student student = new Student(testName, testCredits, testAverage);
            char letterGrade = student.letterGrade();
            
            if (letterGrade != expected)
            {
                fb += "Fail in TestStudent2.\n";
                fb += "Failure in the letterGrade method.\n";
                fail(fb);
            }
        } 
        catch (Exception e)
        {
            fb += "Fail in TestStudent2.\n";
            fb += "Error accessing letterGrade method.\n";
            fail(fb);
        }        
    }    
    
    /**
     * Check the hasPassed method.
     * @param grade The letter grade to use for testing.
     * @param expected The string that should be returned
     * from hasPassed given the value in grade.
     */
    public void checkHasPassed(char grade, String expected)
    {
        String fb = "";
        try 
        {
            Student student = new Student("A", 1, 2.0);
            String result = student.hasPassed(grade);
            
            if (!result.equals(expected))
            {
                fb += "Fail in TestStudent2.\n";
                fb += "Failure in the hasPassed method.\n";
                fail(fb);
            }
        } 
        catch (Exception e)
        {
            fb += "Fail in TestStudent2.\n";
            fb += "Error accessing letterGrade method.\n";
            fail(fb);
        }        
    }   
    
    /**
     * Check the gradeCredit method.
     * @param testName The name value to set for testing.
     * @param testCredits The credit value to set for testing.
     * @param testAverage The grade average value to set for testing.
     * @param requiredCredits The number of credits required by the
     * program.
     * @param expected The gradeCredit value that should be returned
     * from the students gradeCredits method given the credit hours
     * and required credits.
     */
    public void checkGradeCredits(String testName, int testCredits, 
        double testAverage, int requiredCredits, double expected)
    {
        double high = expected + .01;
        double low = expected - .01;

        String fb = "";
        try 
        {
            Student student = new Student(testName, testCredits, testAverage);
            double gradeCredits = student.gradeCredits(requiredCredits);
            
            if (gradeCredits < low || gradeCredits > high)
            {
                fb += "Fail in TestStudent2.\n";
                fb += "Failure in the gradeCredits method.\n";
                fail(fb);
            }
        } 
        catch (Exception e)
        {
            fb += "Fail in TestStudent2.\n";
            fb += "Error accessing gradeCredits method.\n";
            fail(fb);
        }        
    }    
}
