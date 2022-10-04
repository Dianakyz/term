import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        findAllEmployees();
        summAllSalary();
        minSalary();
        maxSalary();
        averageSalary();
        listAllFullName();
    }

    static final List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee(0, "Иванов Иван Иванович", 1, 50_000),
            new Employee(0, "Алксеев Алексей Алексеевич", 1, 100_000),
            new Employee(0, "Бобова Мария Павловна", 4, 70_000),
            new Employee(0, "Кузьмин Максим Александрович", 5, 68_000),
            new Employee(0, "Казанцева Светлана Валерьевна", 3, 44_000),
            new Employee(0, "Пушкин Александр Сергеевич", 2, 99_000),
            new Employee(0, "Кузьмич Юрий Юрьевич", 2, 110_000),
            new Employee(0, "Золотовский Демид Олегович", 5, 75_000),
            new Employee(0, "Хромов Илья Романович", 4, 91_500),
            new Employee(0, "Федоров Павел Валерьевич", 3, 115_000)
    ));

    public static void findAllEmployees() {
        System.out.println("Список всех сотрудников:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }

    public static int summAllSalary() {
        int summ = 0;
        for (int e = 0; e < employees.size(); e++) {
            summ = summ + employees.get(e).getSalary();
        }
        System.out.println("Сумма всех зарплат за месяц составляет: " + summ + " рублей.");
        return summ;
    }

    public static void minSalary() {
        int min = Integer.MAX_VALUE;
        String minName = null;
        for (int a = 0; a < employees.size(); a++) {
            if (employees.get(a).getSalary() < min) {
                min = employees.get(a).getSalary();
                minName = employees.get(a).getFullName();
            }
        }
        System.out.println("Минимальная зарплата составляет: " + min + " рублей. ФИО сотрудника: " + minName);
    }

    public static void maxSalary() {
        int max = Integer.MIN_VALUE;
        String maxName = null;
        for (int b = 0; b < employees.size(); b++) {
            if (employees.get(b).getSalary() > max) {
                max = employees.get(b).getSalary();
                maxName = employees.get(b).getFullName();
            }
        }
        System.out.println("Максимальная зарплата составляет: " + max + " рублей. ФИО сотрудника: " + maxName);
    }

    public static void averageSalary() {
        int average = summAllSalary() / employees.size();
        System.out.println("Среднее значение зарплат: " + average + " рублей");
    }

    public static void listAllFullName() {
        for (int c = 0; c < employees.size(); c++) {
            System.out.println(employees.get(c).getFullName());
        }
    }
}