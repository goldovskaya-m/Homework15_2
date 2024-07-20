import java.util.Objects;

public class Person {
    private String modelName;
    private int wheelsCount;
    private String updateTyre;
    private String checkEngine;

    public Person(String modelName, int wheelsCount, String updateTyre, String checkEngine) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
        this.updateTyre = updateTyre;
        this.checkEngine = checkEngine;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public String getUpdateTyre() {
        return updateTyre;
    }

    public String getCheckEngine() {
        return checkEngine;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void setUpdateTyre(String updateTyre) {
        this.updateTyre = updateTyre;
    }

    public void setCheckEngine(String checkEngine) {
        this.checkEngine = checkEngine;
    }





    @Override
    public String toString() {
        return "Person{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                ", updateTyre=" + updateTyre +
                ", checkEngine=" + checkEngine +
                '}';
    }
}

