package Fellp;

public class Sala {

    private String nomeDaSala = "";

    private int quantidadeDeAssentos = 0; 

    private int linhas = 0; 
    
    private int colunas = 0; 

    private boolean[][] lugares = new boolean[linhas][colunas];
    
    public void OcupaLugar(int linha, int coluna){

            this.lugares[linha][coluna] = true;

    }

    public void CalculaAssentos(){

        this.quantidadeDeAssentos = this.linhas * this.colunas;

    }

    public String getNomeDaSala() {
        return nomeDaSala;
    }

    public void setNomeDaSala(String nomeDaSala) {
        this.nomeDaSala = nomeDaSala;
    }

    public int getQuantidadeDeAssentos() {
        return quantidadeDeAssentos;
    }

    public void setQuantidadeDeAssentos(int quantidadeDeAssentos) {
        this.quantidadeDeAssentos = quantidadeDeAssentos;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }


    public String toString(){

        return "Sala: "+ this.nomeDaSala + 
        "Quantidade de assentos: " + this.quantidadeDeAssentos; 
    }


    
    

}
