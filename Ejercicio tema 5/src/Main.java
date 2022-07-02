public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(5);
        persona.setNombre("Luis");
        persona.setTelefono(80955588);
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private int telefono;
    private String nombre;

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}