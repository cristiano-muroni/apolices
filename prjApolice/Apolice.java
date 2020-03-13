package prjApolice;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private double valorSegurado;

    public String imprimir(){
        System.out.println("o nome do segurado é:" + getNomeSegurado());
        System.out.println("a idade do segurado é:" + getIdade());
        System.out.println("o valor que ele receberá será:" + getValorSegurado());


        return null;
    }


    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorSegurado() {
        return valorSegurado;
    }

    public void setValorSegurado(double valorSegurado) {
        this.valorSegurado = valorSegurado;
    }
}
