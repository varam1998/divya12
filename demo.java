import java.io.*;
import java.util.*;
class Sample
{ 
void display()
{
    for(int i=5; i>=1; i--)
    {
        for(int j=5; j>i; j--)
        {
            System.out.print(j);
        }
        for(int j=1; j<=(i*2-1); j++)
        {
            System.out.print(i);
        }
        for(int j=i+1; j<=5; j++)
        {
            System.out.print(j);
        }
            System.out.println("\n");
    }
    for(int i=1; i<5; i++)
    {
        for(int j=5; j>i; j--)
        {
            System.out.print(j);
        }
        for(int j=1; j<=(i*2-1); j++)
        {
            System.out.print(i+1);
        }
        for(int j=i+1; j<=5; j++)
        {
            System.out.print(j);
        }
            System.out.println("\n");        
    }
}
}
class demo
{
public static void main(String args[])
{
Sample s=new Sample();
s.display();
}
}


 

