package br.com.pietro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.pietro.model.Operation;

@Service
public class CalculatorService {

	 public double add(double operand1, double operand2) {
	        return operand1 + operand2;
	    }

	    public double subtract(double operand1, double operand2) {
	        return operand1 - operand2;
	    }

	    public double multiply(double operand1, double operand2) {
	        return operand1 * operand2;
	    }

	    public double divide(double operand1, double operand2) {
	        if (operand2 != 0) {
	            return operand1 / operand2;
	        } else {
	            throw new IllegalArgumentException("Divisão por zero não é permitida.");
	        }
	    }
}
