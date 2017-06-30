public class Main {

    public static void main(String[] args) {
        /*
    1. Crear una clase Libro que contenga los siguientes atributos:
	- ISBN
	- Titulo
	- Autor
	- Número de páginas

    Crear sus respectivos métodos get y set correspondientes para cada atributo.

    Crear el método toString() para mostrar la información relativa al libro con el
    siguiente formato:
	"El libro <su_titulo> con ISBN <su_ISBN> creado por el autor <su_autor> tiene
	<num_paginas> páginas"

    En el fichero main, crear 2 objetos Libro (los valores que se quieran) y
    mostrarlos por pantalla.
    Por último, indicar cuál de los 2 tiene más páginas.*/

        Libro libro_1 = new Libro();
        libro_1.setAutor("Edguar Poo");
        libro_1.setISBN(54345532);
        libro_1.setTitulo("El Cuervo");
        libro_1.setNum_de_pag(354);

        System.out.println(libro_1);

        Libro libro_2 = new Libro();
        libro_2.setAutor("Harry Poter");
        libro_2.setISBN(54463432);
        libro_2.setTitulo("Las Reliquias De La Muerte");
        libro_2.setNum_de_pag(344);

        System.out.println(libro_2);
        if (libro_1.getNum_de_pag()>libro_2.getNum_de_pag()){
            System.out.println("El libro " + libro_1 + "tiene mas pag");
        }else{
            System.out.println("El libro " + libro_2 + "tiene mas pag");
        }
    }
}
