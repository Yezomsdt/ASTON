package HW2;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("ФИО: " + this.fullName);
        System.out.println("Должность: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Телефон: " + this.phone);
        System.out.println("Зарплата: " + this.salary);
        System.out.println("Возраст: " + this.age);
    }
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("ДИМАСТА", "Тестировщик", "Yezomsdt@gmail.com", "+7 911 420-13-37", 0, 29);
        persArray[1] = new Employee("Петров Петр Петрович", "Аналитик", "petrov@example.com", "+7 911 123-45-67", 50000, 28);
        persArray[2] = new Employee("Сидоров Сидор Сидорович", "Дизайнер", "sidorov@example.com", "+7 911 111-11-11", 55000, 35);
        persArray[3] = new Employee("Иванова Иванна Ивановна", "Директриса", "ivanova@example.com", "+7 922 222-22-22", 62000, 32);
        persArray[4] = new Employee("Васильева Василиса Васильевна", "Повар", "vasilieva@example.com", "+7 933 333-33-33", 48000, 27);
        for (Employee employee : persArray) {
            employee.printInfo();
        }
    }
}