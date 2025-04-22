package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Sqrt class.
 */
public class SqrtTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SqrtTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SqrtTest.class );
    }

    /**
     * Тест 1: Проверка вычисления квадратного корня из 4
     */
    public void testCalcSqrt4()
    {
        Sqrt sqrt = new Sqrt(4.0);
        double result = sqrt.calc();
        assertEquals(2.0, result, 0.0000001);
    }

    /**
     * Тест 2: Проверка вычисления квадратного корня из 9
     */
    public void testCalcSqrt9()
    {
        Sqrt sqrt = new Sqrt(9.0);
        double result = sqrt.calc();
        assertEquals(3.0, result, 0.0000001);
    }

    /**
     * Тест 3: Проверка вычисления квадратного корня из 0
     */
    public void testCalcSqrt0()
    {
        Sqrt sqrt = new Sqrt(0.0);
        double result = sqrt.calc();
        assertEquals(0.0, result, 0.0000001);
    }

    /**
     * Тест 4: Проверка вычисления квадратного корня из 2
     */
    public void testCalcSqrt2()
    {
        Sqrt sqrt = new Sqrt(2.0);
        double result = sqrt.calc();
        assertEquals(Math.sqrt(2.0), result, 0.0000001);
    }

    /**
     * Тест 5: Проверка метода average
     */
    public void testAverage()
    {
        Sqrt sqrt = new Sqrt(1.0);
        double result = sqrt.average(2.0, 4.0);
        assertEquals(3.0, result, 0.0000001);
    }

    /**
     * Тест 6: Проверка метода good с достаточно близким значением
     */
    public void testGoodEnough()
    {
        Sqrt sqrt = new Sqrt(1.0);
        boolean result = sqrt.good(2.0, 4.0);
        assertTrue(result);
    }

    /**
     * Тест 7: Проверка метода good с недостаточно близким значением
     */
    public void testNotGoodEnough()
    {
        Sqrt sqrt = new Sqrt(1.0);
        boolean result = sqrt.good(1.9, 4.0);
        assertFalse(result);
    }

    /**
     * Тест 8: Проверка метода improve
     */
    public void testImprove()
    {
        Sqrt sqrt = new Sqrt(1.0);
        double result = sqrt.improve(2.0, 4.0);
        assertEquals(2.0, result, 0.0000001);
    }

    /**
     * Тест 9: Проверка метода iter для одной итерации
     */
    public void testIterOneIteration()
    {
        Sqrt sqrt = new Sqrt(1.0);
        double result = sqrt.iter(2.0, 4.0);
        assertEquals(2.0, result, 0.0000001);
    }

    /**
     * Тест 10: Проверка вычисления квадратного корня из большого числа
     */
    public void testCalcSqrtBigNumber()
    {
        Sqrt sqrt = new Sqrt(1000000.0);
        double result = sqrt.calc();
        assertEquals(1000.0, result, 0.0000001);
    }

    /**
     * Тест 11: Проверка вычисления квадратного корня из очень маленького числа
     */
    public void testCalcSqrtSmallNumber()
    {
        Sqrt sqrt = new Sqrt(0.0001);
        double result = sqrt.calc();
        assertEquals(0.01, result, 0.0000001);
    }
} 