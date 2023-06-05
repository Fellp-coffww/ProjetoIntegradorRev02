package Fellp;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {
    public static void main(String[] args) throws Exception {

    Cadastro cadastro = new Cadastro();
    cadastro.atualizaLista();
        System.out.println(cadastro.retornaFilmes());
    }


  }
