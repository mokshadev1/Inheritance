class Employee {
    String company = "Skill Plus";

    void work()
    {
        System.out.println("Employee Working");
    }
}
class Manager extends Employee 
{
    void showDetails(){
        System.out.println("Company :" + super.company);
        super.work();
        System.out.println("Manager Working");

    }

}
public class UseSuperKeyword{
    public static void main(String[] args){
        Manager m1 = new Manager();
        m1.showDetails();
    }
}