import java.util.ArrayList;

/**
 * DemoWorker.
 * 
 * @author Dylan Lancaster
 * @version 12/03/2019
 */
public class DemoWorker
{
    private ArrayList<Employee> employees;
    
    /**
     * No-arg constructor for DemoWorker.
     */
    public DemoWorker()
    {
        employees = new ArrayList<Employee>();

        employees.add(new ProductionWorker("Emma Watson", "123-A",
                        "12/1/2012", ShiftType.DAY, 7.25, 20));
        employees.add(new ShiftSupervisor("Robert Downey Jr.", "354-D",
                        "3/1/2010", ShiftType.NIGHT, 32000, 2000));
        employees.add(new TeamLeader("Morgan Freeman", "867-T",
                        "2/1/2001", ShiftType.DAY, 17.25, 40, 10, 82.0));

        for (Employee employee : employees)
        {
            System.out.println(employee);
        }

        for (Employee employee : employees)
        {
            System.out.printf("%s:%s:$%.2f\n", employee.getName(),
                employee.getIdNumber(), employee.computeWeeklyPay());
        }
    }

    /**
     * Accessor for employees.
     * @return employees
     */
    public ArrayList<Employee> getEmployees()
    {
        return this.employees;
    }

    /**
     * Mutator for employees.
     * @param employees employees
     */
    public void setEmployees(ArrayList<Employee> employees)
    {
        employees = this.employees;
    }
}
