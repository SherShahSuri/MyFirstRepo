package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DemoAnnotation {
	@MyAnnotations(value1 = 10, name = "MyDemo", demo_default = "new Value")
	public void display() {

		System.out.println("using my annotation in this function");
	}

	public static void main(String[] args) {
		DemoAnnotation test = new DemoAnnotation();
		Class class1 = test.getClass();
		Method[] methods = class1.getMethods();
		for (Method method : methods) {
			Annotation[] annotations = method.getAnnotations();
			for (Annotation anno : annotations) {
				if (anno.annotationType().equals(MyAnnotations.class)) {
					MyAnnotations m = (MyAnnotations) anno;
					int value = m.value1();
					String name = m.name();
					System.out.println(value + "\t" + name);
				}
			}
		}
	}
}