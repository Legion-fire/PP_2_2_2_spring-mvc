package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiseImpl implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Хонда", "полный привод", "седан"));
        carList.add(new Car("Форд", "передний привод", "хэтчбэк"));
        carList.add(new Car("ВАЗ", "полный привод", "минивэн"));
        carList.add(new Car("Тойота", "задний привод", "купе"));
        carList.add(new Car("Рено", "полный привод", "кабриолет"));
    }
    @Override
    public List<Car> carListCount(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
