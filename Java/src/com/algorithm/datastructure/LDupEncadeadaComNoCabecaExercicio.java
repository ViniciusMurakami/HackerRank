package com.algorithm.datastructure;

import javax.swing.JOptionPane;
/**
 * * @author hulda.melo
 */
public class LDupEncadeadaComNoCabecaExercicio {
    static final String[] menuInicial = {
            "Inserir no Início da Lista",
            "Inserir no Final da Lista",
            "Inserir Após um valor",
            "Remover do Início da Lista",
            "Remover do Final da Lista",
            "Remover Após um valor",
            "Limpar a Lista",
            "Listar",
            "Sair"
    };
    public static void main(String[] args) {
        Classe_ListaDencadeada<String> auxiliar;
        Classe_ListaDencadeada kbeca = null;
        String entrada, depois, opcao;
        do {
            opcao = (String) (JOptionPane.showInputDialog(null, "Escolha sua opção", "Painel de opções", JOptionPane.QUESTION_MESSAGE, null, menuInicial, menuInicial[0]));
            switch (opcao) {
                case "Inserir no Início da Lista":
                    entrada = (JOptionPane.showInputDialog(null, "Informe o elemento a ser inserido no início da lista"));
                    if (kbeca == null) {
                        Classe_ListaDencadeada<String> novo;
                        novo = new Classe_ListaDencadeada<>(entrada);
                        kbeca = novo;
                        kbeca.setAnterior(kbeca);
                        Classe_ListaDencadeada.aumentaTamanho();
                    } else {
                        Classe_ListaDencadeada<String> novo = new Classe_ListaDencadeada<>(entrada, null, kbeca);
                        novo.setAnterior(kbeca.getAnterior());
                        kbeca.setAnterior(novo);
                        kbeca = novo;
                        Classe_ListaDencadeada.aumentaTamanho();
                    }
                    break;
                case "Inserir no Final da Lista":
                    entrada = (JOptionPane.showInputDialog(null, "Informe o elemento a ser inserido no fim da lista"));
                    if (kbeca == null) {
                        Classe_ListaDencadeada<String> novo;
                        novo = new Classe_ListaDencadeada<>(entrada);
                        kbeca = novo;
                        kbeca.setAnterior(kbeca);
                        Classe_ListaDencadeada.aumentaTamanho();
                    } else {
                        Classe_ListaDencadeada<String> novo = new Classe_ListaDencadeada<>(entrada);
                        novo.setAnterior(kbeca.getAnterior());
                        kbeca.getAnterior().setProximo(novo);
                        kbeca.setAnterior(novo);
                        Classe_ListaDencadeada.aumentaTamanho();
                    }
                    break;
                case "Inserir Após um valor":
                    entrada = (JOptionPane.showInputDialog(null, "Informe o elemento a ser inserido"));
                    depois = (JOptionPane.showInputDialog(null, "Ele será inserido após qual elemento?"));
                    auxiliar = kbeca;
                    if (kbeca != null) {
                        while (auxiliar.getObjeto() != null) {
                            if (auxiliar.getObjeto().equals(depois)) {
                                Classe_ListaDencadeada<String> novo = new Classe_ListaDencadeada<>(entrada);
                                novo.setAnterior(auxiliar);
                                novo.setProximo(auxiliar.getProximo());
                                auxiliar.setProximo(novo);
                                auxiliar.getProximo().setAnterior(novo);
                                Classe_ListaDencadeada.aumentaTamanho();
                                break;
                            } else {
                                auxiliar = auxiliar.getProximo();
                            }
                        }
                    }
                    break;
                case "Remover do Início da Lista":
                    break;
                case "Remover do Final da Lista":
                    break;
                case "Limpar a Lista":
                    break;
                case "Listar":
                    StringBuilder saida = new StringBuilder();
                    int busca = Classe_ListaDencadeada.getTamanho();
                    auxiliar = kbeca;
                    while (busca != 0) {
                        saida.append(auxiliar.getObjeto().toString());
                        auxiliar = auxiliar.getProximo();
                        busca--;
                    }
                    JOptionPane.showMessageDialog(null, saida.toString());
                    break;
            }
        } while (!"Sair".equals(opcao));
    }
}
