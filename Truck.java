/*
* This program is a Truck class.
*
* @author  Abdul Basit
* @version 1.0
* @since   2022-02-02
*/

/**
 * Truck.
 */
public class Truck extends AbstractVehicle {
    /**
    * License plate variable.
    */
    private String licensePlate;

    /**
    * Constructor.
    *
    * @param inicialColour colour
    * @param topSpeed speed
    * @param inicialPlate plate
    * @param newTireNum tire number
    */
    public Truck(final String inicialColour, final int topSpeed,
                 final int newTireNum, final String inicialPlate) {
        super(inicialColour, topSpeed, newTireNum);
        this.licensePlate = inicialPlate;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
    * Setter.
    *
    * @param newPlate good
    */
    public void setLicensePlate(final String newPlate) {
        this.licensePlate = newPlate;
    }

    /**
    * Print all.
    */
    public void status() {
        super.status();
        System.out.println("License plate: " + licensePlate);
    }

    /**
    * Apply air.
    *
    * @param airPressure air pressure
    */
    public void applyAir(final int airPressure) {
        super.setSpeed(super.getSpeed() - airPressure / 2);
    }
}
