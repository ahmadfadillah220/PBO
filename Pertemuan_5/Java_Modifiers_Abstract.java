package com.pboreg;

 abstract class Person {
    public String fname = "John";
    public int age= 24;
    public abstract void study();
}

class Student extends Person{
     public int graduationYear = 2018;
     public void study(){
         System.out.println("Study all day long");
     }
}

class Java_Modifiers_Abstract{
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Name "+ myObj.fname);
        System.out.println("Age"+ myObj.age);
        System.out.println("Graduation Year "+ myObj.graduationYear);
        myObj.study();

    }


}