public class Employee {

    private final String fullName;
    private int departament;
    private int salary;
    private int id;

    private static int counter = 1;



    public Employee(int id, String fullName, int departament, int salary) {
        this.id = counter++;
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;

    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return this.id + ". " + "Ф.И.О. : " + this.fullName + ". Департамент:  " + this.departament + ". Зарплата:  " + this.salary + " рублей.";
    }


}
