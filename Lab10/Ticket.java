/**
 * Ticket class.
 *
 * @author Dylan Lancaster
 * @version 11/12/2019
 */
public class Ticket
{
    private Customer customer;
    private Flight flight;

    /**
     * Arg constructor for Ticket.
     * @param customer customer
     * @param flight flight
     */
    public Ticket(Customer customer, Flight flight)
    {
        setCustomer(new Customer(customer));
        setFlight(flight.copy());
    }

    /**
     * Accessor for customer.
     * @return customer
     */
    public Customer getCustomer()
    {
        return new Customer(this.customer);
    }

    /**
     * Accessor for flight.
     * @return flight
     */
    public Flight getFlight()
    {
        return this.flight.copy();
    }

    /**
     * Mutator for customer.
     * @param customer customer
     */
    public void setCustomer(Customer customer)
    {
        this.customer = new Customer(customer);
    }

    /**
     * Mutator for flight.
     * @param flight flight
     */
    public void setFlight(Flight flight)
    {
        this.flight = flight.copy();
    }

    /**
     * toString.
     * @return string
     */
    public String toString()
    {
        String ticket = ""
            + "******** TICKET ********" + "\n"
            + "* Name: " + getCustomer().getName() + "\n"
            + "* SSN: " + getCustomer().getSsn() + "\n"
            + "* Flight: " + getFlight().getFlightNumber() + "\n"
            + "* Date: " + getFlight().getDate() + "\n"
            + "* Destination: " + getFlight().getDestination() + "\n"
            + "************************";
        
        return ticket;
    }
}
