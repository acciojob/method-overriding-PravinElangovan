package com.driver;

public class Main {
  public static class A{
      public String meth(){
          return "Method from class A";
      }
  }
  public static class B extends A{
      public String meth(){
          return "Mehtod is Overridden in class B";
      }
  }
  public static void main(String[] args){

      B b = new B();
      System.out.println(b.meth());
  }
}