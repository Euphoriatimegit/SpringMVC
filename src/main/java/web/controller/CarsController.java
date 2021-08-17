package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {
    CarService car = new CarServiceImpl();

    @GetMapping("/cars")
    public String getCars(@RequestParam(name="count",required = false)Integer count, Model model){
        model.addAttribute("cars",car.getCars(count));
        return "Cars";
    }
}
