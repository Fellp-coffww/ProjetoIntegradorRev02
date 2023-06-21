package Fellp;


public class App {
    public static void main(String[] args) throws Exception {

   Sala sala = new Sala();
   sala.setLugares(12,10);
   sala.setColunas(10);
   sala.setLinhas(12);
   sala.setNomeDaSala("dxfcgbhjkl");

   Sessao sessao= new Sessao();
   sessao.setSala(sala);


    }}
