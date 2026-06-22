class User{
    String name ;
    String email;

    void login(){
        System.out.println(name+"Logged In");

    }
}

class Student extends User 
{
    String course;
    void showStudent(){
        System.out.println("------Student Details------");
        System.out.println("Name :"+name);
        System.out.println("Email :"+ email);
        System.out.println("Course :"+ course);
    } 
}

class Teacher extends User{
    String subject;

    void showTeacher(){
        System.out.println("------Teacher Deatails------");
        System.out.println("Name :" + name);
        System.out.println("Email :"+ email);
        System.out.println("Subject :"+ subject);

    }
}
public class main1{
    public static void main(String[] args ){
        Student s1 = new Student();
        s1.name = "Aman";
        s1.email = "aman@gamil.com";
        s1.course = "Java";

        Student s2 = new Student();
        s2.name="Priya";
        s2.email = "priya@gmail.com";
        s2.course= "Python";

        Teacher t1 = new Teacher();
        t1.name = "Ajay";
        t1.email = "ajay@gmail.com";
        t1.subject= "Web Development";

        s1.login();
        s1.showStudent();

        System.out.println();

        s2.login();
        s2.showStudent();

        System.out.println();

        t1.login();
        t1.showTeacher();
    }
} 