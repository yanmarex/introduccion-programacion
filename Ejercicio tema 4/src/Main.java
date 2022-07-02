public class Main {
    public static void main(String[] args) {
        var numero = 5;
        var numeroWhile = 0;
        var numeroDoWhile = 2;
        var estacion = "verano";

//Revisar si el numero es positivo
        if (numero > 0) {
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }
//Hacer un bucle while
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
//Hacer un bucle Do While
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 2);

 //Hacer un bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

 //Uso del Switch
     switch (estacion) {
         case "verano":
             System.out.println("es verano");
             break;
         case "primavera":
             System.out.println("es primavera");
             break;
         case "invierno":
             System.out.println("es invierno");
             break;
         case "otono":
             System.out.println("es otono");
             break;
         default:
             System.out.println("No es una estacion");
     }
    }
}