package br.com.pietro;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.pietro.exceptions.UnssuportedMathOperationException;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();//mockando ID
	
	@RequestMapping(value ="/soma/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double soma(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!isNumeric(numberOne)||!isNumeric(numberTwo)) {
			throw new UnssuportedMathOperationException("Please Set A Numeric Value!");
		}
		
		return converToDouble(numberOne) + converToDouble(numberTwo);
		
	}
	@RequestMapping(value ="/subtracao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtracao(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!isNumeric(numberOne)||!isNumeric(numberTwo)) {
			throw new UnssuportedMathOperationException("Please Set A Numeric Value!");
		}
		
		return converToDouble(numberOne) - converToDouble(numberTwo);
		
	}
	@RequestMapping(value ="/multiplicacao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplicacao(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!isNumeric(numberOne)||!isNumeric(numberTwo)) {
			throw new UnssuportedMathOperationException("Please Set A Numeric Value!");
		}
		
		return converToDouble(numberOne) * converToDouble(numberTwo);
		
	}
	@RequestMapping(value ="/divisao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double divisao(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!isNumeric(numberOne)||!isNumeric(numberTwo)) {
			throw new UnssuportedMathOperationException("Please Set A Numeric Value!");
		}
		
		return converToDouble(numberOne) / converToDouble(numberTwo);
		
	}
	@RequestMapping(value ="/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double media(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!isNumeric(numberOne)||!isNumeric(numberTwo)) {
			throw new UnssuportedMathOperationException("Please Set A Numeric Value!");
		}
		
		return (converToDouble(numberOne) + converToDouble(numberTwo))/2.0;
		
	}
	@RequestMapping(value ="/raizquadrada/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double raiz(@PathVariable(value = "numberOne") String numberOne, String numberTwo) throws Exception {
		
		if(!isNumeric(numberOne)||!isNumeric(numberTwo)) {
			throw new UnssuportedMathOperationException("Please Set A Numeric Value!");
		}
		
		return converToDouble(numberOne)/2.0;
		
	}
	

	private Double converToDouble(String strNumber) {
		
		if(strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
		
	}

	private Boolean isNumeric(String strNumber) {
		// TODO Auto-generated method stub
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
