package Fellp;

public class Ingresso {


    private Sessao sessao = new Sessao();
    private Filme filme = new Filme();

    private int  poltrona = 0;

    private boolean type = false;

    private String mail = "";

    private double preco = 0;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String toString(){


        String temp = "\n"+ sessao.toString() + "\n" +
                "Poltrona: " + this.poltrona + "         " +
                "Preço: " + this.preco + "R$" + "\n";
        if (type == true){

            temp = temp + "Tipo de ingresso: Meia entrada  \n";
        }
        else {
            temp = temp + "Tipo de ingresso: Entrada inteira \n";
        }

        return temp;
    }

}
