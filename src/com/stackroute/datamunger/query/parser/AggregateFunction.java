package com.stackroute.datamunger.query.parser;

/* This class is used for storing name of field, aggregate function for 
 * each aggregate function
 * generate getter and setter for this class,
 * Also override toString method
 * */

public class AggregateFunction {

	private String feild,function;

	public String getFeild() {
		return feild;
	}

	public void setFeild(String feild) {
		this.feild = feild;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	// Write logic for constructor
	public AggregateFunction(String field, String function) {
		this.feild=feild;
		this.function=function;

	}
	public String getAggregateFunction() {
		return this.toString();
	}
	public void setAggregateFunction(String field, String aggFunction) {
		this.feild = field;
		this.function = aggFunction;
	}
	public String toString() {
		return this.feild +""+ this.function;
	}

}