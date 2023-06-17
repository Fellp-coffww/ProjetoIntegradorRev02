package Fellp;


import org.apache.poi.ss.formula.atp.Switch;

public class MainConversation {

    Cadastro cadastro = new Cadastro();
    InputDados inputDados = new InputDados();
    public void interfaceCinemaAdmin(){

        cadastro.atualizaListaSalas();
        cadastro.atualizaListaFilmes();
        System.out.println("--------- Welcome to System CineAdmin Revision 0.1 ---------"+"\n");
        System.out.println("Administrador do sistema do CineABC, seja bem vindo! O que deseja fazer? \n"+
                "Digite as opções pelo seu devido índice!"+"\n");

        String options = "1 - Cadastrar filmes; \n"+
                "2 - Cadastrar sala; \n" +
                "3 - Cadastrar sessões;\n" +
                "4 - Obter relatório de venda.\n"+
                "5 - Sair" +"\n"+
                "O que você deseja fazer agora? ";


        int number = inputDados.isInteger(options + "\n");

        while (number != 5){

            switch (number){
                case 1:
                    cadastro.addFilme();
                    break;
                case 2:
                    cadastro.addSala();
                    break;
                case 3:
                    cadastro.addSessao();
                    break;
            }
          number = inputDados.isInteger(options + "\n");

        }

    cadastro.salvaSalasTxt();
    cadastro.salvaFilmesTxt();
    cadastro.salvaSessoesTxt();
    System.out.println("--------- Thank you for using our System! ---------"+"\n");
    }

    public void interfaceCinemaClient(){

       Sessao sessao = new Sessao();
        cadastro.atualizaListaSalas();
        cadastro.atualizaListaFilmes();
        sessao.setSala(cadastro.listaSala.get(0));
        sessao.setFilme(cadastro.listaFilme.get(0));
        sessao.setHorario("12:45");
        sessao.setData("12/07/08");
        cadastro.listaFilme.get(0).addListaSessao(sessao);
        cadastro.vendaIngresso();


    }


}
