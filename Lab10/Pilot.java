/**
 * Pilot class.
 *
 * @author Dylan Lancaster
 * @version 11/12/2019
 */
public class Pilot
{
    private String name;
    private String license;

    /**
     * No-arg constructor for Pilot.
     */
    public Pilot()
    {
        setName("");
        setLicense("");
    }

    /**
     * Arg constructor for Pilot.
     * @param name name
     * @param license license
     */
    public Pilot(String name, String license)
    {
        setName(name);
        setLicense(license);
    }

    /**
     * Accessor for name.
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Accessor for license.
     * @return license
     */
    public String getLicense()
    {
        return license;
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
     * Mutator for license.
     * @param license license
     */
    public void setLicense(String license)
    {
        this.license = license == null ? "" : license;
    }

    /**
     * Copy.
     * @return pilot
     */
    public Pilot copy()
    {
        return new Pilot(getName(), getLicense());
    }

    /**
     * toString.
     * @return string
     */
    public String toString()
    {
        return "Name: " + getName() + " - License: " + getLicense();
    }

    /**
     * equals.
     * @param pilot pilot
     * @return equals
     */
    public boolean equals(Pilot pilot)
    {
        return toString().equals(pilot.toString());
    }
}
