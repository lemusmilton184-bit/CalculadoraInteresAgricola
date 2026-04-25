public class calculadoraIteres {

    double monto = 0;
    double tasaAnual = 0;
    int plazoMeses = 0;

    public calculadoraIteres(double monto, double tasaAnual, int plazoMeses) {
        setMonto(monto);
        setPlazoMeses(plazoMeses);
        setTasaAnual(tasaAnual);
    }

    public void setMonto(double monto){
        this.monto = monto;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual / 100;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public double calcularInteres(){

        //Aplica descuento del 1% si es el monto es mayor a 50000
        if (monto > 50000){
            tasaAnual = tasaAnual - 0.01;
        }



        //Convertir en meses a años
        double tiempo = plazoMeses / 12.0;

        //calcular inereses simples

        return monto * tasaAnual * tiempo;

    }

}
