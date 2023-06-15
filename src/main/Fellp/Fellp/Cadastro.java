package Fellp;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    Scanner sc = new Scanner(System.in);
    ArrayList<Filme> listaFilme = new ArrayList<>();
    ArrayList<Sala> listaSala = new ArrayList<>();
    Sala sala = new Sala();
    public void addFilme() {

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


    public void addSala() {

        Sala sala = new Sala();

        System.out.print("Nome da sala: ");
        sala.setNomeDaSala(sc.nextLine());

        System.out.print("Números de colunas: ");
        sala.setColunas(Integer.parseInt(sc.nextLine()));

        System.out.print("Números de linhas: ");
        sala.setLinhas(Integer.parseInt(sc.nextLine()));

        listaSala.add(sala);
    }


    public void addSala(Sala sala) {

        listaSala.add(sala);

    }

    public void addFilme(Filme filme) {

        listaFilme.add(filme);

    }


    public void addSessao() {
        Scanner lt = new Scanner(System.in);
        System.out.print("Infome o numero de sessoes que deseja cadastrar: ");
        int N = lt.nextInt();

        for (int i = 0; i < N; i++) {
            Sessao sessao = new Sessao();
            System.out.println("SESSAO " + (i + 1));
            System.out.print("Nome da sessao : ");
            String nome = lt.next();
            sessao.setNomeSessao(nome);
            System.out.println("\n" + toStringBonitinhoSala());
            System.out.print("Digite a sala pelo índice que você deseja adicionar : ");
            sessao.setSala(listaSala.get(lt.nextInt()));
            System.out.print("Infome o horario: ");
            sessao.setHorario(lt.nextInt());
            System.out.print("Infome o dia : ");
            sessao.setData(lt.next());
            System.out.println("\n" + toStringBonitinhoFilme());
            System.out.print("\n" +"Digite o filme pelo índice que você deseja adicionar : ");
            int idx = (lt.nextInt());
            sessao.setFilme(listaFilme.get(idx));
            listaFilme.get(idx).addListaSessao(sessao);
        }
    }

    public String retornaFilmes(boolean idx) {
        String temp = "";
        if (idx == true) {
            temp = Integer.toString(listaFilme.size()) + "\n";
        }
        for (int n = 0; n < listaFilme.size(); n++) {
            temp = temp + listaFilme.get(n).toString() + "\n";
        }
        return temp;
    }


    public String retornaSalas(boolean idx) {
        String temp = "";
        if (idx == true) {
            temp = Integer.toString(listaSala.size()) + "\n";
        }
        for (int n = 0; n < listaSala.size(); n++) {
            temp = temp + listaSala.get(n).toString() + "\n";
        }
        return temp;
    }

    public void salvaFilmesTxt() {
        try {
            Path filmesTxt = Paths.get("D:\\ProjetoIntegradorRev02\\src\\main\\Fellp\\Fellp\\Filmes.txt");
            byte[] toFile = retornaFilmes(true).getBytes();
            Files.write(filmesTxt, toFile);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void salvaSalasTxt() {
        try {
            Path filmesTxt = Paths.get("D:\\ProjetoIntegradorRev02\\src\\main\\Fellp\\Fellp\\Salas.txt");
            byte[] toFile = retornaSalas(true).getBytes();
            Files.write(filmesTxt, toFile);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void salvaSessoesTxt() {

        try {
            Path filmesTxt = Paths.get("D:\\ProjetoIntegradorRev02\\src\\main\\Fellp\\Fellp\\Sessoes.txt");
            byte[] toFile = retornaSessoesToTxt(true).getBytes();
            Files.write(filmesTxt, toFile);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void atualizaListaFilmes() {

        File file = new File("D:\\ProjetoIntegradorRev02\\src\\main\\Fellp\\Fellp\\Filmes.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            int size = Integer.parseInt(bufferedReader.readLine());

            for (int i = 0; i < size; i++) {
                Filme filme = new Filme();
                filme.setNomeDoFilme(bufferedReader.readLine());
                filme.setAnoDeLancamento(Integer.parseInt(bufferedReader.readLine()));
                filme.setClassificacao(bufferedReader.readLine());
                filme.setGenero(bufferedReader.readLine());
                filme.setSinopse(bufferedReader.readLine());
                listaFilme.add(filme);
            }
        } catch (Exception e) {

            System.err.println(e);
        }
    }

    public void atualizaListaSalas() {
        File file = new File("D:\\ProjetoIntegradorRev02\\src\\main\\Fellp\\Fellp\\Salas.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            int size = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < size; i++) {
                Sala sala = new Sala();
                sala.setNomeDaSala(bufferedReader.readLine());
                sala.setQuantidadeDeAssentos(Integer.parseInt(bufferedReader.readLine()));
                listaSala.add(sala);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void vendaIngresso() {
        System.out.println("Bem vindo ao Cineplex! Obrigado pela sua escolha! \nEscolha o filme que deseja assistir: ");
        System.out.println(retornaFilmes(false));
        System.out.println("Escolha o filme pelo índice correspondente: ");
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        System.out.print("Escolha a sessão correspondente: ");
        System.out.println(listaFilme.get(idx).retornaSessoes());
    }

    public String retornaSessoesToTxt(boolean idx) {
        String temp = "";

        for (int n = 0; n < listaFilme.size(); n++) {
            if (idx == true) {
                temp = Integer.toString(listaFilme.get(n).getListaSessao().size());
            }
            for (int x = 0; x < listaFilme.get(n).getListaSessao().size(); x++) {
                temp = temp + listaFilme.get(n).getListaSessaobyIdx(x).toString() + "\n";
            }
        }
        return temp;
    }

    public String toStringBonitinhoSala() {
        String temp = "";
        for (int n = 0; n < listaSala.size(); n++) {
            temp = temp + n+ " - " + "Sala: " + listaSala.get(n).getNomeDaSala()
                    + "\n" + "Quantidade de assentos: " + listaSala.get(n).getQuantidadeDeAssentos() + "\n";
        }
        return temp;
    }

    public String toStringBonitinhoFilme() {
        String temp = "";
        for (int n = 0; n < listaFilme.size(); n++) {
            temp =  temp + n + " - " + "Filme: " + listaFilme.get(n).getNomeDoFilme()
                    + "\n" + "Ano de lançamento: " + listaFilme.get(n).getAnoDeLancamento() +
                    "\n" + "Sinopse: " + listaFilme.get(n).getSinopse()+
                    "\n"+ "Gênero: " + listaFilme.get(n).getGenero() + "\n"+"\n";
        }
        return temp;
    }


}