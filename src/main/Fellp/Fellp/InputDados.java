package Fellp;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class InputDados {

    public boolean ValidaDouble(double x){
        if (Double.isNaN(x) == false){
            System.out.println("Exeption found, not a number!");
        }
        return  false;
    }
}
