public class Gato extends Animal implements Imprimible{

    @Override
    public void animalSound() {
        System.out.println("Miuauuu");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("rrrrrr");
    }

    @Override
    public String toString() {
        return "Son un gato";
    }

    @Override
    public void print() {
        System.out.println("Imprimindo gato...");
    }
    
    
}
