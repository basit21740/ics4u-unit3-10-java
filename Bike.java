/*
* This program is a Bike class.
*
* @author  Abdul Basit Butt
* @version 1.0
* @since   2022-02-02
*/

/**
 * Bike.
 */
public class Bike extends AbstractVehicle {
    /**
    * Cadense variable.
    */
    private int cadense;

    /**
    * Constructor.
    *
    * @param inicialColour colour
    * @param topSpeed speed
    */
    public Bike(final String inicialColour, final int topSpeed) {
        super(inicialColour, topSpeed, 2);
        this.cadense = 0;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getCadense() {
        return this.cadense;
    }

    /**
    * Setter.
    *
    * @param newCadense good
    */
    public void setCadense(final int newCadense) {
        this.cadense = newCadense;
        super.setSpeed(cadense * 2);
        if (super.getSpeed() > super.getMaxSpeed()) {
            super.setSpeed(super.getMaxSpeed());
        }
    }

    /**
    * Print all.
    */
    public void status() {
        super.status();
        System.out.println("Cadense: " + this.cadense);
    }

    /**
    * Accelerate.
    *
    * @param accPow power of acceleration
    */
    public void accelerate(final int accPow) {
        this.setCadense(this.cadense + accPow);
    }

    /**
    * Ring bell.
    */
    public void ringBell() {
        System.out.println("\nDing, ding.\n");
    }
}
