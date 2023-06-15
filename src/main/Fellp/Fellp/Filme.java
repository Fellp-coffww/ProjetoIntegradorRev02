package Fellp;

public class Filme {
    
private String nomeDoFilme = "";

private int anoDeLancamento = 0;

private String classificacao = "";

private String genero = "";

private String sinopse = "";

private double duracao = 0;

private String atorPrincipal = "";



public String getNomeDoFilme() {
    return nomeDoFilme;
}

public int getAnoDeLancamento() {
    return anoDeLancamento;
}

public String getClassificacao() {
    return classificacao;
}

public String getGenero() {
    return genero;
}

public String getSinopse() {
    return sinopse;
}

public double getDuracao() {
    return duracao;
}

public void setNomeDoFilme(String nomeDoFilme) {
    this.nomeDoFilme = nomeDoFilme;
}

public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
}

public void setClassificacao(String classificacao) {
    this.classificacao = classificacao;
}

public void setGenero(String genero) {
    this.genero = genero;
}

public void setSinopse(String sinopse) {
    this.sinopse = sinopse;
}

public void setDuracao(double duracao) {
    this.duracao = duracao;
}


public String toString(){

    return this.nomeDoFilme+
    "\n" + this.anoDeLancamento
    +"\n"  + this.classificacao
    +"\n"  + this.genero
    +"\n"  + this.sinopse;

}

public String getAtorPrincipal() {
    return atorPrincipal;
}

public void setAtorPrincipal(String atorPrincipal) {
    this.atorPrincipal = atorPrincipal;
}





}
