package Fellp;


public class Sessao {

 private String data = "";
 
 private Sala sala = new Sala();

 private int indexSala = 0;
 private Filme filme = new Filme();

 private String nomeSessao = "";

 private String horario = "";

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

public String getHorario() {
    return horario;
}

public void setData(String data) {
    this.data = data;
}

public void setHorario(String horario) {
    this.horario = horario;
}

public String getNomeSessao() {
        return nomeSessao;
    }

public void setNomeSessao(String nomeSessao) {
        this.nomeSessao = nomeSessao;
    }

public int getIndexSala() {
        return indexSala;
    }

public void setIndexSala(int indexSala) {
        this.indexSala = indexSala;
    }


public String toString(){

return "Filme: " +  filme.getNomeDoFilme()+ "     " +
"Sala: " + sala.getNomeDaSala() + "\n" +
"Data: " + this.data + "        " +
"Horário: " + this.horario + "h";




}

}
