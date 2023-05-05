package day10;

public class StringExample {

	public static void main(String[] args) {

String k= "welcome"; //Stored string pool 
String k1= "welcome";// access refer same address  created in line 7

//strings are immutable mean value cannot be changed

k="hello"; // this will not replace above assignment but will create new memory location 


String e= new String ("testing");

//wap to store 5 names in string 

String m1[]= {"amit","neha","gagan"};

//second  way
String m[]= new String[5];
m[0]= new String ("amit");
m[1]= new String("neha");
m[2]= "kamal";
//m[3]= s.next();

	}

}
