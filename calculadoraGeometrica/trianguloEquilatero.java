package classes.calculadoraGeometrica;


public  class trianguloEquilatero{

    double lado;

    public trianguloEquilatero(double lado) {
        this.lado = lado;
    }

    double areaTriangulo (){

        return ((Math.pow(this.lado, 2)) * Math.sqrt(3))/4;
    }

    double perimetroTriangulo(){

        return this.lado*3;
    }
}

