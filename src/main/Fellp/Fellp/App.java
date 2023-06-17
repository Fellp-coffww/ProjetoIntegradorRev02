package Fellp;


public class App {
    public static void main(String[] args) throws Exception {

    Cadastro cadastro = new Cadastro();
    cadastro.atualizaListaFilmes();
    cadastro.atualizaListaSalas();
    MainConversation mc = new MainConversation();
    mc.setCadastro(cadastro);
    mc.Maininterface();
    cadastro.salvaFilmesTxt();
    cadastro.salvaSalasTxt();


    }}
