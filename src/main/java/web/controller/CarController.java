package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiseImpl;

import java.util.Optional;

@Controller
public class CarController {

    private final CarServiseImpl carServise;

    public CarController(CarServiseImpl carServise) {
        this.carServise = carServise;
    }

    @GetMapping("cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") Optional<Integer> count, Model model){
        model.addAttribute("cars", carServise.carListCount(count.orElse(0)));
        return "cars";
    }

}
