package pl.dev.java.essentials.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> employeeNames;

    public Employees() {
        this.employeeNames = new ArrayList<>();
    }

    public Employees(List<String> employeeNames) {
        this.employeeNames = employeeNames;
    }

    public void loadFromDb() {
        //reads all employees from db
        employeeNames.add("Jezyk");
        employeeNames.add("NieJEzyk");
        employeeNames.add("Foo");
        employeeNames.add("Bar");
    }

    public List<String> getEmployeeNames() {
        return employeeNames;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> employeeNames = new ArrayList<>(this.getEmployeeNames());
        return new Employees(employeeNames);
    }
}
