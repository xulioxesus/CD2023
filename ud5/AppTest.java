package cd2023.ud5;

public class AppTest {
    public static void main(String[] args) {
        App app = new App();
        app.start();

        Menu m = new Menu();
        Calculadora c = new Calculadora();
        App app2 = new App(m, c);
        app2.start();
    }
}
