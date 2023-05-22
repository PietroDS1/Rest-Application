package br.com.pietro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.pietro.exceptions.UnssuportedMathOperationException;
import br.com.pietro.model.Operation;
import br.com.pietro.service.CalculatorService;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

	 private final CalculatorService calculatorService;

	    public CalculatorController(CalculatorService calculatorService) {
	        this.calculatorService = calculatorService;
	    }

	    @GetMapping("/add")
	    public double add(@RequestParam double operand1, @RequestParam double operand2) {
	        return calculatorService.add(operand1, operand2);
	    }

	    @GetMapping("/subtract")
	    public double subtract(@RequestParam double operand1, @RequestParam double operand2) {
	        return calculatorService.subtract(operand1, operand2);
	    }

	    @GetMapping("/multiply")
	    public double multiply(@RequestParam double operand1, @RequestParam double operand2) {
	        return calculatorService.multiply(operand1, operand2);
	    }

	    @GetMapping("/divide")
	    public double divide(@RequestParam double operand1, @RequestParam double operand2) {
	        return calculatorService.divide(operand1, operand2);
	    }
}
