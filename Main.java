
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // - Semana 6 -

        Persona persona = new Persona();
        Persona persona1 = new Persona("Ana");
        Persona persona2 = new Persona("Andrés",25,1.70f);

        System.out.println("ArrayList - List");

        List<Persona> lista = new ArrayList<>();

        lista.add(persona);
        lista.add(persona1);
        lista.add(persona2);
        lista.add(new Persona("Pepe",46,1.60f));
        lista.add(new Persona("Vero",38,1.70f));

        persona.setNombre("David");

        System.out.println("Listado de personas");

        for(Persona p : lista) {
            System.out.println(p.descripcion());
        }

        lista.get(0).setEdad(18);
        lista.get(0).imprimirDatos();

        lista.get(1).setEdad(18);
        lista.get(1).imprimirDatos();

        lista.get(2).setEdad(18);
        lista.get(2).imprimirDatos();

        lista.get(3).setEdad(18);
        lista.get(3).imprimirDatos();

        lista.get(4).setEdad(18);
        lista.get(4).imprimirDatos();

        System.out.println("HashSet - Set");

        Set<String> nombres = new HashSet<>();

        nombres.add("Mateo");
        nombres.add("Javier");
        nombres.add("Irene");
        nombres.add("Michael");
        nombres.add("Michael");
        nombres.add("Mateo");
        nombres.add("Javier");
        nombres.add("Irene");

        System.out.println("Nombres únicos (sin orden garantizado): " + nombres);

        Set<Persona> nombres2 = new HashSet<>();

        nombres2.add(new Persona("Ana",25,1.65f));
        nombres2.add(new Persona("Pepe",46,1.60f));
        nombres2.add(new Persona("Vero",38,1.70f));
        nombres2.add(new Persona("Vero",27,1.80f));
        nombres2.add(new Persona("Vero",55,1.67f));

        for(Persona p : nombres2) {
            System.out.println(p.descripcion());
        }

        System.out.println("HashMap - Map");

        Map<String, Persona> codigoUnico = new HashMap<>();

        codigoUnico.put("e01",persona);
        codigoUnico.put("e02",persona1);
        codigoUnico.put("e03",persona2);
        codigoUnico.put("e04",lista.get(4));

        System.out.println("Código unico e03 - " + codigoUnico.get("e03").descripcion());
        System.out.println("Código unico e03 - " + codigoUnico.get("e02").descripcion());
        System.out.println("Código unico e03 - " + codigoUnico.containsKey("e10"));

        // Ingreso de personas
        System.out.println("\nINGRESO DE PERSONAS");
        ingresarPersonas();
    }

    public static void ingresarPersonas() {

        Scanner teclado = new Scanner(System.in);

        List<Persona> personas = new ArrayList<>();

        int opcion = 1;

        while(opcion != 0) {

            System.out.println("\nIngrese 1 para registrar una persona");
            System.out.println("Ingrese 0 para salir");
            System.out.print("Opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            if(opcion == 1) {

                System.out.print("Ingrese el nombre: ");
                String nombre = teclado.nextLine();

                System.out.print("Ingrese la edad: ");
                int edad = teclado.nextInt();

                System.out.print("Ingrese la estatura: ");
                float estatura = teclado.nextFloat();

                Persona p = new Persona(nombre, edad, estatura);

                personas.add(p);

                System.out.println("Persona registrada correctamente");
            }
        }

        System.out.println("\nListado de personas ingresadas:");

        for(Persona p : personas) {
            System.out.println(p.descripcion());
            p.imprimirDatos();
        }
    }
}
