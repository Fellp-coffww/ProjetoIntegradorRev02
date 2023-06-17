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
    ArrayList<Ingresso> listaIngresso = new ArrayList<>();
    Sala sala = new Sala();

    InputDados ip = new InputDados();

    public void addFilme() {

        String temp = "";
        Filme filme = new Filme();

        System.out.print("Nome do filme: ");
        filme.setNomeDoFilme(sc.nextLine());


        filme.setAnoDeLancamento(ip.isInteger("Ano de lançamento: "));



        System.out.print("Classificação: ");
        filme.setClassificacao(sc.nextLine());

        System.out.print("Genêro: ");
        filme.setGenero(sc.nextLine());

        System.out.print("Sinopse: ");
        filme.setSinopse(sc.nextLine());

        listaFilme.add(filme);

        System.out.println("Cadastro realizado com sucesso! \n");
    }


    public void addSala() {

        Sala sala = new Sala();

        System.out.print("Nome da sala: ");
        sala.setNomeDaSala(sc.nextLine());

        sala.setColunas(ip.isInteger("Números de colunas: "));

        sala.setLinhas(ip.isInteger("Números de linhas: "));

        sala.setQuantidadeDeAssentos(sala.getColunas()* sala.getLinhas());

        listaSala.add(sala);

        System.out.println("Cadastro realizado com sucesso! \n");
    }


    public void addSala(Sala sala) {

        listaSala.add(sala);

    }

    public void addFilme(Filme filme) {

        listaFilme.add(filme);

    }


    public void addSessao() {
        Scanner lt = new Scanner(System.in);
        int N = ip.isInteger("Infome o numero de sessões que deseja cadastrar: ");

        for (int i = 0; i < N; i++) {
            Sessao sessao = new Sessao();
            System.out.println("SESSAO " + (i + 1));
            System.out.print("Nome da sessao : ");
            String nome = lt.next();
            sessao.setNomeSessao(nome);
            System.out.println("\n" + toStringBonitinhoSala());
            int sala = ip.isInteger("Digite a sala pelo índice que você deseja adicionar : ");
            sessao.setSala(listaSala.get(sala));
            sessao.setIndexSala(sala);
            System.out.print("Digite o horário do filme a ser exibido: ");
            sessao.setHorario(lt.next());
            System.out.print("Infome o dia : ");
            sessao.setData(lt.next());
            System.out.println("\n" + toStringBonitinhoFilme());
            int idx = (ip.isInteger( "Digite o filme pelo índice que você deseja adicionar : "));
            sessao.setFilme(listaFilme.get(idx));
            listaFilme.get(idx).addListaSessao(sessao);
            System.out.println("Cadastro realizado com sucesso!\n");
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
                sala.setLinhas(Integer.parseInt(bufferedReader.readLine()));
                sala.setColunas(Integer.parseInt(bufferedReader.readLine()));
                sala.setQuantidadeDeAssentos(Integer.parseInt(bufferedReader.readLine()));
                listaSala.add(sala);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void vendaIngresso() {
        Ingresso ingresso = new Ingresso();
        System.out.println("Bem vindo ao Cineplex! Obrigado pela sua escolha! \nEscolha o filme que deseja assistir: \n");
        System.out.println("\n"+"------Seleção de filme------"+"\n");
        System.out.println(toStringBonitinhoFilme());
        int idx = ip.isInteger("Escolha o filme pelo índice correspondente: ");
        ingresso.setFilme(listaFilme.get(idx));
        System.out.println("\n"+"------Seleção de sessão------"+"\n");
        System.out.println("\n"+listaFilme.get(idx).retornaSessoes() + "\n");
        int idx2 = ip.isInteger("Escolha a sessão do seu agrado: ");
        ingresso.setSessao(listaFilme.get(idx).getListaSessaobyIdx(idx2));
        System.out.println("\n"+"------Seleção de poltrona------"+"\n");
        System.out.println(listaFilme.get(idx).getListaSessaobyIdx(idx2).getSala().salaTamanho());
        int poltronatemp = ip.validateSizeNumber(2,"Escolha a sua poltrona: ");
        ingresso.setPoltrona(poltronatemp);
        listaFilme.get(idx).getListaSessaobyIdx(idx2).getSala().OcupaLugar(poltronatemp/10, poltronatemp%10);
        System.out.println("\n"+"------Seleção de ingresso------"+"\n");
        System.out.print("Deseja a opção de meia entrada(S/N)? ");
        if(sc.next().toLowerCase().equals("s")){
            ingresso.setType(true);
            ingresso.setPreco(25.00);
            System.out.println("\n"+"------Meia poltrona selecionada!------"+"\n");
        }
        else{
            ingresso.setType(false);
            ingresso.setPreco(50.00);
            System.out.println("\n"+"------Inteira selecionada!------"+"\n");
        }
        System.out.print("Cadastre seu email para receber ofertas e promoções! ");
        ingresso.setMail(sc.next());
        listaIngresso.add(ingresso);
        System.out.println("\n---------Venda realizada com sucesso!---------\n");
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

    public  Sala getSalabyIdx(int idx){

        return listaSala.get(idx);
    }

    public String retornaIngressobyIdx(int idx){
        return  listaIngresso.get(idx).toString();
    }
    public String retornaIngressosVendidos(){
        String temp = "";
        for (int n = 0; n< listaIngresso.size(); n++){
            temp = temp + n + " - "+ listaIngresso.get(n).getFilme().getNomeDoFilme();
        }
        return temp;
    }


    public String fincanceiro(){

        String temp = "Ingressos vendidos: " + listaIngresso.size()+"\n";
        double faturamento = 0;
        for (int x = 0; x < listaIngresso.size();x++){
            faturamento = faturamento + listaIngresso.get(x).getPreco();
        }

        temp = temp + "Faturamento: " + faturamento;



        return  temp;
    }



}