package br.com.pietro.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@EntityScan
@Table(name = "operations")
public class OperationEntity {

	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private double operand1;
	    private double operand2;
	    private double result;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
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
	
}
