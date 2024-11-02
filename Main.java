public class Main {
    public static void main(String[] args) {

        Game model = new Game();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
}