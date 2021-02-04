package exampleone;

import java.util.UUID;

import lombok.Data;

/**
 * Created by Max.B on 03.02.2021.
 * Машина
 */
@Data
public class Car {

    /**
     * Идентификатор записи
     */
    private UUID id;

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
    private Integer vinNumber;

    /**
     * Марка авто/модель/цвет
     */
    private BrandCar brandCar;

    /**
     * Горит Check - true (ошибка), по дефолту false
     */
    private Boolean сheck = false;

}