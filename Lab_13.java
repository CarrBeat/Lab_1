import java.util.ArrayList;
import java.util.List;

abstract class Deliver{
    String vehicle;
    List<String> cargo = new ArrayList();

    public String toString(){
        return "Транспорт: " + vehicle + "\n" + "Груз: " + cargo;
    }
}

abstract class Logistic{
    public abstract Deliver deliver();

}

class SeaLogistic extends Logistic{
    public Deliver deliver(){
        return new seadelivery();
    }
}

class RoadLogistic extends Logistic{
    public Deliver deliver(){
        return new roaddelivery();
    }
}

class AirLogistic extends Logistic{
    public Deliver deliver(){
        return new airdelivery();
    }
}

class seadelivery extends Deliver{
    public seadelivery(){
        vehicle = "Сухогрузное судно";
        cargo.add("Пшеница");
        cargo.add("Овёс");
        cargo.add("Ячмень");
    }
}

class roaddelivery extends Deliver{
    public roaddelivery(){
        vehicle = "Грузовик";
        cargo.add("Помидоры");
        cargo.add("Огурцы");
        cargo.add("Перец болгарский");
        cargo.add("Салат листовой");
        cargo.add("Редис");
        cargo.add("Капуста");
        cargo.add("Морковь");
        cargo.add("Свекла");
        cargo.add("Дайкон");
    }
}

class airdelivery extends Deliver{
    public airdelivery(){
        vehicle = "Самолет";
        cargo.add("Спутник V");
        cargo.add("СИЗ");
        cargo.add("Антисептик");
        cargo.add("Другие медикаменты");
    }
}

public class Lab_13 {
    public static void main(String[] args) {
        Logistic sealogistic = new SeaLogistic();
        Logistic roadlogistic = new RoadLogistic();
        Logistic airlogistic = new AirLogistic();

        Deliver ship = sealogistic.deliver();
        Deliver truck = roadlogistic.deliver();
        Deliver plane = airlogistic.deliver();

        System.out.println(ship);
        System.out.println(truck);
        System.out.println(plane);
    }
}
