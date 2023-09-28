import java.util.ArrayList;

interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}

interface Job {
    String getPosition();
    void setPosition(String position);
    int getEmpID();
    void setEmpID(int empID);
}

class Project {
    private String projectName;
    private String description;

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public String getProject() {
        return projectName + " : " + description;
    }
}

class Employee implements Person, Job {
    private String name;
    private int age;
    private String position;
    private int empID;
    private ArrayList<Project> myProjects;

    public Employee(String name, int age, String position, int empID) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.empID = empID;
        this.myProjects = new ArrayList<>();
    }

    public void AddProject(Project project) {
        myProjects.add(project);
    }

    public void ShowDetails() {
        System.out.println("***************");
        System.out.println("Name : " + getName());
        System.out.println("position : " + getPosition());
        System.out.println("EmpID : " + String.format("%04d", getEmpID())); 
        System.out.println("Project");
        for (Project project : myProjects) {
            System.out.println("    " + project.getProject());
        }
        // System.out.println("***************");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public int getEmpID() {
        return empID;
    }

    @Override
    public void setEmpID(int empID) {
        this.empID = empID;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Employee tom = new Employee("Tom", 30, "UX/UI", 1);
        Employee tim = new Employee("Tim", 25, "FrontEnd", 2);

       
        Project webA = new Project("Web A", "Developing a web application");
        Project mobileAppA = new Project("Mobile app A", "Developing a mobile app");

        
        tom.AddProject(webA);
        tom.AddProject(mobileAppA);
        tim.AddProject(webA);

       
        tom.ShowDetails();
        tim.ShowDetails();
    }
}
