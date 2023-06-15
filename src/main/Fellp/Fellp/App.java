package Fellp;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class App {
    public static void main(String[] args) throws Exception {

        Cadastro cadastro = new Cadastro();
        cadastro.atualizaListaFilmes();
        cadastro.atualizaListaSalas();
        cadastro.addSessao();
    }}
