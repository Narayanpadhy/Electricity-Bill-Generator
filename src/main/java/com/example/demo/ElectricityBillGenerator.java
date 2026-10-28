package com.example.demo;

public class ElectricityBillGenerator 
{
	int unitsConsumed;
	double ratePerUnit;
	
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public double generateBill()
	{
		double bill;
		return bill = unitsConsumed * ratePerUnit;
	}
	
	
}
