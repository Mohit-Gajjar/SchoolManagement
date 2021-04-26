package SchoolManagement;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

//    Class constructor
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

//    Function for getting the teacher`s salary from the student`s paid fees
    public void setSalary(){
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void reciveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalExpenses(salary);
        System.out.println("Salary Recieved.....!");
    }
}
