import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<String> bus = new ArrayList<>();
        bus.add("Ryan"); //back
        bus.add("Brandon");
        bus.add("Rebecca");
        bus.add("Richard");
        bus.add("Jessica");
        bus.add("Brian");
        bus.add("Antoinne");
        bus.add("Grace");
        bus.add("Zee");
        bus.add("Ibrahim"); //front
        //

        bus.remove("Ibrahim");
        bus.add(0,"Ibrahim");

        bus.remove("Rebecca");
        bus.add(9,"Rebecca");

        bus.remove("Richard");
        bus.add(5,"Richard");

        bus.remove("Ryan");
        bus.add(8,"Ryan");

        System.out.println(bus);

    }
}
