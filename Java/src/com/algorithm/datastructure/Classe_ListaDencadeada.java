package com.algorithm.datastructure;

/**
 * @author hulda.melo
 */
public class Classe_ListaDencadeada<E> {
    private static int tamanho;
    private E objeto;
    private Classe_ListaDencadeada<E> proximo;
    private Classe_ListaDencadeada<E> anterior;
    /**
     * Este construtor cria um nó que recebe como valor o objeto passado como
     * parâmetro. Ele, automaticamente, apontará para anterior nulo e para
     * próximo nulo.
     *
     * @param objeto
     */
    public Classe_ListaDencadeada(E objeto) {
        this.objeto = objeto;
        this.anterior = null;
        this.proximo = null;
    }
    /**
     * Este construtor cria um nó e o aloca entre os nós passados como
     * parâmetros. Ele automaticamente apontará para os nós.
     *
     * @param objeto
     * @param anterior
     * @param proximo
     */
    public Classe_ListaDencadeada(E objeto, Classe_ListaDencadeada<E> anterior, Classe_ListaDencadeada<E> proximo) {
        this.objeto = objeto;
        this.proximo = proximo;
        this.anterior = anterior;
    }
    public static int getTamanho() {
        return tamanho;
    }
    public static void aumentaTamanho() {
        tamanho++;
    }
    public static void diminuiTamanho() {
        tamanho--;
    }
    public E getObjeto() {
        return objeto;
    }
    public Classe_ListaDencadeada<E> getProximo() {
        return proximo;
    }
    public void setProximo(Classe_ListaDencadeada<E> proximo) {
        this.proximo = proximo;
    }
    public Classe_ListaDencadeada<E> getAnterior() {
        return anterior;
    }
    public void setAnterior(Classe_ListaDencadeada<E> anterior) {
        this.anterior = anterior;
    }
}