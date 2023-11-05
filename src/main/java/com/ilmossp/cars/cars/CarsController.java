package com.ilmossp.cars.cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Cars")
@CrossOrigin(origins = "http://localhost:*")
public class CarsController {
    @Autowired
    CarService carService;

    @GetMapping(path = "")
    public List<Car> getAllVoitures() {
        return carService.getAllCars();
    }

    @GetMapping(path="/{id}")
    public Car getCarById(Integer id){
        return carService.getCarById(id);
    }

    @PostMapping(path = "")
    public Car addCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    @PatchMapping(path = "")
    public Car updateCar(@RequestBody Car car){
        return carService.updateCar(car);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteCar(Integer id){
         carService.deleCarByID(id);
    }

}
