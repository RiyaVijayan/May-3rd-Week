//acess specifier - default
  
package mypack;  
import pack.*;
  
class Pkdefault
{  
public static void main(String args[])
{  
One obj = new One();//Compile Time Error becuse class is default  
obj.msg();//Compile Time Error  msg() method is default
}  
}  
