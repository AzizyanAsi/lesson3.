package lesson3;

public final class Car {
    private final int productionYear;
    private final String model;
    private final int mark;
    private final Engine engine;

    public Car(int productionYear, String model, int mark, Engine engine) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        Engine cloneEngine = new Engine();
        cloneEngine.setHorsePower(engine.getHorsePower());
        cloneEngine.setMileage(engine.getMileage());
        cloneEngine.setWeight(engine.getWeight());
        this.engine = cloneEngine;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public int getMark() {
        return mark;
    }

    public Engine getEngine() {
        return engine;
    }

}
