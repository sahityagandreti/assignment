class clock{
public static void main(String[] args)
{
Time t= new Time();
t.setHours(9);
t.setMinutes(59);
t.setSeconds(59);
System.out.println(t.getHours() + ":" + t.getMinutes() + ":" + t.getSeconds()
);
System.out.println(t.incrh());
System.out.println(t.incrm());
System.out.println(t.incrs());
}
}
class Time{
private int hrs,mins,sec;
private int validatehours(int hrs)
{
return hrs>0 && hrs<23 ? hrs:100%24;
}
private int validateminutes(int mins)
{
return mins>0 && mins<59 ? mins:100%59;
}

private int validateseconds(int sec)
{
return sec>0 && sec<59 ? sec:100%59;
}


public void setHours(int x){
this.hrs=x;
}
public int getHours(){
return hrs;
}



public void setMinutes(int y){
this.mins=y;
}
public int getMinutes(){
return mins;
}
public void setSeconds(int z){
this.sec=z;
}
public int getSeconds(){
return sec;
}
public int incrh(){
hrs++;
if(hrs==24)
{
hrs=0;
}
return hrs;
}
public int incrm(){
mins++;
if(mins==60)
{
mins=0;
hrs=hrs+1;
}
return mins;
}
public int incrs(){
sec++;
if(sec==60)
{
sec=0;
mins=mins+1;
}
return sec;
}
}
