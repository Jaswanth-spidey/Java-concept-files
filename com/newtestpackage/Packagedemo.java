//Package contains classes and they can be accessed in another packages by importing and the package contain--
//Access modifiers are three types
//1.Public-- "public"
//2.Private-- "private"
//3.Protected-- "protected"
package com.newtestpackage;

import com.anotherpackage.Accessmodifierstest;

public class Packagedemo 
{

	public static void main(String[] args)
	{
		Accessmodifierstest obj = new Accessmodifierstest();
		obj.test_publicvariable=32;
		obj.test_privatevariable =43;
		obj.test_protectedvariable =37;
		obj.age=43;
	}

}
