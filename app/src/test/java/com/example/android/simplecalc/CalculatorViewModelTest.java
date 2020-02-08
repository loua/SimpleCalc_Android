package com.example.android.simplecalc;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorViewModelTest {

    @Test
    public void computeAdd() {
        CalculatorViewModel cvm = new CalculatorViewModel();

        cvm.setOperandOne("3");
        cvm.setOperandTwo("4");
        String result = cvm.compute(Calculator.Operator.ADD);

        assertThat(result, is("7.0"));
    }
}