package com.stackroute.datamunger.query.parser;

import java.util.ArrayList;
import java.util.List;

/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */

public class QueryParameter {
	String value;
	String file;
	ArrayList<String> list;
	ArrayList<String> list1;
	ArrayList<String> feilds;
	ArrayList<AggregateFunction> function;

	public String getFileName() {
		return file;
	}
	public void setFileName(String file){
		this.file=file;
	}


	public String getBaseQuery() {
		return value;
	}
	public void setBaseQuery(String value){
		 this.value=value;

	}

	public List<Restriction> getRestrictions() {
		return null;
	}

	public List<String> getLogicalOperators() {
		return null;
	}

	public List<String> getFields() {
		return feilds;
	}
	public void setFeilds(ArrayList<String> feilds){
		this.feilds=feilds;

	}

	public List<AggregateFunction> getAggregateFunctions() {
		return function;
	}
	public void setAggregateFunctions(ArrayList<AggregateFunction> function){
		this.function=function;
	}

	public List<String> getGroupByFields() {
		return list1;
	}
	public void  setGroupByFeilds(ArrayList<String> list1){
		this.list1=list1;
	}

	public List<String> getOrderByFields() {
		return list;
	}
	public void setOrderByFeilds(ArrayList<String> list){
		this.list=list;
	}
}