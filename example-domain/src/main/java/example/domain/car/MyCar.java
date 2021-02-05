package example.domain.car;

public class MyCar {

    public static void main(String[] args) {
        BrandCar brandCar = new BrandCar("Hyundai", "Accent", "Крассный");
        Car ford = new Car("Mercury F100ELPT 100 л.с.", "Механическая", "XTA212140G2247457", brandCar);
        System.out.println("Мой новый автомобиль - " + ford.getBrandCar().getName() + "!");

        ford.switchOn();
        ford.go();
        ford.switchOff();

        System.out.println("");

        BrandCar toyotaModel = new BrandCar();
        toyotaModel.setName("Toyota");

        Car toyota = new Car();
        toyota.setBrandCar(toyotaModel);

        System.out.println("Мой новый автомобиль - " + toyota.getBrandCar().getName() + "!");

        toyota.switchOn();
        toyota.go();
        toyota.switchOff();
    }

}
