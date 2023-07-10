public class Dim
{
public static void main(String[] args){
Rectangle r= new Rectangle();
r.l= 5;
r.b=6;
System.out.println( "AREA OF RECT IS:" + r.area());
System.out.println("PERIMETER OF RECT IS:" +r.peri());
Triangle t= new Triangle();
t.a=2;
t.base=3;
t.c=4;
t.h=9;
System.out.println("PERIMETER OF RECT IS:" +t.perimeter());
System.out.println("AREA OF RECT IS:" + t.tlearea());
}
}
class Rectangle{
double l;
double b;
public double area(){
	return l*b;
}
public double peri()
{
return 2*(l+b);
}
}
class Triangle{
double a,base,c,h;
public double tlearea(){
	return base*h;
}
public double perimeter(){
	return a+base+c;
}
}


 