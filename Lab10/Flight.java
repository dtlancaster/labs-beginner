/**
 * Flight class.
 *
 * @author Dylan Lancaster
 * @version 11/12/2019
 */
public class Flight
{
    private int flightNumber;
    private String destination;
    private Pilot pilot;
    private String date;

    /**
     * No-arg constructor for Flight.
     */
    public Flight()
    {
        setFlightNumber(0);
        setDestination("");
        setPilot(new Pilot());
        setDate("");
    }

    /**
     * Arg constructor for Flight.
     * @param flightNumber flightNumber
     * @param destination destination
     * @param pilot pilots
     * @param date date
     */
    public Flight(int flightNumber, String destination,
                  Pilot pilot, String date)
    {
        setFlightNumber(flightNumber);
        setDestination(destination);
        setPilot(pilot.copy());
        setDate(date);
    }

    /**
     * Accessor for flightNumber.
     * @return flightNumber
     */
    public int getFlightNumber()
    {
        return this.flightNumber;
    }

    /**
     * Accessor for destination.
     * @return destination
     */
    public String getDestination()
    {
        return this.destination;
    }

    /**
     * Accessor for pilot.
     * @return pilot
     */
    public Pilot getPilot()
    {
        return pilot.copy();
    }

    /**
     * Accessor for date.
     * @return date
     */
    public String getDate()
    {
        return this.date;
    }

    /**
     * Mutator for flightNumber.
     * @param flightNumber flightNumber
     */
    public void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    /**
     * Mutator for destination.
     * @param destination destination
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    /**
     * Mutator for pilot.
     * @param pilot pilot
     */
    public void setPilot(Pilot pilot)
    {
        this.pilot = pilot.copy();
    }

    /**
     * Mutator for date.
     * @param date date
     */
    public void setDate(String date)
    {
        this.date = date;
    }

    /**
     * toString.
     * @return string
     */
    public String toString()
    {
        return "Flt#: " + getFlightNumber() + "\t"
               + "Dest: " + getDestination() + "\t"
               + "Plt: " + getPilot().getName() + "\t"
               + "Date: " + getDate();
    }

    /**
     * copy.
     * @return Flight
     */
    public Flight copy()
    {
        return new Flight(getFlightNumber(), getDestination(),
                          getPilot(), getDate());
    }
}
