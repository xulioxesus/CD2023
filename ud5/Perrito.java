/**
 * Perrito
 */
public class Perrito implements Imprimible{

    // Atributos

    String nome;
    String raza;
    String color;
    boolean chip;
    int numeroChip;

    // Métodos

    public Perrito(String nome, String raza, String color, boolean chip, int numeroChip) {
        
        nome = nome;
        raza = raza;
        color = color;
        chip = chip;
        numeroChip = numeroChip;
    }

    public String ladrar() {
        return "Guau Guau";
    }

    public String durmir() {
        return "Marcho durmir";
    }

    public void pedirDeComer() {

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            System.out.println("Guau Guau");
            i = i + 1;
        }
    }

    @Override
    public void print() {
        System.out.println("Soy perrito");
    }
}