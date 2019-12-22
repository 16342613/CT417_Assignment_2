package MainPackage;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import org.joda.time.DateTime;

public class tests 
{
	Student testCase_Tiernan = new Student("Testcase Tiernan", 20, "1/1/99", null, new ArrayList<Module>());
	Student barack_Obama = new Student("Barack Obama", 22, "3/3/97", null, new ArrayList<Module>());
	Student donald_Trump = new Student("Donald Trump", 30, "3/3/89", null, new ArrayList<Module>());
	
	Module ct417 = new Module("Software Engineering", "CT417", new ArrayList<Student>(), new ArrayList<CourseProgramme>());
	Module ct404 = new Module("Graphics and Image Processing", "CT404", new ArrayList<Student>(), new ArrayList<CourseProgramme>());
	Module ct413 = new Module("Final Year Project", "CT413", new ArrayList<Student>(), new ArrayList<CourseProgramme>());
	
	CourseProgramme computerScience = new CourseProgramme("Computer Science", new ArrayList<Module>(), new ArrayList<Student>(), new DateTime(2019, 9, 1, 0, 0), new DateTime(2020, 5, 1, 0, 0));
	CourseProgramme computerEngineering = new CourseProgramme("Computer Engineering", new ArrayList<Module>(), new ArrayList<Student>(), new DateTime(2019, 9, 1, 0, 0), new DateTime(2020, 5, 1, 0, 0));
	
    @Test
	public void testStudent()
	{
    	testCase_Tiernan.addModule(ct417);
    	testCase_Tiernan.setCourse(computerScience);
    	
    	assertEquals(testCase_Tiernan.getUsername(), "TestcaseTiernan20");
    	assertEquals(testCase_Tiernan.getCourse().getName(), "Computer Science");
    	assertEquals(testCase_Tiernan.getModules().get(0).getName(), "Software Engineering");
	}
    
    @Test
	public void testModule()
	{
    	ct417.addStudents(new ArrayList<Student>() {{ add(testCase_Tiernan); add(barack_Obama); }}, true);
    	ct417.addAssociatedCourses(new ArrayList<CourseProgramme>() {{ add(computerScience); add(computerEngineering); }}, true);
    	
    	assertEquals(ct417.getName(), "Software Engineering");
    	assertEquals(ct417.getStudents().get(1).getUsername(), "BarackObama22");
    	assertEquals(ct417.getCourses().get(0).getName(), "Computer Science");
	}
    
    @Test
	public void testCourse()
	{
    	computerScience.addStudents(new ArrayList<Student>() {{ add(testCase_Tiernan); add(barack_Obama); add(donald_Trump);}}, true);
    	computerScience.addModules(new ArrayList<Module>() {{ add(ct417); add(ct404); add(ct413);}}, true);
    	
    	assertEquals(computerScience.getName(), "Computer Science");
    	assertEquals(computerScience.getStudents().get(2).getUsername(), "DonaldTrump30");
    	assertEquals(computerScience.getModules().get(1).getID(), "CT404");
	}
}
