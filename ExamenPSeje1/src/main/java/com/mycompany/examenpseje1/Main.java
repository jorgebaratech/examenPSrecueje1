/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpseje1;

/**
 *
 * @author norri
 */
public class Main {
  public static void main(String[] args) {
  
    Thread tortoiseThread = new Thread(new Tortoise());
    Thread rabbitThread = new Thread(new Rabbit());

   
    tortoiseThread.start();
    rabbitThread.start();
  }
}

class Tortoise implements Runnable {
  @Override
  public void run() {
   
    int distance = -1;
    while (distance < 10) { 
      distance += 1;
      System.out.println("Tortuga: " + distance + " metros");  
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        
      }
    }
  }
}

class Rabbit implements Runnable {
  @Override
  public void run() {
   
    int distance = -1;
    while (distance < 10) {
      distance += 1;
      System.out.println("Conejo: " + distance + " metros");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        
      }
    }
  }
}

//ESTA ES EL EJERCICIO 1 B)
// Creamos un objeto Thread y le pasamos como argumento el objeto Runnable de la tortuga
//Thread tortoiseThread = new Thread(tortoise);
//
//// Iniciamos la hebra de la tortuga
//tortoiseThread.start();
//
// Hacemos que la hebra del conejo se bloquee hasta que la hebra de la tortuga haya finalizado su ejecución
//rabbitThread.join(tortoiseThread);
//
// Iniciamos la hebra del conejo
//rabbitThread.start();