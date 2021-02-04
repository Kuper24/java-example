package example.domain.car;

import lombok.Data;

import javax.persistence.Id;
import java.util.UUID;

@Data
public class Car {

    /**
     * Идентификатор записи
     */
    @Id
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
    private Boolean check = false;
}
