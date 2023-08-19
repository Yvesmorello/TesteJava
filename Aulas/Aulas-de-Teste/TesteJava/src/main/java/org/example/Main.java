package org.example;
public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        String retorno = calculadora.HelloWorld();
        System.out.println(retorno);

        if(calculadora.somar(1,1)==2){
            System.out.println("Sucesso");
        }
        else{
            System.out.println("Falha");
        }
    }
}