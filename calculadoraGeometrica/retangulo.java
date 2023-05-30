package classes.calculadoraGeometrica;

public class retangulo {
    double base;
    double altura;

    public retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double areaRetangulo(){
        return this.base * this.altura;
    }

    double perimetroRetangulo(){
        return this.base*2 + this.altura*2;
    }
}
