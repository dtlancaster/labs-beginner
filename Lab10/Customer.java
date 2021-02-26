/**
 * Customer class.
 *
 * @author Dylan Lancaster
 * @version 11/12/2019
 */
public class Customer
{
    private String name;
    private String ssn;

    /**
     * Arg constructor for Customer.
     * @param name name
     * @param ssn ssn
     */
    public Customer(String name, String ssn)
    {
        setName(name);
        setSsn(ssn);
    }

    /**
     * Arg constructor for Customer.
     * @param customer customer
     */
    public Customer(Customer customer)
    {
        setName(customer.getName());
        setSsn(customer.getSsn());
    }

    /**
     * Accessor for name.
     * @return name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Accessor for ssn.
     * @return ssn
     */
    public String getSsn()
    {
        return this.ssn;
    }

    /**
     * Mutator for name.
     * @param name name
     */
    public void setName(String name)
    {
        this.name = name == null ? "" : name;
    }

    /**
     * Mutator for ssn.
     * @param ssn ssn
     */
    public void setSsn(String ssn)
    {
        this.ssn = ssn == null ? "" : ssn;
    }

    /**
     * toString.
     * @return string
     */
    public String toString()
    {
        return "Name: " + getName() + " - SSN: " + getSsn();
    }
}
