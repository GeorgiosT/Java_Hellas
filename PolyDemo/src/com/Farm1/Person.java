package com.Farm1;

public class Person implements Describable {
String description;

public Person(String name){
	description="This is "+ name ;
}


public String getDescription(){
	return description;
}
}
