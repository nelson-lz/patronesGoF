package py.lpz.nelson.pd.decorator.vehicle.solution;

public abstract class Extra extends Vehicle {

    private Vehicle vehicle;

    public Extra(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    protected Vehicle getVehicle() {
        return vehicle;
    }

}
