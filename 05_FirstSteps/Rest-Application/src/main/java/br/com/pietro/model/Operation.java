package br.com.pietro.model;

import java.io.Serializable;
import java.util.Objects;

public class Operation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private double operand1;
    private double operand2;
    private double result;
	public double getOperand1() {
		return operand1;
	}
	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}
	public double getOperand2() {
		return operand2;
	}
	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
