class Employee {

    private final String fullName;
    private final String post;
    private final String eMail;
    private final String phoneNumber;
    private final double salary;
    private final int age;

    public Employee (String fullName,String post,String eMail,String phoneNumber,double salary,int age) {
        this.fullName = fullName;
        this.post = post;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo () {
        System.out.println("Ф.И.О: " + fullName);
        System.out.println("Должность: " + post);
        System.out.println("Email: " + eMail);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}


