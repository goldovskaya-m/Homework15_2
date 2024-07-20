import java.util.Objects;

public class ServiceStation {
    private String updateTyre;
    private String checkEngine;

    public ServiceStation(String updateTyre, String checkEngine) {
        this.updateTyre = updateTyre;
        this.checkEngine = checkEngine;
    }

    public String getUpdateTyre() {
        return updateTyre;
    }

    public String getCheckEngine() {
        return checkEngine;
    }

    public void setUpdateTyre(String updateTyre) {
        this.updateTyre = updateTyre;
    }

    public void setCheckEngine(String checkEngine) {
        this.checkEngine = checkEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceStation that = (ServiceStation) o;
        return Objects.equals(updateTyre, that.updateTyre) && Objects.equals(checkEngine, that.checkEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateTyre, checkEngine);
    }

    @Override
    public String toString() {
        return "ServiceStation{" +
                "updateTyre='" + updateTyre + '\'' +
                ", checkEngine='" + checkEngine + '\'' +
                '}';
    }


    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }
    }
}

