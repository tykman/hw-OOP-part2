public class Main {
    public static void main(String[] args) {

        Technique[] techniques = {
                new Bicycle("Кама", 2),
                new Bicycle("Сура", 2),
                new Car("BMW Х6", 4),
                new Car("ВАЗ О9", 4),
                new Truck("Краз", 8),
                new Truck("Камаз", 6),
        };

        ServiceStation station = new ServiceStation();

        for (Technique technique : techniques) {
            station.check(technique);
        }
    }
}