package org.demo.core.annotation;

@AnnotationDemoFieldInfo("2.0")
public class DemoClass {
	@AnnotationDemoFieldInfo(name = "Aleksey Kokotov", value = "2.0")
	public void printString() {}

	@AnnotationDemoFieldInfo()
	public void printInt() {}
}
