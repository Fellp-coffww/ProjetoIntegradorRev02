package Fellp;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro   {
    
Scanner sc = new Scanner(System.in); 

ArrayList <Filme> listaFilme = new ArrayList<>();

ArrayList <Sala> listaSala = new ArrayList<>();

ArrayList <Sessao> listaSessao = new ArrayList<>();


Sala sala = new Sala(); 


public void addFilme(){

    Filme filme = new Filme();

    System.out.print("Nome do filme: ");
    filme.setNomeDoFilme(sc.nextLine());
    
    System.out.print("Ano de lançamento: ");
    filme.setAnoDeLancamento(Integer.parseInt(sc.nextLine()));
    
    System.out.print("Classificação: ");
    filme.setClassificacao(sc.nextLine());

    System.out.print("Genêro: ");
    filme.setGenero(sc.nextLine());

    System.out.print("Sinopse: ");
    filme.setSinopse(sc.nextLine());

    listaFilme.add(filme);
}




public void addSala(){

    Sala sala = new Sala();

    System.out.println("Nome da sala: ");
    sala.setNomeDaSala(sc.nextLine());

    System.out.print("Números de colunas: ");
    sala.setColunas(Integer.parseInt(sc.nextLine()));
    
    System.out.print("Números de linhas: ");
    sala.setLinhas(Integer.parseInt(sc.nextLine()));

    listaSala.add(sala);
    

}

public void addSessao(){

 Sessao sessao = new Sessao();
 System.out.println(retornaFilmes());
 System.out.print("Seleciona o filme pelo seu ID: ");
 sessao.setFilme(listaFilme.get(Integer.parseInt(sc.nextLine())));
 System.out.print("Seleciona o filme pelo seu ID: ");
 listaSessao.add(sessao);



}



public String retornaFilmes(){

String temp  = Integer.toString(listaFilme.size())+ "\n";

for (int n = 0; n < listaFilme.size(); n++){

    temp = temp + " "+ listaFilme.get(n).toString() + "\n";
}

return temp;


}

public String retornaSalas(){

    String temp  = ""; 
    
    for (int n = 0; n < listaSessao.size(); n++){
    
        temp = temp +  n + " "+ listaSessao.get(n).toString() + "\n";
    }
    
    return temp;
    
    
    }

    public String retornaSessao(){

        String temp  = ""; 
        
        for (int n = 0; n < listaSala.size(); n++){
        
            temp = temp +  n + " "+ listaSala.get(n).toString() + "\n";
        }
        
        return temp;
        
        
        }


        public void salvaFilmesTxt(){

    try {
        Path filmesTxt = Paths.get("D:\\Nova pasta\\ProjetoIntegradorRev02\\src\\main\\Fellp\\Filmes.txt");
        byte[] toFile = retornaFilmes().getBytes();
        Files.write(filmesTxt, toFile);
    }
    catch (Exception e){
    System.err.println(e);
    }
        }

    public void atualizaLista(){

        File file = new File("D:\\Nova pasta\\ProjetoIntegradorRev02\\src\\main\\Fellp\\Filmes.txt");
        try {


            InputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            int size = Integer.parseInt(bufferedReader.readLine());

            for (int i = 0 ; i < size; i++){

                Filme filme = new Filme();
                filme.setNomeDoFilme(bufferedReader.readLine());
                filme.setAnoDeLancamento(Integer.parseInt(bufferedReader.readLine()));
                filme.setClassificacao(bufferedReader.readLine());
                filme.setGenero(bufferedReader.readLine());
                filme.setClassificacao(bufferedReader.readLine());

                listaFilme.add(filme);

            }

        }

        catch (Exception e){

            System.err.println(e);

        }
    }


}
