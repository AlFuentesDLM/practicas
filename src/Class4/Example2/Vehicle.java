package Class4.Example2;

public class Vehicle {
    private int speed;
    private int acceleration;
    private int turningAngle;
    private String patent;
    private int weight;
    private int wheels;

    public Vehicle(int speed, int acceleration, int turningAngle, String patent, int weight, int wheels) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.turningAngle = turningAngle;
        this.patent = patent;
        this.weight = weight;
        this.wheels = wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getTurningAngle() {
        return turningAngle;
    }

    public void setTurningAngle(int turningAngle) {
        this.turningAngle = turningAngle;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Integer isWinner(){
        return speed+(acceleration/2)/(turningAngle*(weight-wheels*100));
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", acceleration=" + acceleration +
                ", turningAngle=" + turningAngle +
                ", patent='" + patent + '\'' +
                ", weight=" + weight +
                ", wheels=" + wheels +
                '}';
    }
}
