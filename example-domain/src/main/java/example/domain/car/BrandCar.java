package example.domain.car;

import lombok.Data;

import javax.persistence.Id;
import java.util.UUID;

@Data
public class BrandCar {

    /**
     * Идентификатор
     */
    @Id
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
