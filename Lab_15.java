import java.util.ArrayList;
import java.util.List;

public class Lab_15 {

    public static void main(String[] args) {

        Server pub1 = new Server();
        VKClient vkcl1 = new VKClient(pub1);
        pub1.changeData("Наука и техника", 1248617);

        Server pub2 = new Server();
        VKClient vkcl2 = new VKClient(pub2);
        pub2.changeData("Автобусы и троллейбусы Пензы", 54982);

        Server pub3 = new Server();
        VKClient vkcl3 = new VKClient(pub3);
        pub3.changeData("Burger King Russia", 825417);

    }}

interface Informer {
    public void addSubrcriber(User obs);
}

class Server implements Informer {
    private List subscribers;
    private String pubname;
    private int subquant;


    public Server(){
        subscribers = new ArrayList();
    }


    public void addSubrcriber(User obs) {
        subscribers.add(obs);
    }

    public void notifySubcribers() {
        for (int i = 0; i < subscribers.size(); i++){
            User obs = (User) subscribers.get(i);
            obs.info(pubname, subquant);
        }}

    public void changeData(String pubname, int subquant){
        this.subquant = subquant;
        this.pubname = pubname;
        notifySubcribers();
    }}

interface User {
    void info(String pubname, int subquant);
}

class VKClient implements User {
    private Informer informer;
    private String pubname;
    private int subquant;


    public VKClient(Informer informer){
        this.informer = informer;
        informer.addSubrcriber(this);
    }

    public void info(String pubname, int subquant) {
        this.subquant = subquant;
        this.pubname = pubname;
        show();
    }

    public void show(){
        System.out.println("Название паблика: " + pubname + ", подписчиков: " + subquant);
    }}