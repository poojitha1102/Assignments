package program.jav.test;

abstract class Vehcile {
	abstract void run();
	abstract void stop();
	public void fuel(int i1){
		System.out.println("value of i1:"+i1);
	}
	public void fuel(float f1,String str){
		System.out.println("values of f1:"+f1+"and str:"+str);
	}
	public void fuel(char ch,int i2){
		System.out.println("values of char:"+ch+"and int i2:"+i2);
		
	}
	int speed=60;
	long distance=470;
	public Vehcile(){
	}
	public Vehcile(int speed,long distance){
		this.speed=speed;
		this.distance=distance;
	}

}
class Two_W extends Vehcile{
	void run(){
		System.out.println("run method inside 2W");
		
	}
	void stop(){
		System.out.println("stop method inside 2W");
	}
	Two_W(){
		System.out.println("constructor inside 2W");
	}
	int speed=45;
	long distance=400;
	int nos_of_tyres=2;
	void display(){
		System.out.println("variable of Two_W class are speed:"+speed+"distance:"+distance+"no of tyres:"+nos_of_tyres);
		System.out.println("variables of parent class are speed:"+super.speed+"distance:"+super.distance);
		
		
	}
	
}
class Three_W extends Vehcile{
	void run(){
		System.out.println("run method inside 3W");
		
	}
	void stop(){
		System.out.println("stop method inside 3W");
	}
	Three_W(){
		System.out.println("constructor inside 3W");
	}
	int speed=50;
	long distance=300;
	int nos_of_tyres=3;
	void display(){
		System.out.println("variable of Three_W class are speed:"+speed+"distance:"+distance+"no of tyres:"+nos_of_tyres);
		System.out.println("variables of parent class are speed:"+super.speed+"distance:"+super.distance);
		
		
	}
	
}
class Four_W extends Vehcile{
	void run(){
		System.out.println("run method inside 4W");
		
	}
	void stop(){
		System.out.println("stop method inside 4W");
	}
    Four_W(){
		System.out.println("constructor inside 4W");
	}
	int speed=35;
	long distance=350;
	int nos_of_tyres=4;
	void display(){
		System.out.println("variable of Four_W class are speed:"+speed+"distance:"+distance+"no of tyres:"+nos_of_tyres);
		System.out.println("variables of parent class are speed:"+super.speed+"distance:"+super.distance);
		
		
	}
	
}
class Eight_W extends Vehcile{
	void run(){
		System.out.println("run method inside 8W");
		
	}
	void stop(){
		System.out.println("stop method inside 8W");
	}
	Eight_W(){
		System.out.println("constructor inside 8W");
	}
	int speed=30;
	long distance=300;
	int nos_of_tyres=8;
	void display(){
		System.out.println("variable of Eight_W class are speed:"+speed+"distance:"+distance+"no of tyres:"+nos_of_tyres);
		System.out.println("variables of parent class are speed:"+super.speed+"distance:"+super.distance);
		
		
	}
	
}
public class Assignment_oops{
	public static void main(String[] args){
		Vehcile v;
		v=new Two_W();
		v.run();
		v.stop();
		 
		v=new Three_W();
		v.run();
		v.stop();
		
		v=new Four_W();
		v.run();
		v.stop();
		
		v=new Eight_W();
		v.run();
		v.stop();
		 
		new Two_W().display();
		new Three_W().display();
		new Four_W().display();
		new Eight_W().display();
		
		v.fuel(25);
		v.fuel(100.34f,"poojitha");
		v.fuel('P',20);
		
	}
}
