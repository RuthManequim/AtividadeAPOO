/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author rocha
 */
public class Principal {
     public static void main(String[] args) {
     Cachorro cachorro = new Cachorro();
     Cavalo cavalo = new Cavalo();
     Preguica preguica = new Preguica();
     Veterinaria veterinaria = new Veterinaria();
     
     veterinaria.examinar(cachorro);
     veterinaria.examinar(cavalo);
     veterinaria.examinar(preguica);
     }
    }
