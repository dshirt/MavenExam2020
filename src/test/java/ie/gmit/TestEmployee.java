/*
 * John Lawless
 * 9/3/2020
 * G00351835@gmit.ie
 * This is an Employee  Test Class created for a maven in class exam
 *It Tests the Employee Class and a jacoco report is created at the end of the test
 * The initial test, tests all parameters of the Employee class as valid inputs
 * The Mr title is also checked as valid in this initial test.
 * */

package ie.gmit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestEmployee {

    Employee employee;

    /*All parameters are tested as valid in this initial test so no exceptions
    * are thrown, also using this so specifically test the title parameter for a Mr input*/
    @DisplayName("***************Testing the creation of an Employee object with all valid parameters testing for title Mr" )
    @Test
    void testConstructorEmployeeTitleMr(){
        employee = new Employee("Mr", "John Lawless", "12345T", "0860498", "Full-Time", 49);
        assertEquals("Mr", employee.getTitle());
    }


    /*Testing the Mrs title input, alll other parameters also valid*/
    @DisplayName("***************Testing the creation of an Employee object title Mrs")
    @Test
    void testConstructorEmployeeTitleMrs(){
        employee = new Employee("Mrs", "Mary Lawless", "12345T", "0860498", "Full-Time", 49);
        assertEquals("Mrs", employee.getTitle());
    }

    @DisplayName("***************Testing the creation of an Employee object title Ms")
    @Test
    void testConstructorEmployeeTitleMs(){
        employee = new Employee("Ms", "Eilidh Lawless", "12345T", "0860498", "Part-Time", 49);
        assertEquals("Ms", employee.getTitle());
    }
    //Test invalid title input
    @DisplayName("***************Testing the creation of an Employee object  Invalid title ")
    @Test
    void testConstructorEmployeeInvalidTitle(){
        final String invalid = "Title not valid";
        Exception title = assertThrows(IllegalArgumentException.class,()->new Employee("M", "Eilidh Lawless",
                "12345T", "0860498", "Part-Time", 49));
        assertEquals(invalid, title.getMessage());
    }

    //test name too short
    @DisplayName("***************Testing the creation of an Employee object name length too short ")
    @Test
    void testConstructorEmployeeInvalidNameLengthToShort(){
        final String invalid = "Your name must contain 5 to 22 characters";
        Exception name = assertThrows(IllegalArgumentException.class,()->new Employee("Ms", "Eil",
                "12345T", "0860498", "Part-Time", 49));
        assertEquals(invalid, name.getMessage());
    }

    //test name too long
    @DisplayName("***************Testing the creation of an Employee object name length too long ")
    @Test
    void testConstructorEmployeeInvalidNameLengthToLong(){
        final String invalid = "Your name must contain 5 to 22 characters";
        Exception name = assertThrows(IllegalArgumentException.class,()->new Employee("Ms", "abcdefghijklmnopqrstuvwxyz",
                "12345T", "0860498", "Part-Time", 49));
        assertEquals(invalid, name.getMessage());
    }


    //test incorrect pps length
    @DisplayName("***************Testing the creation of an Employee object PPs incorrect length ")
    @Test
    void testConstructorEmployeePPSIncorrectLength(){
        final String invalid = "PPS not valid";
        Exception message = assertThrows(IllegalArgumentException.class,()->new Employee("Ms", "Eilidh Lawless",
                "12345", "0860498", "Part-Time", 49));
        assertEquals(invalid, message.getMessage());
    }

    //test incorrect Phone number length
    @DisplayName("***************Testing the creation of an Employee object Phone number incorrect length ")
    @Test
    void testConstructorEmployeePhoneNumberLength(){
        final String invalid = "Phone number not valid";
        Exception message = assertThrows(IllegalArgumentException.class,()->new Employee("Ms", "Eilidh Lawless",
                "12345T", "086049", "Part-Time", 49));
        assertEquals(invalid, message.getMessage());
    }

    //test incorrect Employement type
    @DisplayName("***************Testing the creation of an Employee object incorrect Employment type ")
    @Test
    void testConstructorEmployeeEmploymentType(){
        final String invalid = "Employment Type not valid";
        Exception message = assertThrows(IllegalArgumentException.class,()->new Employee("Ms", "Eilidh Lawless",
                "12345T", "0860492", "No-Time", 49));
        assertEquals(invalid, message.getMessage());
    }

    //test under age
    @DisplayName("***************Testing the creation of an Employee object under age ")
    @Test
    void testConstructorEmployeeIncorrectAge(){
        final String invalid = "You are under 18";
        Exception message = assertThrows(IllegalArgumentException.class,()->new Employee("Ms", "Eilidh Lawless",
                "12345T", "0860492", "Full-Time", 16));
        assertEquals(invalid, message.getMessage());
    }




}
