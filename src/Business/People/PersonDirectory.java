/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    /*
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }*/
}