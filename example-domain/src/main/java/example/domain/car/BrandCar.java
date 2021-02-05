package example.domain.car;

import lombok.Data;

/**
 * Created by Max.B on 03.02.2021.
 * Марка авто
 */
@Data
public class BrandCar {

    /**
     * Наименование марки
     */
    private String name;

    /**
     * Модель
     */
    private String model;

    /**
     * Цвет
     */
    private String color;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BrandCar() {
    }

    public BrandCar(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }
}
