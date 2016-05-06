/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefening701;

/**
 *
 * @author Matthijs
 */
public class Datum {
    private int dag, maand, jaar;   
    private int decenium;
    
  public Datum( int dag, int maand, int jaar ) {
    this.dag = dag;
    this.maand = maand;
    this.jaar = jaar;
    
    }
  
  //@Override
  public String toString() {
    return dag + "-" + maand + "-" + jaar;
    
    }
 
 }  
