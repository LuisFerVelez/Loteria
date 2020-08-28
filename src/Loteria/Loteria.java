package Loteria;

import java.util.Random;
import java.util.Scanner;

public class Loteria {

    int arreglo[] = new int[5];

    public void llamarLoteria() {
        Scanner entrada = new Scanner(System.in);

        int numeros, i = 0;
        boolean v = true;

        do {
            System.out.print("Digite los numeros: ");
            numeros = entrada.nextInt();
            if (numeros >= 0 && numeros <= 10) {
                if (i == 0) {
                    arreglo[i] = numeros;
                    i++;

                } else {
                    v = true;
                    for (int j = 0; j < i; j++) {
                        if (arreglo[j] == numeros) {
                            v = false;

                        }

                    }
                    if (v == true) {
                        arreglo[i] = numeros;
                        i++;

                    } else {
                        System.out.println("Ese numero ya se registro,ingreso otro");

                    }

                }

            } else {
                System.out.println("No esta dentro del rango, vuelva a intentarlo");

            }
            
        } while (i < 5);
        for(int s=0;s<arreglo.length;s++){
            System.out.print(arreglo[s]+" ");
            
        }
    }

    public void calcularNumeros() {
        Random ram = new Random();
        boolean x = false;
        int num = ram.nextInt(11);
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num) {
                x = true;
                break;

            }

        }
        if (x ==true) {
            System.out.println("¡Felicidades Ganastes!"+" Su numero ganador es: "+num);

        }else{
            System.out.println("¡Losiento Perdistes!"+" El numero ganador fue: "+num);
        
        }

    }

}
