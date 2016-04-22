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
public class Oefening701 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persoon vriendin;
       // vriendin = new Persoon( "Ana",  new Datum( 18, 7, 1988 ) );
  	//System.out.println( vriendin );
    }
 public class Datum {
  private int dag, maand, jaar;

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

 public class Persoon {
  private String naam;
  private Datum gebdatum;
  
  public Persoon( String naam, Datum gebdatum ) {
    this.naam = naam;
    this.gebdatum = gebdatum;
     }
  
  public String getNaam() {
    return naam;
    }

  public void setNaam( String naam ) {
    this.naam = naam;
    }
  
  public Datum getGebdatum() {
    return gebdatum;
    }
  
  //@Override
  public String toString() {
    return naam + ", geboren op " + gebdatum.toString();
    }

 }

}


