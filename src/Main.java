public class Main {
    public static void main(String[] args){
        Bicycle bicycle1 = new Bicycle("Аист", 2);
        Car car1 = new Car("Лада", 4);
        Truck truck1 = new Truck("Камаз", 6);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle1, car1, truck1);
    }
}