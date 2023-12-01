public class Rato extends Animal implements IPlaga,IEnvenenable{

    private String nome = "manolito";

    public void roer() {
        System.out.println("Estou roendos");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void sleep(){
        System.out.println("ssss");
      }

    @Override
    public void acabarConTodo() {
        System.out.println("Roe, roe, roe");
    }

    @Override
    public void reproducirseHastaMorir() {
        System.out.println("Me mor....z");
    }

    @Override
    public void ConsumirVeneno() {
        System.out.println("Matáronme con veneno");
    }
}
