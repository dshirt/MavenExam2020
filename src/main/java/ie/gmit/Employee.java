/*
* John Lawless
* G00351835@gmit.ie
* This is an Employee Class created for a maven test
* it must contain:
* Title, name, pps number, phone, employment type and age
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
        if((name.length()<5) && (name.length()>22))
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
            throw new IllegalArgumentException("PPS not valid");
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

    public String getName() {
        return name;
    }

    public String getPpsNumber() {
        return ppsNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public int getAge() {
        return age;
    }


}
