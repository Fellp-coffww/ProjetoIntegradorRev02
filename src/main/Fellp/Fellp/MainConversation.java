package Fellp;


import org.apache.poi.ss.formula.atp.Switch;

public class MainConversation {

    Cadastro cadastro = new Cadastro();
    InputDados inputDados = new InputDados();
    public void interfaceCinemaAdmin(){

        System.out.println("--------- Welcome to System CineAdmin Revision 0.1 ---------"+"\n");
        System.out.println("Administrador do sistema do CineABC, seja bem vindo! O que deseja fazer? \n"+
                "Digite as opções pelo seu devido índice!"+"\n");

        String options = "1 - Cadastrar filmes; \n"+
                "2 - Cadastrar sala; \n" +
                "3 - Cadastrar sessões;\n" +
                "4 - Obter relatório de venda.\n"+
                "5 - Sair. " +"\n"+
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
                case 4:
                    System.out.println(cadastro.fincanceiro());
            }
          number = inputDados.isInteger(options + "\n");

        }

    System.out.println("--------- Thank you for using our System! ---------"+"\n");
    }

    public void interfaceCinemaClient() {

        Sessao sessao = new Sessao();
        sessao.setSala(cadastro.listaSala.get(0));
        sessao.setFilme(cadastro.listaFilme.get(0));
        sessao.setHorario("12:45");
        sessao.setData("12/07/08");
        cadastro.listaFilme.get(0).addListaSessao(sessao);

        System.out.println("--------- Welcome to System CineClient Revision 0.1 ---------" + "\n");
        String options = "1 - Comprar Ingressos; \n" +
                "2 - Ver seu ingresso; \n" +
                "3 - Sair. \n"+
                "\nO que você deseja fazer agora? ";

        int number = inputDados.isInteger(options);
        while (number != 3){

        switch (number) {

            case 1:
                cadastro.vendaIngresso();
                break;
            case 2:
                System.out.println(cadastro.retornaIngressosVendidos());
                System.out.println(cadastro.retornaIngressobyIdx(inputDados.isInteger("Escolha o ingresso que você deseja visualizar: ")));
                break;

        }
            number = inputDados.isInteger(options);
        }

        System.out.println("\n--------- Thank you for using our System! ---------\n");
    }

    public void Maininterface(){

        System.out.println("Bem vindo ao sistema do CineABC! ");
        String option =
        "\n1 - Administrador;\n" +
        "2 - Cliente; \n" +
        "3 - Sair." + "\n"+
        "Deseja entrar como? ";

        int number = inputDados.isInteger(option);

        while (number != 3){

            switch (number){
                case 1:
                    interfaceCinemaAdmin();
                    break;
                case 2:
                    interfaceCinemaClient();
                    break;
            }
            number = inputDados.isInteger(option);
        }
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
}
