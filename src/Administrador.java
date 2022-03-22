import java.util.Scanner;

public class Administrador {

    private String nombreUsuario = "user";
    private String contraseña = "admin";
    Scanner scanner = new Scanner(System.in);

    public void cambiarContraseña(){
        System.out.println("Inserte contraseña actual");
        String datoEsperado = scanner.next();
        if (contraseña.equals(datoEsperado)){
            System.out.println("Inserte nueva contraseña");
            String nuevaContraseña = scanner.next();
            contraseña = nuevaContraseña;
        }
        else{
            System.out.println("Contraseña invalida");
        }
    }

    public void cambiarNombreUsuario(){
        System.out.println("Inserte contraseña actual");
        String datoEsperado = scanner.next();
        if (contraseña.equals(datoEsperado)){
            System.out.println("Inserte nuevo nombre de usuario");
            String nuevoNombreUsuario = scanner.next();
            nombreUsuario = nuevoNombreUsuario;
        }
        else{
            System.out.println("Contraseña invalida");
        }
    }


    public void cambiarNombreCine(Cine cine ){
        System.out.println("Inserte el nuevo nombre del Cine");
        String nombreCine = scanner.next();
        cine.setNombreCine(nombreCine);
    }

    public void agregarSala(Cine cine){
        System.out.println("Inserte el nombre de la nueva sala");
        String nombreNuevaSala = scanner.next();
        System.out.println("Inserte capacidad de asientos");
        int capacidadAsientos = scanner.nextInt();
        System.out.println("Inserte capacidad de columnas");
        int capacidadColumnas = scanner.nextInt();
        System.out.println("Inserte capacidad Filas");
        int capacidadFilas = scanner.nextInt();

        Sala sala = new Sala(capacidadAsientos,nombreNuevaSala,capacidadFilas,capacidadColumnas);
        cine.agregarSala(sala);
    }

    public void quitarSala(Cine cine){
        System.out.println("Inserte el nombre/codigo de sala que desea quitar");
        String nombreDeSala = scanner.next();
        System.out.println("Inserte contraseña");
        String contraseña = scanner.next();
        if (this.contraseña.equals(contraseña)){
            cine.quitarSala(nombreDeSala);
        }
        else{
            System.out.println("Contraseña invalida");
        }
    }

    public void agregarPelicula(){
        System.out.println("Inserte el nombre de la pelicula");
        String nombrePelicula = scanner.next();
        System.out.println("Inserte el ID de la pelicula");
        int idPelicula = scanner.nextInt();
        System.out.println("Inserte director");
        String director = scanner.next();
        System.out.println("Indique la clasifiación:Inserte\n1 para A ; 2 para B ; 3 para C");
        Clasificacion clasificacion;
        int clasifiacionNum = scanner.nextInt();
        switch (clasifiacionNum){
            case 1:
                clasificacion = Clasificacion.CLASIFICACION_A;
                break;

            case 2:
                clasificacion = Clasificacion.CLASIFICACION_B;
                break;

            case 3:
                clasificacion = Clasificacion.CLASIFICACION_C;
                break;

            default:
                System.out.println("Valor no valido");
        }

        System.out.println("Inserte idioma");
        String idioma = scanner.next();

        System.out.println("Inserte duracion en horas , Ejemplo : 4,5");
        double duracion = scanner.nextDouble();

        System.out.println("Inserte la dimension de la pelicula\n1 para 2D ; 2 para 3D");
        Dimension dimension;
        int dimensionNum = scanner.nextInt();

        switch (dimensionNum){
            case 1:
                dimension = Dimension.D2;
                break;

            case 2:
                dimension = Dimension.D3;
                break;

            default:
                System.out.println("Valor no valido");
        }


    }





}
