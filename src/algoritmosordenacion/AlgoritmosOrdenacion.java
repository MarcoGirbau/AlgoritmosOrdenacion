/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenacion;

import java.util.Arrays;

/**
 * @author xp
 */
public class AlgoritmosOrdenacion 
{
    
    public void ordenacionBurbuja (int [] numeros)
    {
        int a; //Variable para hacer los intercambios
        for(int j = 0; j < numeros.length; j++)
        {    
            for(int i = 0; i < numeros.length - 1; i++)
            {
                if(numeros[i] > numeros[i + 1]) //Intercambiamos
                {
                    a = numeros[i + 1];//Guardamos el numero en el auxiliar
                    numeros[i + 1] = numeros[i];//Movemos uno para atras el segundo numero
                    numeros [i] = a;//Ponemos el numero guardado
                }
            }
            System.out.println(Arrays.toString(numeros));
        }
    }
    
    public void ordenacionBurbuja2 (int [] numeros)
    {
        int a; //Variable para hacer los intercambios
        int b = 1;
        boolean cancer = true;
        while(cancer == true)
        {
            cancer = false;
            for(int i = 0; i < 6 - b; i++)
            {
                if(numeros[i] > numeros[i + 1]) //Intercambiamos
                {
                    cancer = true;
                    a = numeros[i + 1];//Guardamos el numero en el auxiliar
                    numeros[i + 1] = numeros[i];//Movemos uno para atras el segundo numero
                    numeros [i] = a;//Ponemos el numero guardado
                }
            }
            System.out.println(Arrays.toString(numeros));
        }
    }
    
    public void ordenacionInsercion (int [] numeros)
    {
        for(int i = 1; i < numeros.length; i++)
        {
            int a = numeros[i];
            int j;
            for(j = i - 1; j >= 0 && numeros[j] > a ; j--)
            {
                numeros[j + 1] = numeros[j];
            }
            numeros[j + 1] = a;
        }
    }
    
//    public void shellSort(int numeros[])//Idea 1: (Bucle infinito) Cambiar idea de como hacerlo (Sin terminar)
//    {
//        int a = 0;
//        int b = 2;
//        int j;
//        for(int i = 0; i < numeros.length; i++)
//        {
//            for(j = numeros.length/b; j < numeros.length; j++)
//            {
//                if(numeros[i] == numeros[j])
//                {
//                    a = numeros[i];
//                    numeros[i] = numeros[j];
//                    numeros[j] = a;
//                }
//            }
//            b++;
//            i = 0;
//            j = numeros.length/b;
//        }
//    }
    public void shellSort(int numeros[])
    {
        int i;
        int j;
        for(i = numeros.length/2;i > 0; i = i / 2)
        {
            
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        AlgoritmosOrdenacion ejercicios = new AlgoritmosOrdenacion();
        int [] numeros = {57,22,11,13,21,7};
        //int [] numeros = {7,11,13,21,22,57};
        //ejercicios.ordenacionBurbuja(numeros);
        //ejercicios.ordenacionBurbuja2(numeros);
        //System.out.println(Arrays.toString(numeros));
        //ejercicios.ordenacionInsercion(numeros);
        ejercicios.shellSort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
    
}
