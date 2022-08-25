package Generics;

public class GenericExampleDemo {

	class Student{
		   Integer age;
		   Student(Integer age){
		      this.age = age;
		   }
		   public void display() {
		      System.out.println("Value of age: "+this.age);
		   }
		}
		public class GenericsExampleDemo {
		   public static void main(String args[]) {
		      Student std = new Student(25);
		      std.display();
		   }
		}

}
