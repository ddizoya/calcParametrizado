/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author David
 */
public class Operaciones {
   
    public int suma(int n1, int n2){
        int op; 
        op = n1 + n2;
        return op; 
    } 
 
    public int resta (int n1, int n2){
        int op; 
        op = n1 - n2; 
        return op;
    }
 
    public int multiplicacion(int n1, int n2){
        int op; 
        op = n1 * n2; 
        return op; 
    }
    public int division(int n1, int n2){
        int op; 
        op = n1 / n2;
        return op; 
    }
 
    public boolean isNum(String n){
        int a;
        try{  
            a = Integer.parseInt(n);
            return true; 
        } 
        catch(NumberFormatException e){ 
            return false; 
        }
    }
 
}

