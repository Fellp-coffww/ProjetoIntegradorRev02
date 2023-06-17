package Fellp;

public class Sala {

    private String nomeDaSala = "";

    private int quantidadeDeAssentos = 0;

    private int linhas = 0; 
    
    private int colunas = 0; 

    private boolean[][] lugares = new boolean[this.linhas][this.colunas];


    public void setLugares(int x, int y) {
        this.lugares = new boolean[x][y];
    }

    public void OcupaLugar(int linha, int coluna){

            this.lugares[linha][coluna] = true;

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

        return this.nomeDaSala +"\n"+
                this.linhas + "\n"+
                this.colunas + "\n" +
         this.quantidadeDeAssentos ;
    }

    public String salaTamanho(){

        String temp = "\n"+"   ";
        if (lugares.length == 0 ) {
            setLugares(this.linhas, this.colunas);
        }

        for( int x  = 0; x <= lugares.length;x++) {
            temp = temp + Integer.toString (x+1) + "  ";
        }

        temp = temp + "\n";

        for( int x  = 0; x < lugares.length;x++) {

            temp = temp + Integer.toString(x+1) + " ";
            for(int y = 0; y<lugares[x].length; y++){
                if (lugares[x][y] == false){
                    temp = temp + " 0 ";
                }
                else {

                    temp = temp + " X ";
                }
            }
            temp = temp + "\n";
        }
    return temp;
    }


    
    

}
