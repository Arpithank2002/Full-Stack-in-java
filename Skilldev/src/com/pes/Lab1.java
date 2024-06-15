package com.pes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Lab1 {
public static void main(String[] args)
{
	ApplicationContext cxt=new ClassPathXmlApplicationContext("pes.xml");
	
	System.out.println("Springboot container ready ");
}
}