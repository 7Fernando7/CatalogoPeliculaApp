package servicio;

import dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculaLista implements  IServicioPeliculas{

    private final List<Pelicula> peliculas;

    public ServicioPeliculaLista(){
        this.peliculas = new ArrayList<>();
    }
    @Override
    public void listarPeliculas() {
        System.out.println("Listado de peliculas... ");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Se agrego la pelicula " + pelicula);
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        //Regresa el indice de la pelicula encontrada en la lista
        var indice = peliculas.indexOf(pelicula);
        System.out.println("Pelicula encontrada en el indice: " + indice);

    }

    public static void main(String[] args) {
        // Creamos algunos objetos te tipo pelicula

        var pelicula1 = new Pelicula("Batman");
        var pelicula2 = new Pelicula("Superman");



        /**Primero utilizamos el Tipo de dato de la interface,
         posteriormente agregamos el nombre de nuestro objeto
         y finalmente creamos un nuevo objeto utilizando la clase que implementa la interface.
         Así que podemos obeservar que del lado derecho tenemos la implementación concreta
         y del lado izquierdo el uso de la interface*/

        /** Esto es muy similar cuando trabajamos por ejemplo con una Lista, del lado izquierdo para definir del tipo de dato
         utilizamos una List<Pelicula> que es una interface, y del lado derecho cuando se crea el objeto en concreto entonces
         se utiliza una clase ArrayList<>() que implementa por su vez la interface List.
         que List es una inteface, y ArrayList una clase concreta.

         private final List<Pelicula> peliculas;
         *
         public ServicioPeliculaLista(){
            this.peliculas = new ArrayList<>();
          } */

        //Creamos mi objeto de servicio(patron de diseño service)
        IServicioPeliculas  servicioPeliculas = new ServicioPeliculaLista();

        //Agregamos las peliculas a la lista

        servicioPeliculas.agregarPelicula(pelicula1);
        servicioPeliculas.agregarPelicula(pelicula2);

        //Listamos las peliculas
        servicioPeliculas.listarPeliculas();

    }



}
