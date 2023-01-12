package day6;

/*
Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
        Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
        задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
        Созданный вами класс должен отвечать принципам инкапсуляции.
*/

public class Task1 {
    public static void main(String[] args) {
        day6.Car car = new day6.Car();
        car.setColor("black");
        car.setYear(2006);
        car.setModel("Ford");

        System.out.println("Our car: " + car.getYear() + " year " + car.getModel() + " model " + car.getColor() + " color ");

        Motorbike motorbike = new Motorbike(2015, "Honda", "white");

        car.info();
        motorbike.info();
        System.out.println(car.yearDifference(2023));
        System.out.println(motorbike.yearDifference(2023));
    }
}


