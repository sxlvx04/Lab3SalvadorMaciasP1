package com.mycompany.lab3progra1salvadormacias;

import java.util.Scanner;

public class Lab3progra1salvadormacias {

    public static void main(String[] args) {
        Scanner goku = new Scanner(System.in);
        System.out.println("Bienvenido al menu!");
        System.out.println("1. Cadena repetida ");
        System.out.println("2. Sumatoria ");
        System.out.println("3. Reloj ");
        int opcion = goku.nextInt();
        do {
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un texto sin espacios y que separe palabras haciendo uso de puntos: ");
                    String texto = goku.next();

                case 2:
                    System.out.println("Ingrese un numero : ");
                    int limite = goku.nextInt();
                    float acum1=0;
                    float acum2=0;                 
                    float acum3=0;
                    if(limite>0){
                        for(int n=1; n<=limite; n++){
                            acum1= (n*2)+1;                      
                            acum2= (n*n)+3;         
                            int fact=1;  
                            for(int i=1; i<=acum2; i++){
                            fact= fact*i;                                
                            }
                            acum3+= (acum1/fact);                                    
                    }
                        System.out.println("El resultado de la sumatoria es: "+acum3);
                        
                    }else{
                        System.out.println("Numero no valido");
                    }
                case 3:
                    System.out.println("Ingrese un numero que sea impar:");
                    int num = goku.nextInt();
                    for (int alt = 0; alt < num; alt++) {
                        System.out.print(" * ");
                    }
                    for (int i = 0; i < num - 1; i++) {
                        System.out.println("");
                        for (int j = 0; j <= num; j++) {
                            if (num - i == j) {
                                System.out.print("  *  ");
                            }
                        }
                    }
            }
          default: System.out.println("Opcion ingresada no es valida");
        
               
    }while(opcion!=0);
        
        }

    }
    
