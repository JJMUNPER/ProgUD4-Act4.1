package org.losremedios.prog.ut4.actividades.act1;

public class Main {

    public static void main(String[] args) {

        int x = 1;
        String s="Hola";
        Double [] a={1d,2.5,34.56,0d};


        System.out.println(x);
        System.out.println(s);
        System.out.println(a[1]);

        m(x,s,a);

        System.out.println(a[1]);

        /**
         * En cambio el array si cambia porque se le reserva un espacio en la memoria
         * y se le pasa por referencia los valores al metodo, no una copia como en los
         * casos anteriores, por lo cual si cambia el valor
         */

        System.out.println(s);
        /**
         * Al que igual que sucede con la variable tipo
         * entero no cambia el valor por el mismo motivo,
         * es una copia del espacio de memoria que ocupa
         */
        System.out.println(x);
        /**
         * No cambia el valor de x debido a la copia del
         * valor original que le llega el metodo, la suma se
         * la hace a la copia que recibe no el valor original
         * que ocupa la variable declarada e inicializada.
         */


    }

    static void m (int x, String s, Double[] a){

        x++;
        s="HOLA";
        a[1]=77.6;

    }
}
