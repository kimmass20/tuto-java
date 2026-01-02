/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author massk
 */

public class Voiture extends Vehicule{
    public Voiture(String marque , String modele){
        this.marque = marque;
        this.modele = modele;
    }
    @Override
    public String toString(){
        return "-> " +this.marque + "," + this.modele;
    }
}
