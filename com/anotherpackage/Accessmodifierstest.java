//Access modifiers are three types
//1.Public-- "public"
//2.Private-- "private"
//3.Protected-- "protected"
//before using the class and its variables or methods in another package we should see if the class is defined public or not
//By default if we not put access modifier key before the class then it is accessed only in the package but not in another package
//By using "public" we can use method or class or variables in other packages by importing
//By using "private" we can use the variable or class or method in the program or its respective and cannot use outside
//By using "protected" 	can be used when it comes to the variables the variable can be used only in the package but outside<--
//-->the package the variable cannot be accessible
//The difference of "protected" and "by default" is using protected we can extend its use in another packages provided
//The class using the protected variable should be the subclass that is it should import the original package of protected 
//variable and should extend the original class that contains the protected variable.


package com.anotherpackage;

public class Accessmodifierstest 
{
	int age = 44;
	public int test_publicvariable = 24;
	private int test_privatevariable= 32;
	protected int test_protectedvariable= 41;
}
