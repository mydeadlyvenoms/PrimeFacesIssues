package ch.zhaw.init.primefacesissues.backing;

import ch.zhaw.init.primefacesissues.model.Car;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Damiano Esposito <espo@zhaw.ch>
 */
@Named
@SessionScoped
public class DataTableBacking implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private List<Car> cars;

    public DataTableBacking() {
        for (int i = 0; i < 1000; i++) {
            Car car = new Car();
            car.setName("Car" + i);
            cars.add(car);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

}
