public class Main {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.credito = 50;
    cliente.edad = 20;
    cliente.telefono = 8092554;
    cliente.nombre = "Jose";
    System.out.println("Nombre " +cliente.nombre + " Edad" + cliente.edad + " credito" + cliente.credito +
            " Telefono" + cliente.telefono);


        Trabajador trabajador = new Trabajador();
        trabajador.salario = 50000;
        trabajador.edad = 30;
        trabajador.telefono = 8092334;
        trabajador.nombre = "Manuel";
        System.out.println("Nombre " +trabajador.nombre + " Edad" + trabajador.edad + " salario" + trabajador.salario +
                " Telefono" + cliente.telefono);

    }





}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;

}

class Trabajador extends Persona {
    int salario;
}