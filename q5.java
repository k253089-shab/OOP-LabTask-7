class Vehicle{
    private int speed;
    private String colour;
    private int wheels;

    Vehicle(){}

    Vehicle(int speed, String colour, int wheels){
        this.speed = speed;
        this.colour = colour;
        this.wheels = wheels;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public int getSpeed(){
        return speed;
    }

    public String getColour(){
        return colour;
    }

    public int getWheels(){
        return wheels;
    }
}


class MotorVehicle extends Vehicle{
    private String licenseplate;

    MotorVehicle(){}

    public void setLicensePlate(String licenseplate){
        this.licenseplate = licenseplate;
    }

    public String getLicensePlate(){
        return licenseplate;
    }
}


class Car extends MotorVehicle{
    private int noOfDoors;

    Car(){}

    public void setNoOfDoors(int noOfDoors){
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfDoors(){
        return noOfDoors;
    }

    public void display(){
        System.out.println("Speed: " + getSpeed());
        System.out.println("Colour: " + getColour());
        System.out.println("Number of Wheels: " + getWheels());
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Number of Doors: " + noOfDoors);
    }
}


public class Main{
    public static void main(String[] args){

        Car c = new Car();

        c.setSpeed(120);
        c.setColour("Red");
        c.setWheels(4);
        c.setLicensePlate("ABC-123");
        c.setNoOfDoors(4);

        c.display();
    }
}
