public class Car extends  Bicycle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doService() {
        super.doService();
        checkEngine();

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
