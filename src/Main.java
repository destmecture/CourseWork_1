public class Main {


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Романов Олег Дмитриевич", 1, 67400);
        employees[1] = new Employee("Караева Мария Сергеевна", 5, 63500);
        employees[2] = new Employee("Матвеева Александра Игоревна", 4, 57823);
        employees[3] = new Employee("Савичев Павел Анатольевич", 2, 70100);
        employees[4] = new Employee("Паненков Владимир Инванович", 2, 54270);
        employees[5] = new Employee("Суриков Кирилл Генадьевич", 3, 42660);
        employees[6] = new Employee("Малютина Татьяна Сергеевна", 1, 51265);
        employees[7] = new Employee("Гриньева Светлана Вячеславовна", 3, 47842);
        employees[8] = new Employee("Ольшевский Дмитрий Андреевич", 5, 49080);
        employees[9] = new Employee("Ряшитов Семён Данилович", 2, 52210);


        getAllInfo(employees);
        getAllSalary(employees);
        getMinimalSalary(employees);
        getMaximalSalary(employees);
        getAverageValue(employees);
        getAllEmployersName(employees);
    }

    public static void getAllInfo(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public static int getCountOfAllSalary(Employee[] employees) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            count = count + employees[i].getSalary();
        }
        return count;
    }
    public static void getAllSalary(Employee[] employees) {
        System.out.println("\nСумма затрат на зарплаты в месяц = "+getCountOfAllSalary(employees)+" рублей");
    }

    public static void getMinimalSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        String name = employees[0].getEmployeeName();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                name = employees[i].getEmployeeName();
            }
        }
        System.out.println("\nМинимальная зарплата у сотрудника "+name+", она составляет "+min+" рублей");
    }public static void getMaximalSalary(Employee[] employees) {
        int max = employees[0].getSalary();
        String name = employees[0].getEmployeeName();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                name = employees[i].getEmployeeName();
            }
        }
        System.out.println("\nМаксимальная зарплата у сотрудника "+name+", она составляет "+max+" рублей");
    }
    public static void getAverageValue(Employee[] employees) {
        System.out.println("\nСредняя зарплата равна "+getCountOfAllSalary(employees)/employees.length+" рублей");
    }

    public static void getAllEmployersName(Employee[] employees) {
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getEmployeeName());
        }
    }

}
