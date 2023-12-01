public class CalculadoraAvanzada extends Calculadora{
    
    private double resultadoAnterior = 0;

    public void cadrado() {
        double nuevoValor = getResultado()*getResultado();
        resultadoAnterior = getResultado();
        setResultado(nuevoValor);
    }

    public void raiz() {
        resultadoAnterior = getResultado();
        setResultado(Math.sqrt(getResultado()));
    }

    public void desfacer() {
        setResultado(resultadoAnterior);
    }

    public void sumar(int x){
        resultadoAnterior = getResultado();
        super.sumar(x);
    }

    @Override
    public void restar(double x){
        resultadoAnterior = getResultado();
        super.restar(x);
    }

    @Override
    public void multiplicar(double x){
        resultadoAnterior = getResultado();
        super.multiplicar(x);
    }

    @Override
    public void dividir(double x){
        resultadoAnterior = getResultado();
        super.dividir(x);
    }

    @Override
    public void reset(){
        resultadoAnterior = 0;
        super.reset();
    }
}