class CarrBeat {
    private static final CarrBeat cb = new CarrBeat();
    private int item;

    private CarrBeat(){
        this.item = 3;
    }

    public static CarrBeat loot(){
        return cb;
    }

    public int getItems(){
        return item;
    }

    public void Items(int item){
        this.item = item;
    }
}

public class Lab_14{
    public static void main(String[] args) {
        CarrBeat Player = CarrBeat.loot();
        System.out.println("У игрока в рюкзаке " + Player.getItems() + " вещи");
        Player.Items(5);
        CarrBeat Player1 = CarrBeat.loot();
        System.out.println("У игрока в рюкзаке " + Player1.getItems() + " вещей");
    }
}
