/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author florab
 */
public class panierVideException extends Exception {
    public panierVideException(){
        System.out.println("Le panier est vide!!");
    }
}
