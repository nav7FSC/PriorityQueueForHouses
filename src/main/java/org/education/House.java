package org.education;

/**
 * Represents a House with an owner and value.
 */
public class House {
    private String owner; // The owner of the house
    private int value;     // The value of the house

    /**
     * Default constructor for House.
     * Initializes the owner as an empty string and the value as 0.
     */
    public House() {
        this.owner = "";
        this.value = 0;
    }

    /**
     * Parameterized constructor for House.
     *
     * @param owner the owner of the house
     * @param value the value of the house
     */
    public House(String owner, int value) {
        this.owner = owner;
        this.value = value;
    }

    /**
     * Copy constructor for House.
     * Creates a deep copy of the given House instance.
     *
     * @param other the House object to copy
     */
    public House(House other) {
        this.owner = other.owner;
        this.value = other.value;
    }

    /**
     * Creates a deep copy of the current House instance.
     *
     * @return a new House object with the same values as the current instance
     */
    public House deepCopy() {
        return new House(this);
    }

    /**
     * Gets the owner of the house.
     *
     * @return the owner of the house
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the owner of the house.
     *
     * @param owner the new owner of the house
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Gets the value of the house.
     *
     * @return the value of the house
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the house.
     *
     * @param value the new value of the house
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Checks if two houses are equal by comparing their owners.
     *
     * @param obj the object to compare with
     * @return true if the owners are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        House house = (House) obj;
        return owner.equals(house.owner);
    }

    /**
     * Returns a string representation of the house in the format "owner - $value".
     *
     * @return a string representation of the house
     */
    @Override
    public String toString() {
        return owner + " - $" + value;
    }
}