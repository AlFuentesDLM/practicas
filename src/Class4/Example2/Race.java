package Class4.Example2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Race {
    private int distance;
    private int prizeInDollars;
    private String name;
    private int amountOfVehicles;
    private List<Vehicle> vehicles;
    private LifeGuardCar lifeGuardCar;
    private LifeGuardMoto lifeGuardMoto;

    public Race(int distance, int prizeInDollars, String name, int amountOfVehicles) {
        this.distance = distance;
        this.prizeInDollars = prizeInDollars;
        this.name = name;
        this.amountOfVehicles = amountOfVehicles;
        this.vehicles = new ArrayList<>();
        this.lifeGuardCar = new LifeGuardCar();
        this.lifeGuardMoto = new LifeGuardMoto();
    }

    public void addCar(int speed, int acceleration, int turningAngle,String patent){
        if (vehicles.size() < amountOfVehicles){
            vehicles.add(new CarRace(speed,acceleration,turningAngle,patent));
        }else{
            throw new Error("You can't add more vehicle to this race");
        }
    }

    public void addMoto(int speed,int acceleration,int turningAngle,String patent){
        if (vehicles.size() < amountOfVehicles){
            vehicles.add(new MotoCycleRace(speed,acceleration,turningAngle,patent));
        }else{
            throw new Error("You can't add more vehicle to this race");
        }
    }

    public void removeVehicle(Vehicle vehicle){
       var result = vehicles.remove(vehicle);
       if (result){
           System.out.println("Vehicle has been removed");
       }else{
           System.out.println("this Vehicle doesn't exist");
       }
    }

    public void removeVehicleByPatent(String patent){
        var filteredVehicle = vehicles.stream().filter(vehicle -> vehicle.getPatent().equals(patent)).findFirst();
        if (filteredVehicle.isPresent()){
            vehicles.remove(filteredVehicle.get());
            System.out.println("Vehicle has been removed");
        } else{
            System.out.println("This vehicle doesn't exist");
        }
    }

    public void getWinner(){
        var a = vehicles.stream().max(Comparator.comparing(Vehicle::isWinner));
        System.out.println(a.toString());
    }

    public void printVehicles(){
        for (Vehicle vehicle:vehicles) {
            System.out.println(vehicle.toString());
        }
    }

    public void helpCar(String patent){
        var filteredVehicle = vehicles.stream().filter(vehicle -> vehicle.getPatent().equals(patent)).findFirst();
        if (filteredVehicle.isPresent()){
            if (isCar(filteredVehicle.get())){
                CarRace car = (CarRace) filteredVehicle.get();
                lifeGuardCar.help(car);
            }else{
                System.out.println("Este soccorrista no puede ayudar una moto");
            }
        } else{
            System.out.println("No existe este auto");
        }

    }

    public  void helpMoto(String patent){
        var filteredVehicle = vehicles.stream().filter(vehicle -> vehicle.getPatent().equals(patent)).findFirst();
        if (filteredVehicle.isPresent()){
            if (!isCar(filteredVehicle.get())){
                MotoCycleRace moto = (MotoCycleRace) filteredVehicle.get();
                lifeGuardMoto.help(moto);
            }else{
                System.out.println("Este socorrista no puede ayudar un auto");
            }
        } else{
            System.out.println("No existe esta moto");
        }
    }

    private boolean isCar(Vehicle vehicle){
        return vehicle.getWheels() == 4;
    }

}
