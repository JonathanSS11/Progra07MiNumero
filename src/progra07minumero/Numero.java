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
public class Numero {
    
    private int numero;
    int factorial = 1;
    int num = 5;
    
    public Numero(int numero) {
        this.numero = numero;
    }
    
    public Numero() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    void cambiarNumero(int num) {
        numero = num;
    }
    
    void sumaNumero(int num) {
        numero = numero + num;
    }
    
    void restaNumero(int num) {
        numero = numero - num;
    }
    
    public int getDoble() {
        return numero * 2;
    }
    
    public int getTriple() {
        return numero * 3;
    }
    
    public int getCuadruple() {
        return numero * 4;
    }
    
    public int getCuadrado() {
        return (int) Math.pow(numero, 2);
    }
    
    public int getCubo() {
        return (int) Math.pow(numero, 3);
    }
    
    public int getFactorial() {
        while (numero>1){
            factorial = factorial * numero;
            numero = numero - 1;
        }
        return factorial;
    }
}

    
    

    
    
       