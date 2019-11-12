package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class AppTeste {

    @Test
    public void mustReturn5() {
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.soma(2, 3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturn10() {
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.soma(11, -1);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturn2() {
        Application application = new Application();
        Integer expected = 2;
        Integer response = application.subtracao(5, 3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturn18() {
        Application application = new Application();
        Integer expected = 18;
        Integer response = application.subtracao(9, -9);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturnNeg6() {
        Application application = new Application();
        Integer expected = -6;
        Integer response = application.multiplicacao(2, -3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturn6() {
        Application application = new Application();
        Integer expected = 6;
        Integer response = application.multiplicacao(2, 3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturnNeg3() {
        Application application = new Application();
        Integer expected = -3;
        Integer response = application.divisao(9, -3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturn3() {
        Application application = new Application();
        Integer expected = 3;
        Integer response = application.divisao(9, 3);
        Assert.assertEquals(expected, response);
    }


    @Test
    public void mustReturnFalse() {
        Application application = new Application();
        Boolean expected = false;
        Boolean response = application.par(9);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturnTrue() {
        Application application = new Application();
        Boolean expected = true;
        Boolean response = application.par(8);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturnBigest() {
        Application application = new Application();
        Integer expected = 11;
        Integer response = application.maior(11, 8);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturn56() {
        Application application = new Application();
        Integer expected = 56;
        Integer response = application.maior(-101, 56);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturn5impar() {
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.nImpares(11);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturn1impar() {
        Application application = new Application();
        Integer expected = 1;
        Integer response = application.nImpares(2);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturnJAVA() {
        Application application = new Application();
        String expected = "JAVA";
        String response = application.maiusculo("java");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturnFUNCIONA() {
        Application application = new Application();
        String expected = "FUNCIONA";
        String response = application.maiusculo("FuNcIoNa");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturntadeboa() {
        Application application = new Application();
        String expected = "ta de boa";
        String response = application.minusculo("Ta de boA");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mustReturnacabandoisso() {
        Application application = new Application();
        String expected = "acabando isso";
        String response = application.minusculo("ACABAndo ISso");
        Assert.assertEquals(expected, response);
    }
}