public class StringOperation{  
	
public static void main(String args[]){  
	
String s1="Java String pool refers to collection of String which are stored in heap memory";  

String s1lower=s1.toLowerCase();  
System.out.println(s1lower); 

String s1upper=s1.toUpperCase(); 
System.out.println(s1upper);

String s1replace=s1.replace("a","$");  
System.out.println(s1replace);  

System.out.println(s1.contains("collection"));  

System.out.println(s1.equals(s1));



}}  