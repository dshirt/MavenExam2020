/*
* John Lawless
* G00351835@gmit.ie
* This is an Employee Class created for a maven test
* it must contain:
* Title, name, pps number, phone, employment type and age
* Title must be a valid title Mr, Mrs, Ms
* Name has length restrictions
* PPS number must be 7 characters long
* Phone Number must be 6 characters long
* Employment Type can only be Full-Time or Part-Time
* Age must be over 18 to be valid
* */


package ie.gmit;

public class Employee {

    private String title;
    private String name;
    private String ppsNumber;
    private String phoneNumber;
    private String employmentType;
    private int age;

    public Employee(String title, String name, String ppsNumber, String phoneNumber, String employmentType, int age) {
        if ((title.equalsIgnoreCase("Mr") || (title.equalsIgnoreCase("Mrs"))||
                (title.equalsIgnoreCase("Ms"))))
            this.title = title;
        else
            throw new IllegalArgumentException("Title not valid");
        if((name.length()<5) || (name.length()>22))
            throw new IllegalArgumentException("Your name must contain 5 to 22 characters");
        else
            this.name = name;
        if(ppsNumber.length()== 6)
            this.ppsNumber = ppsNumber;
        else
            throw new IllegalArgumentException("PPS not valid");
        if(phoneNumber.length()== 7)
            this.phoneNumber = phoneNumber;
        else
            throw new IllegalArgumentException("Phone number not valid");
        if (employmentType.equalsIgnoreCase("Full-time") ||
                employmentType.equalsIgnoreCase("Part-time"))
            this.employmentType = employmentType;
        else
            throw new IllegalArgumentException("Employment Type not valid");
        if (age < 18)
            throw new IllegalArgumentException("You are under 18");
        else
            this.age = age;

    }

    public String getTitle() {
        return title;
    }

}
