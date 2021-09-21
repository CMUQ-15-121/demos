/**
 * This file is maintained by Bob
 */
package com.badcompany.widgetfactory;

import edu.cmu.qatar._15121.week4.Person;

public class RandomJunk {

	public static void main(String[] args) {
		Person p = new Person("Ahmed", "Ali", 3, 13, 2003);
		//p.setBirthMonth(10);
		p.setBirthDate(10, p.getBirthDay(), p.getBirthYear());
		p.setBirthDate(2, 29, 2397);
		System.out.println(p);
	}
}
