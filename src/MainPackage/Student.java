package MainPackage;
import java.util.ArrayList;

public class Student 
{	
	private String name;
	private int age;
	private String username;
	private String DOB;
	private String userID;
	private CourseProgramme course;
	private ArrayList<Module> modules;
	
	public Student(String name, int age, String DOB, CourseProgramme course, ArrayList<Module> modules ) 
	{
		this.name = name;
		this.age = age;
		username = (name + age).replaceAll(" ", "");
		this.DOB = DOB;
		this.course = course;
		this.modules = modules;
	}
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setCourse(CourseProgramme course) 
	{
		this.course = course;
	}
	
	public CourseProgramme getCourse() 
	{
		return course;
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

}
