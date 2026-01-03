/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author massk
 */
public class Test {

    public static void main(String[] args) {
        
        int age;
        long annee;
        
        String nom;
        List<String> nomList = new ArrayList<>();
        
        Voiture maVoiture = new Voiture("mercedes","benz");
        Voiture maVoiture2 = new Voiture("ferrari","208");
        
        System.out.println(maVoiture);
        System.out.println(maVoiture2);
        
    }
}