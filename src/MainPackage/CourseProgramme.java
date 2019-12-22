package MainPackage;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme 
{
	private String name;
	private ArrayList<Module> modules;
	private ArrayList<Student> enrolledStudents;
	private DateTime startTime;
	private DateTime endTime;
	
	public CourseProgramme(String name, ArrayList<Module> modules, ArrayList<Student> enrolledStudents, DateTime startTime, DateTime endTime)
	{
		this.name = name;
		this.modules = modules;
		this.enrolledStudents = enrolledStudents;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void addModule(Module module) 
	{
		modules.add(module);
	}
	
	public void addModules(ArrayList<Module> modules, boolean overwrite) 
	{
		if(overwrite == false) 
		{
			this.modules.addAll(modules);
		}
		else 
		{
			this.modules = modules;
		}
	}
	
	public ArrayList<Module> getModules() 
	{
		return modules;
	}
	
	public void addStudent(Student student) 
	{
		enrolledStudents.add(student);
	}
	
	public void addStudents(ArrayList<Student> students, boolean overwrite) 
	{
		if(overwrite == false) 
		{
			this.enrolledStudents.addAll(students);
		}
		else 
		{
			this.enrolledStudents = students;
		}
	}
	
	public ArrayList<Student> getStudents() 
	{
		return enrolledStudents;
	}
	
}
