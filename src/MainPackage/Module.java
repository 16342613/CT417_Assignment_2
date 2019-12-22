package MainPackage;
import java.util.ArrayList;

public class Module 
{
	private String name;
	private String ID;
	private ArrayList<Student> enrolledStudents;
	private ArrayList<CourseProgramme> associatedCourses;
	
	public Module(String name, String ID, ArrayList<Student> enrolledStudents, ArrayList<CourseProgramme> associatedCourses) 
	{
		this.name = name;
		this.ID = ID;
		this.enrolledStudents = enrolledStudents;
		this.associatedCourses = associatedCourses;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getID() 
	{
		return ID;
	}
	
	public void addStudent(Student student) 
	{
		enrolledStudents.add(student);
	}
	
	public void addStudents(ArrayList<Student> students, boolean overwrite) 
	{
		if(overwrite == false) 
		{
			enrolledStudents.addAll(students);
		}
		else 
		{
			enrolledStudents = students;
		}
	}
	
	public ArrayList<Student> getStudents() 
	{
		return enrolledStudents;
	}
	
	public void addAssociatedCourse(CourseProgramme course) 
	{
		associatedCourses.add(course);
	}
	
	public void addAssociatedCourses(ArrayList<CourseProgramme> courses, boolean overwrite)
	{
		if(overwrite == false) 
		{
			associatedCourses.addAll(courses);
		}
		else
		{
			associatedCourses = courses;
		}
	}
	
	public ArrayList<CourseProgramme> getCourses() 
	{
		return associatedCourses;
	}
}
