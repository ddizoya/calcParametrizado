/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Operaciones;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

/**
 *
 * @author David
 */
@RunWith(Parameterized.class)
public class OperacionesTest {

    private int input;
    private int input2;
    private int esperado;
    private Operaciones op;

    public OperacionesTest(int input, int input2, int esperado) {
        this.input = input;
        this.input2 = input2;
        this.esperado = esperado;
    }

    @Before
    public void inicializar() {
        op = new Operaciones();
    }

    @Parameterized.Parameters
    public static Collection suma() {
        return Arrays.asList(new Object[][]{
            {6, 6, 12},
            {8, 9, 17},
            {20, 7, 27},
            {43, 7, 50}
        });
    }

    @Test
    public void testeoSuma() {
        System.out.println("Número parametrizado es: " + input + ", " + input2 + ". El valor esperado es :" + esperado);
        assertEquals(esperado, op.suma(input, input2));
    }

}
