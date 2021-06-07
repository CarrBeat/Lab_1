import java.lang.*;
import java.util.Scanner;
public class Lab_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dresizes[] types = dresizes.values();
        for (dresizes i : types) { System.out.print(i + " "); }
        System.out.println("Выберите один из перечисленных размеров: ");
        String size = input.nextLine();
        dresizes.getDescription(size);
        System.out.println("Введите М или Ж чтобы одеть мужчину или женщину: ");
        String odet = input.nextLine();
        if (odet.equals("М")) {
            manclothes.dresman(odet);
        }
        if (odet.equals("Ж")) {
            womclothes.dreswom(odet);
        }
        System.out.println("Введите М или Ж чтобы одеть мужчину или женщину в футболку: ");
        odet = input.nextLine();
        if (odet.equals("М")) {
            Clothes.tsh.dresman();
        }
        if (odet.equals("Ж")) {
            Clothes.tsh.dreswom();
        }
        System.out.println("Введите М или Ж чтобы одеть мужчину или женщину в штаны: ");
        odet = input.nextLine();
        if (odet.equals("М")) {
            Clothes.pants.dresman();
        }
        if (odet.equals("Ж")) {
            Clothes.pants.dreswom();
        }
        System.out.println("Введите М или Ж чтобы одеть мужчину в галстук или женщину в юбку: ");
        odet = input.nextLine();
        if (odet.equals("М")) {
            Clothes.tie.dresman();
        }
        if (odet.equals("Ж")) {
            Clothes.skirt.dreswom();
        }
        String[] allclothes =  {"футболка", "штаны", "галстук", "юбка", "рубашка", "платье"};
        System.out.println("Введите М или Ж чтобы посмотреть ассортимент ателье: ");
        odet = input.nextLine();
        if (odet.equals("М")) {
            Atelie.dresman(allclothes);
        }
        if (odet.equals("Ж")) {
            Atelie.dreswom(allclothes);
        }
    }

    public enum dresizes {XXS(32), XS(34), S(36), M(38), L(40);
        int euroSize;
        dresizes(int euroSize) {
            this.euroSize = euroSize;
            System.out.print(euroSize + " ");
        }
        public static void getDescription(String out) {
            if (out.equals("32") | out.equals("XXS") ){
                System.out.println("Вы выбрали детский размер");
            } else if(!out.equals("")) {
                System.out.println("Вы выбрали взрослый размер");
            }
        }
    };

    public interface manclothes{
        static void dresman(String x) {
            if (x.equals("М")){
                System.out.println("Поздравляем! Мужчина в одежде.");
            } else{
                System.out.printf("Поздравляем! Мужчина в %s. \n", x);
            }
        }
    }
    public interface womclothes{
        static void dreswom(String x) {
            if (x.equals("Ж")){
                System.out.println("Поздравляем! Женщина в одежде.");
            } else{
                System.out.printf("Поздравляем! Женщина в %s. \n", x);
            }
        }
    }

    abstract static class Clothes {
        String size;
        int prise;
        String color;
        public static class tsh{
            static void dreswom() {
                womclothes.dreswom("футболке");
            }
            static void dresman() {
                manclothes.dresman("футболке");
            }
        }

        public static class pants{
            static void dreswom() {
                womclothes.dreswom("штанах");
            }
            static void dresman() {
                manclothes.dresman("штанах");
            }
        }

        public static class skirt{
            static void dreswom() {
                womclothes.dreswom("юбке");
            }
        }
        public static class tie{
            static void dresman() {
                manclothes.dresman("галстуке");
            }
        }
    }
    public static class Atelie{
        static void dreswom(String[] all) {
            System.out.print("Женская одежда: ");
            for (int i = 0; i < all.length; i++) {
                if (i == 2){
                    continue;
                }
                if (i == 5){
                    System.out.print(all[i]);
                } else {
                    System.out.print(all[i] + ", ");
                }
            }
        }
        static void dresman(String[] all) {
            System.out.print("Мужская одежда: ");
            for (int i = 0; i < all.length; i++) {
                if (i == 3 | i == 5){
                    continue;
                }
                if (i == 4){
                    System.out.print(all[i]);
                } else{
                    System.out.print(all[i] + ", ");
                }

            }
        }
    }


}


