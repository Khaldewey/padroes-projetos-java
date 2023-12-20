package com.example;

/**
 * Singleton Apressado
 * 
 * @author is-rael
 */

public class SingletonEager {
  private static SingletonEager instancia = new SingletonEager();

  private SingletonEager() {
    super();
  }

  public static SingletonEager getInstancia() {

    return instancia;
  }
}
