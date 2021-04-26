package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private static int totalExpenses;
    private static int totalMoneyEarned;

//    Constructor for the class
    public School(List<Student> students, List<Teacher> teachers){
        this.students = students;
        this.teachers = teachers;
        totalExpenses = 0;
        totalMoneyEarned = 0;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void updateStudents(Student student) {
        students.add(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void updateTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public int getTotalExpenses() {
        return totalExpenses;
    }

    public static void updateTotalExpenses(int Expenses) {

        totalExpenses -= Expenses;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
}
