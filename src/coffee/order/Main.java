package coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Alen");
        board.add("Yoda");
        board.add("Obi-van");
        board.add("John Snow");
        board.draw();
        System.out.println("Delivering order: " + board.deliver().getName());
        System.out.println("Delivering order: " + board.deliver(3).getName());
        board.draw();
    }
}
