package Fellp;

import java.util.Scanner;
public class InputDados {

    public boolean ValidaDouble(String string) {
        try {
            double var = 0;
            var = Double.parseDouble(string);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    public boolean ValidaInteger(String string) {
        try {
            int var = 0;
            var = Integer.parseInt(string);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Integer isInteger(String string){
        System.out.print(string);
        Scanner sc = new Scanner(System.in);
        String temp = "";
        temp = sc.nextLine();
        while (ValidaInteger(temp) == false) {
            System.out.println("Digite novamente, formato inválido!  \n");
            System.out.print(string);
            temp = sc.nextLine();
        }
        return Integer.parseInt(temp);
    }



    public double isDouble(String string){

        System.out.print(string);
        Scanner sc = new Scanner(System.in);
        String temp = "";
        temp = sc.nextLine();
        while (ValidaDouble(temp) == false) {
            System.out.println("Digite novamente, formato inválido!  \n");
            System.out.print(string);
            temp = sc.nextLine();
        }
        return Double.parseDouble(temp);

    }

   public boolean sizeIsTrue(int number, int size){
        int copy = 0;
        while (number!=0){
            number = number/10;
            copy++;
        }
        if (copy == size){

           return true;
        }
        else {
            return false;
        }
    }

    public int validateSizeNumber(int size, String message){

        int number = isInteger(message);
        while (sizeIsTrue(number,size) == false){
            System.out.println("Digite novamente, tamanho insuficiente, digite um número de tamanho: " + size);
            number = isInteger("");
        }
        return number;
    }


}

