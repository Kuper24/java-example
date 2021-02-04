package exampleone;

import java.util.UUID;

import lombok.Data;

/**
 * Created by Max on 04.02.2021.
 * Марка авто
 */
@Data
public class BrandCar {

    /**
     * Идентификатор
     */
    private UUID id;

    /**
     * Наименование марки
     */
    private String name;

    /**
     * Модель
     */
    private String madel;

    /**
     * Цвет
     */
    private String color;
}
