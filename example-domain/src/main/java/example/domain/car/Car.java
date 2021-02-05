package example.domain.car;

import lombok.Data;

/**
 * Created by Max.B on 03.02.2021.
 * Машина
 */
@Data
public class Car {

    /**
     * Двигатель
     */
    private String engine;

    /**
     * Трансмисия
     */
    private String transmission;

    /**
     * VIN-номер
     */
    private String vinNumber;

    /**
     * Марка авто/модель/цвет
     */
    private BrandCar brandCar;

    /**
     * Горит Check - true (ошибка), по дефолту false
     */
    private Boolean check = false;

    public BrandCar getBrandCar() {
        return this.brandCar;
    }

    public void setBrandCar(BrandCar brandCar) {
        this.brandCar = brandCar;
    }

    public Car() {
    }

    public Car(String engine, String transmission, String vinNumber, BrandCar brandCar) {
        this.engine = engine;
        this.transmission = transmission;
        this.vinNumber = vinNumber;
        this.brandCar = brandCar;
    }

    public Car(String engine, String transmission, String vinNumber, BrandCar brandCar, boolean check) {
        this.engine = engine;
        this.transmission = transmission;
        this.vinNumber = vinNumber;
        this.brandCar = brandCar;
        this.check = check;
    }

    public void switchOn() {
        System.out.println(brandCar.getName() + " завелся");
        if (check) {
            System.out.println(brandCar.getName() + " заглох");
        }
    }

    public void switchOff() {
        System.out.println(brandCar.getName() + " заглушил мотор");
    }

    public void go() {
        System.out.println(brandCar.getName() + " поехал");
    }


}
