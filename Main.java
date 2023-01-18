package org.losremedios.prog.ut4.actividades.act1;

public class Main {

    public static void main(String[] args) {

        int x = 1;
        String s="Hola";
        Double [] a={1d,2.5d,34.56d,null,0d};


        System.out.println(x);
        System.out.println(s);
        System.out.println(a[1]);

        m(x,s,a);

        System.out.println(a[1]);

        /**
         * En cambio el array si cambia porque se le reserva un espacio en la memoria
         * y se le pasa por referencia los valores al metodo, no una copia como en los
         * casos anteriores, por lo cual si cambia el valor
         * /paso por referencia/
         */

        System.out.println(s);
        /**
         * Al que igual que sucede con la variable tipo
         * entero no cambia el valor por el mismo motivo,
         * es una copia del espacio de memoria que ocupa
         * /paso por valor/
         */
        System.out.println(x);
        /**
         * No cambia el valor de x debido a la copia del
         * valor original que le llega el metodo, la suma se
         * la hace a la copia que recibe no el valor original
         * que ocupa la variable declarada e inicializada.
         * /paso por valor/
         */

        //Correcion//

        System.out.println(x);
        m(x);
        System.out.println(x);

        System.out.println(x);
        System.out.println(s);
        m(x,s);
        System.out.println(x);
        System.out.println(s);

        System.out.println(x);
        System.out.println(s);
        System.out.println(a);
        m(x,s,a);
        System.out.println(x);
        System.out.println(s);
        System.out.println(a);

        System.out.println(x);
        System.out.println(s);
        System.out.println(a);
        m2(x,s,a);
        System.out.println(x);
        System.out.println(s);
        System.out.println(a);


    }

    //Con sobrecarga//

    //Correcion//
    static void m (int x){
        x++;
    }
    static void m (int x, String s){
        s="HOLA";
        //s=s.toUpperCase();
        m (x);
    }
    static void m (int x, String s, Double[] a){

        a[1]=77.6;
        a[0]++;
        a[a.length-1]++;
        a[(a.length-1)/2]++;
        //a[(int) Math.floor(a.length/2)]++;
        m(x,s);
    }
    static int[][] m2 (int x, String s, Double[] a){

        int n = a.length;
        int m = 2;
        //Invoca al resto de metodos
        m(x,s,a);
        //Creamos el array n*m
        int [][] resultado=new int[n][m];
        //Pasa del tipo doble a int y que nos de el decimal
        resultado[0][0]=(int)Math.floor(a[0]);
        resultado[0][1]=(int)Math.round(a[0]);

        resultado[1][0]=(int)Math.floor(a[1]);
        resultado[1][1]=(int)Math.round(a[1]);

        resultado[2][0]=(int)Math.floor(a[2]);
        resultado[2][1]=(int)Math.round(a[2]);

        resultado[3][0]=(int)Math.floor(a[3]);
        resultado[3][1]=(int)Math.round(a[3]);

        resultado[4][0]=(int)Math.floor(a[4]);
        resultado[4][1]=(int)Math.round(a[4]);



        return resultado;
    }
    //Modificando el metodo
    /**static void m (int x, String s, Double[] a){

        x++;
        s="HOLA";
        a[1]=77.6;
        a[0]+=1;
        a[2]+=1;
        a[4]+=1;

    }*/
}
