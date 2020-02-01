package com.example.android.simplecalc;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class CalculatorViewModel extends ViewModel {
    private static final String TAG = "CalculatorViewModel";

    private String operandOne = "";
    private String operandTwo = "";
    private Calculator calc;

    public CalculatorViewModel() {
        calc = new Calculator();
    }

    public void setOperandOne(String operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(String operandTwo) {
        this.operandTwo = operandTwo;
    }

    public String compute(Calculator.Operator operator) {
        Log.d("TAG", operator + " " + operandOne + ", " + operandTwo);
        double opOne;
        double opTwo;
        try {
            opOne = Double.valueOf(operandOne);
            opTwo = Double.valueOf(operandTwo);
        } catch (NumberFormatException nfe) {
            Log.e(TAG, "NumberFormatException", nfe);
            throw nfe;
        }

        String result;
        switch (operator) {
            case ADD:
                result = String.valueOf(
                        calc.add(opOne, opTwo));
                break;
            case SUB:
                result = String.valueOf(
                        calc.sub(opOne, opTwo));
                break;
            case DIV:
                result = String.valueOf(
                        calc.div(opOne, opTwo));
                break;
            case MUL:
                result = String.valueOf(
                        calc.mul(opOne, opTwo));
                break;
            default:
                throw new IllegalArgumentException("Unsupported operation.");
        }
        return result;
    }
}