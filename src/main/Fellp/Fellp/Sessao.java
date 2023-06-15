package Fellp;


public class Sessao {
    


 private String data = "";
 
 private Sala sala = new Sala();

 private Filme filme = new Filme();

 private String nomeSessao = "";

 private int horario = 0;

public void setSala(Sala sala) {
    this.sala = sala;
}

public void setFilme(Filme filme) {
    this.filme = filme;
}

public Sala getSala() {
    return sala;
}

public Filme getFilme() {
    return filme;
}

public String getData() {
    return data;
}

public int getHorario() {
    return horario;
}

public void setData(String data) {
    this.data = data;
}

public void setHorario(int horario) {
    this.horario = horario;
}

    public String getNomeSessao() {
        return nomeSessao;
    }

    public void setNomeSessao(String nomeSessao) {
        this.nomeSessao = nomeSessao;
    }

    public String toString(){

return "Filme: " +  filme.getNomeDoFilme()+ "\n" + 
"Sala: " + sala.getNomeDaSala() + "\n" + 
"Horário: " + this.horario; 


}

}
