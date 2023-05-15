package dz5.oop;

public class Maine {
    public static void main(String[] args) {
        // Создание объекта Employee
        Employee employee = new Employee("Андрей Иванов", "Логист", "IvanovAndreyOdessa@gmail.com", "0680639520", 26);
        System.out.println("Имя сотрудника: " + employee.getName());
        System.out.println("Должность сотрудника: " + employee.getPosition());
        System.out.println("Email сотрудника: " + employee.getEmail());
        System.out.println("Телефон сотрудника: " + employee.getPhone());
        System.out.println("Возраст сотрудника: " + employee.getAge());
    }
}
