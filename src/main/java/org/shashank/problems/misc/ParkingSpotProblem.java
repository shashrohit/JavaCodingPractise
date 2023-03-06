package org.shashank.problems.misc;
/*
1) The parking lot has multiple rows of spots.
2) The parking lot can park motorcycles, cars, and buses.
3) The parking lot has motorcycle spots, compact spots, and large spots.
4) A motorcycle can park in any spot.
5) A car can park in either a single compact spot or a single large spot.
6) A bus can park in five large spots that are consecutive and within the same row.
It cannot park in small spots.

Approach -
Vehicles - MotorCycle, car, bus and spots they need
1. Create a Vehicle abstract class with variables -
    VehicleType(enum) & spotsNeeded and List<ParkingSpot> class
2. Add methods - getSpotsNeeded(), getVehicleType(),
    getParkedInSpot, parkingSpot, clearSpot and canFitInfoSpot
3. ParkingSpot class with row, spotNumber and ParkingSpotSize(enum)
4. Add methods - getSPotNumber(), getRow(), getSize(), park(), remove(),
canFit(Vehicle v)
 */

import java.util.ArrayList;
import java.util.List;

enum VehicleType{
    BUS,
    MOTOR_CYCLE,
    CAR
}

abstract class Vehicle {

    protected VehicleType vehicleType;
    protected int spotsNeeded;
    protected List<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();

    public VehicleType getType(){
        return vehicleType;
    }

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public void parkInSpot(){

    }
    abstract boolean canFitInSpot();

}

class Bus extends Vehicle{

    Bus(){
        vehicleType = VehicleType.BUS;
        spotsNeeded = 5;
    }
    @Override
    boolean canFitInSpot() {
        return false;
    }
}

class Car extends Vehicle{

    Car(){
        vehicleType = VehicleType.CAR;
        spotsNeeded = 1;
    }
    @Override
    boolean canFitInSpot() {
        return false;
    }
}

class MotoCycle extends Vehicle{

    MotoCycle(){
        vehicleType = VehicleType.MOTOR_CYCLE;
        spotsNeeded = 1;
    }
    @Override
    boolean canFitInSpot() {
        return false;
    }
}

enum ParkingSpotSize{
    COMPACT,
    LARGE,
    SMALL
}

class ParkingSpot
{
    private Vehicle vehicle;
    private ParkingSpotSize spotSize;
    private int row;
    private int spotNumber;
    public ParkingSpot(int r, int n, VehicleType s)
    { }

    public boolean isAvailable()
    {
        return vehicle == null;
    }

    /* Check if the spot is big enough and is available */
    public boolean canFitVehicle(Vehicle vehicle) {
        return false;
    }

    /* Park vehicle in this spot. */
    public boolean park(Vehicle v) {
        return false;
    }

    public int getRow()
    {
        return row;
    }
    public int getSpotNumber()
    {
        return spotNumber;
    }

    /* Remove vehicle from spot, and notify
    level that a new spot is available */
    public void removeVehicle() {}
}


public class ParkingSpotProblem {
}
