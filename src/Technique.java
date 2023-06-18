public class Technique implements ServiceStationTechnique {
    private final String modelName;
    private final int wheelsCount;

    public Technique(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String toString() {
        return "Technique{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    public void doService() {
        System.out.println("Обслуживаем " + this. getModelName());
    }
}
