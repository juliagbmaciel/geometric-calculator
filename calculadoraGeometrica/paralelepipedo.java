package classes.calculadoraGeometrica;

public class paralelepipedo {
    double largura;
    double altura;
    double comprimento;

    public paralelepipedo(double largura, double altura, double comprimento) {
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    double volume(){
        return this.largura*this.altura*this.comprimento;
    }

    double areaSuperficial(){
        return (2*this.altura*this.comprimento)+(2*this.altura*this.largura)+(2*this.largura*this.comprimento);
    }
}
