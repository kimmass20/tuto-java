/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author massk
 */
public class   Vehicule {
    
    public String marque;
    public String modele;
    public int annee;
    public String type;
    public Vehicule(String marque){
        this.marque = marque;
    }
    public void demarrer (){
        System.out.println ("le vehicule demarre");
    }
}
