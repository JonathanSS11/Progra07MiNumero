/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra07minumero;

/**
 *
 * @author HP
 */
public class Progra07MiNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        
        Numero minumero001 = new Numero(10);
        Numero miNumero002 = new Numero();
        
        minumero001.cambiarNumero(5);
        minumero001.sumaNumero(2);
        minumero001.restaNumero(1);
        minumero001.getDoble();
        minumero001.getTriple();
        minumero001.getCuadruple();
        minumero001.getCuadrado();
        minumero001.getCubo();
        minumero001.getFactorial();
       
    
        System.out.println(minumero001.getNumero());
        System.out.println(minumero001.getDoble());
        System.out.println(minumero001.getTriple());
        System.out.println(minumero001.getCuadruple());
        System.out.println(minumero001.getCuadrado());
        System.out.println(minumero001.getCubo());
        System.out.println(minumero001.getFactorial());
    }
      
}
         