package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BillGenerate
{
	public static void main(String[] args)
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("New.xml");
		ElectricityBillGenerator bean = ac.getBean(ElectricityBillGenerator.class);
		double bill = bean.generateBill();
		System.out.println("total electricity bill :"+bill);
		
	}

}
