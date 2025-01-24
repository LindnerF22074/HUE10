import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map map =new Map();
        System.out.println(map.getMap());

        while (true){
            Scanner scanner = new Scanner(System.in);
            String move = scanner.nextLine();
            Movement movement = new Movement(map);
            switch (move) {
                case "a" -> movement.left();
                case "d" -> movement.right();
                case "w" -> movement.up();
                case "s" -> movement.down();
            }
            System.out.println(map.getMap());
        }
    }
}