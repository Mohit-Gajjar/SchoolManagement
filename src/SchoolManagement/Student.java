package SchoolManagement;
//This is the student class which has the info related to the student that is Student`s fees, id, grade, name.
public class Student {
    private int id;
    private int feesPending;
    private int totalFees;
    private String name;
    private int grade;
    private int feesPaid;

//    Class constructor
    public Student(String name, int id, int grade){
        feesPending = 0;
        feesPending = 0;
        totalFees = 10000;
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

//    updating the grade for the student
    public void setGrade(int grade){
        this.grade = grade;
    }

//Function for getting fees
    public void payFees(int fees){
         if (feesPaid <= totalFees){
             totalFees += fees;
             School.updateTotalMoneyEarned(totalFees);
         } else {
             System.out.println("Total Fees are paid...!");
         }
    }

//    Function for getting the remaining fees
public int getRemainingFees(){
        return totalFees -= feesPaid;
}
    public int getId() {
        return id;
    }

    public int getFeesPending() {
        return feesPending;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

