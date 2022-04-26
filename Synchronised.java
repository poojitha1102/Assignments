package program.jav.test;


class P1 {
	synchronized public void factorial(int num)                     
	{
		int fact=1;
		
		for(int i=1;i<=num;i++){    
		      fact=fact*i;  
		}
		  System.out.println("Factorial of "+num+" is: "+fact);  
            try
			{
				Thread.sleep(400);   //0.4 secs
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
            try{
            	Thread.sleep(400);
            }catch(Exception e){
            	System.out.println(e);
            }
	}
}
class MyThread1 extends Thread{
	P1 p1;
	MyThread1(P1 p1){
		this.p1=p1;
	}
	public void run(){  
		System.out.println("Into the Add run() method");
		p1.factorial(4);  
	} 
}
class MyThread2 extends Thread{
	P1 p1;
	MyThread2(P1 p1){
		this.p1=p1;
	}
	public void run(){  
		System.out.println("Into the Add run() method");
		p1.factorial(6);  
	} 
}
	

class P2
{
	synchronized public void getadd(int num1,int num2)
	{
		System.out.println("addition of two numbers"+(num1+num2));
	}
}
class MyThread3 extends Thread{
	P2 p2;
    MyThread3(P2 p2)
    {
	this.p2=p2;
    }
    public void run()
    {  
		System.out.println("Into the Add run() method");
		p2.getadd(4,5);  
	}  
}
class MyThread4 extends Thread{
	P2 p2;
    MyThread4(P2 p2){
	this.p2=p2;
}
    public void run(){  
		System.out.println("Into the Add run() method");
		p2.getadd(20,10);  
	}  
}
public class Synchronised
{
	public static void main(String[] args)
	{
		// Object of Line class that is shared among the threads.
		P1 obj = new P1();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		P2 obj1=new P2();
		MyThread3 t3=new MyThread3(obj1);
		MyThread4 t4=new MyThread4(obj1);
		t2.start();
		t4.start();
		t1.start();
		t3.start();
		
		
	}
}

