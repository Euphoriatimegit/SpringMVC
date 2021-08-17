package web.model;

public class Car {

    private Integer year;
    private String model;
    private String modelClass;

    public Car (){

    }

    public Car(Integer year, String model, String modelClass) {
        this.year = year;
        this.model = model;
        this.modelClass = modelClass;
    }

    public int getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelClass() {
        return modelClass;
    }

    public void setModelClass(String modelClass) {
        this.modelClass = modelClass;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", modelClass='" + modelClass + '\'' +
                '}';
    }
}
