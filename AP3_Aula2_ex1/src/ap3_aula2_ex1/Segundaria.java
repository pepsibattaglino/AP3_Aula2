
package ap3_aula2_ex1;

import java.util.Random;

/*Crie um array de 200 números randômicos e mostre o índice do
maior valor, do menor valor e do valor mediano.*/ 
public class Segundaria {
    Random rnd = new Random();
    int index = 10;
    int[] vet = new int[index];
    int maior;
    int menor;
    
    public void carregaVet() {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rnd.nextInt(100);
        }
    }
    
    public void lerVet() {
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
    
    
    
    
}
