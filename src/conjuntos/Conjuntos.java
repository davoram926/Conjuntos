package conjuntos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Conjuntos<T> implements Conjuntable<T>, Iterator<T> {
    //atributos
    private T[] data; //elemenos del conjunto
    private int nElem,pos;
    private static final int SIZE =20;

    //constructores
    public Conjuntos() {
        this(SIZE);//llamada de constructor a constructor
    }
    public Conjuntos(int size) {
        data = (T[]) new Object[ size>0 ? size : SIZE ];
        Arrays.fill(data,null);
        nElem =pos=0;
    }
    public Conjuntos(Conjuntos<T> set) {
        this.data = Arrays.copyOf(set.data, set.data.length);
        this.nElem = set.nElem;
    }


    @Override
    public boolean vacio() {
        return nElem==0;
    }

    @Override
    public void limpia() {
        Arrays.fill(data,null);
        nElem =0;

    }

    @Override
    public void agregar(T elemento) {
            if (contiene(elemento) == -1) { //no esta el elemento
                if (nElem >= data.length) {
                    data = Arrays.copyOf(data, data.length + 1);
                }
                data[nElem++] = elemento;
            }
    }

    @Override
    public void eliminar(T elemento) {

    }

    @Override
    public int contiene(T elemento) {
        return contiene(elemento,0);
    }
   //recursividad indirecta
                                 //
   public int contiene(T elemento,int index) {
       if (index == data.length-1 || data[index] == null ) {//no lo encontre
           return -1;
       }
       if ( data[index].equals(elemento)) { //lo encontre
           return index;
       }
       return contiene(elemento,index+1); //busco de nuevo
   }
    @Override
    public Conjuntos<T> union(Conjuntos<T> set) {
        Conjuntos<T> nuevo = new Conjuntos<T>(this);
        //a {13 5 7 3}   set { 5 3 20 2}
        // nuevo {13 5 7 3 }
        for (int i = 0; i < set.data.length; i++) {
            if (nuevo.contiene(set.data[i]) == -1) { //no esta
                nuevo.agregar(set.data[i]); //lo agrego en nuevo
            }
        }
        return nuevo;
    }

    @Override
    public Conjuntos<T> interseccion(Conjuntos<T> set) {
        return null;
    }

    @Override
    public Conjuntos<T> diferencia(Conjuntos<T> set) {
        return null;
    }

    @Override
    public boolean subconjunto(Conjuntos<T> set) {
        return false;
    }

    @Override
    public boolean hasNext() {
        return this.pos < nElem;
    }

    @Override
    public T next() throws NoSuchElementException {
        if (hasNext()) {
            return data[pos++];
        }
        throw new NoSuchElementException("No hay más elementos");
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();

        this.pos = 0;

        while (this.hasNext()){
            T tmp = this.next();
            cadena.append(" "+tmp.toString());
        }

        this.pos = 0;

        return nElem+" Elementos:"+cadena;
    }

    public T[] getData() {
        return data;
    }


}
