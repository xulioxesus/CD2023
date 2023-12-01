public class RatoTest {

    public static void MatarBicho(IEnvenenable bicho){
        bicho.ConsumirVeneno();
    }
    public static void main(String[] args) {
        Rato rato = new Rato();
        rato.setNome("kk");

        Gato gato = new Gato();
        MatarBicho(gato);
        MatarBicho(rato);

        IPlaga bicho = new Rato();
        IEnvenenable bicho2 = new Rato();
        Animal bicho3 = new Rato();
        Object bicho4 = new Rato();

    }
}
