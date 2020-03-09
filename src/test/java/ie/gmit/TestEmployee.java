/*
 * John Lawless
 * G00351835@gmit.ie
 * This is an Employee  Test Class created for a maven test
 *It Test the Employee Class and a jacoco report is created at the end of the test
 * */

package ie.gmit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestEmployee {

    Employee employee;

    @DisplayName("***************Testing the creation of an Employee object title Mr")
    @Test
    void testConstructorEmployeeTitleMr(){
        employee = new Employee("Mr", "John Lawless", "12345T", "0860498", "Full-Time", 49);
        assertEquals("Mr", employee.getTitle());
    }

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



}
