
public class Persona {

    // Atributos
    private String nombre;
    private int edad;
    private float estatura;

    // Constructor sin parametros
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.estatura = 0.0f;
    }

    // Constructor con un parametro
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.estatura = 0.0f;
    }

    // Constructor con tres parametros
    public Persona(String nombre, int edad, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Metodo descripcion
    public String descripcion() {
        return "Persona: " + nombre;
    }

    // Metodo imprimir datos
    public void imprimirDatos() {
        System.out.println("-----------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("-----------------");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
}
