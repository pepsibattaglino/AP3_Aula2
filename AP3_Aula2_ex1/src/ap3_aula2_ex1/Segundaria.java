package ap3_aula2_ex1;

import java.util.Random;

/*Crie um array de 200 números randômicos e mostre o índice do
maior valor, do menor valor e do valor mediano.*/ 
public class Segundaria {
    
    private int index = 10;
    private int[] vet = new int[index];
    
    public void carregaVet() {
        Random rnd = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rnd.nextInt(10);//Integer.MAX_VALUE ==> serve para indicar o maximo valor de integer.
        }
    }
    
    public void lerVet() {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " | ");
        }
        System.out.println();
    }
       
    public int calculaMenor() {
        int menor = vet[0]; 
        for (int i = 1; i < vet.length; i++) {
            if (menor >= vet[i]) {
                menor = vet[i];
            }
        }
        return menor;
    }
    
    public void lerMenor() {
        System.out.println("Menor: " + this.calculaMenor());
    }
    
    public int calculaMaior(){
        int maior = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (maior <= vet[i]) {
                maior = vet[i];
            }
        }
        return maior;
    }
    
    public void lerMaior() {
        System.out.println("Maior: " + this.calculaMaior());
    }
    
    public void ordenaVet() {
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (vet[i] < vet[j]) {
                    int aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }
    
    public int calculaMediano() {
        int mediano = vet[0];
        for (int i = 1; i < vet.length; i++) {
            
        }
        return mediano;
    }//--------------------------------------------------- incompleto
    
    public void lerMediano() {
        System.out.println("Mediano: " + this.calculaMediano());
    }
    
}
