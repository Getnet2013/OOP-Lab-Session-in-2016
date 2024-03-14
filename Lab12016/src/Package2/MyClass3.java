/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Package2;

import Package1.MyClass1;

public class MyClass3 {
  public static void main(String []args)
    {
        //we can access the public  values that declared in Class1
       MyClass1 c1=new MyClass1();
       System.out.println("The value of Num1 in MyClass1="+c1.num1);
        System.out.println("The value of Num1 in MyClass1="+c1.Name);
    }
}
/*lets access this data on class2 and calss 3*/
