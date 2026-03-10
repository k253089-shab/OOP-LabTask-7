class Course{
    protected String courseCode;
    protected String courseName;
    protected int courseCredits;

    void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }

    void setCourseName(String courseName){
        this.courseName = courseName;
    }

    void setCourseCredits(int courseCredits){
        this.courseCredits = courseCredits;
    }
}


class UndergraduateCourse extends Course{

    protected String departmentName;
    protected int level;

    void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    void setLevel(int level){
        this.level = level;
    }
}


class Registration extends UndergraduateCourse{

    private Course course;
    private int numStudents;
    private int maxStudents;
    private boolean isClosed;

    void setCourse(Course course){
        this.course = course;
    }

    void setNumStudents(int numStudents){
        this.numStudents = numStudents;
    }

    void setMaxStudents(int maxStudents){
        this.maxStudents = maxStudents;
    }

    void setIsClosed(boolean isClosed){
        this.isClosed = isClosed;
    }

    void registerStudent(){
        if(isClosed){
            System.out.println("Course registration is closed.");
            return;
        }

        if(numStudents < maxStudents){
            numStudents++;
            System.out.println("Student registered successfully.");
        } else{
            System.out.println("Course is full.");
            isClosed = true;
        }
    }

    void displayDetails(){
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Department: " + departmentName);
        System.out.println("Level: " + level);
        System.out.println("Registered Students: " + numStudents);

        if(isClosed){
            System.out.println("Course is closed for registration.");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        UndergraduateCourse uc = new UndergraduateCourse();

        uc.setCourseCode("CS101");
        uc.setCourseName("Object Oriented Programming");
        uc.setCourseCredits(3);
        uc.setDepartmentName("Computer Science");
        uc.setLevel(2);


        Registration reg = new Registration();

        reg.setCourseCode(uc.courseCode);
        reg.setCourseName(uc.courseName);
        reg.setCourseCredits(uc.courseCredits);
        reg.setDepartmentName(uc.departmentName);
        reg.setLevel(uc.level);

        reg.setNumStudents(0);
        reg.setMaxStudents(3);
        reg.setIsClosed(false);


        reg.registerStudent();
        reg.registerStudent();
        reg.registerStudent();
        reg.registerStudent();


        System.out.println();
        reg.displayDetails();
    }
}
