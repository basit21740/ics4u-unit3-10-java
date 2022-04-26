/*
* This program is a Vehicle class.
*
* @author  Abdul Basit
* @version 1.0
* @since   2022-02-22
*/

/**
 * Vehicle.
 */
public abstract class AbstractVehicle {
    /**
    * Speed variable.
    */
    private int speed;

    /**
    * MaxSpeed variable.
    */
    private int maxSpeed;

    /**
    * Tire number variable.
    */
    private int tireNum;

    /**
    * Colour variable.
    */
    private String colour;

    /**
    * Constructor.
    *
    * @param inicialColour colour
    * @param topSpeed speed
    * @param newTireNum tire number
    */
    public AbstractVehicle(final String inicialColour, final int topSpeed,
                   final int newTireNum) {
        this.colour = inicialColour;
        this.maxSpeed = topSpeed;
        this.tireNum = newTireNum;
        this.speed = 0;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getTireNum() {
        return this.tireNum;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public String getColour() {
        return this.colour;
    }

    /**
    * Setter.
    *
    * @param newSpeed good
    */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }

    /**
    * Setter.
    *
    * @param newColour good
    */
    public void setColour(final String newColour) {
        this.colour = newColour;
    }

    /**
    * Print all.
    */
    public void status() {
        System.out.println("Speed: " + speed + "\nMaxSpeed: " + maxSpeed
                           + "\nColour: " + colour + "\nNumber of Tires: "
                           + tireNum);
    }

    /**
    * Accelerate.
    *
    * @param accPow power of acceleration
    * @param accTime time of acceleration
    */
    public void accelerate(final int accPow, final int accTime) {
        this.speed = (accPow * accTime) + this.speed;
        if (this.speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    /**
    * Breake.
    *
    * @param breakPow break power
    * @param breakTime time of break
    */
    public void breake(final int breakPow, final int breakTime) {
        this.speed = this.speed - (breakPow * breakTime);
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
