package com.fatec;

import prjApolice.Apolice;

public class ApoliceTeste {
    public static void main(String[] args){
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("cristiano");
        apolice.setIdade(39);
        apolice.setValorSegurado(1550000.00);

        String poeNaTela_CortaPraMim = apolice.imprimir();


    }
}
