package com.pes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
public static void main(String[] args)
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("pes.xml");
	System.out.println("Spring container ready ");
	//A a=(A) ctx.getBean("aobj");
    //A b=(A) ctx.getBean("aobj");
	//B c=(B) ctx.getBean("bobj");
	//	//Hello h=(Hello) ctx.getBean("Helloobj");
	//System.out.println(a==b);	
	//a.show();
	//c.show();
	//h.show();
	}
	
} 