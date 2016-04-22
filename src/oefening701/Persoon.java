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