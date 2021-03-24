package com.nombremystere;
import java.util.*;
 														
public class TabGen
{
    public static  void main(String args[])
    {
        ArrayList <Integer> tab = new ArrayList <Integer> (4);
        int length = 0;
 
        while (length < 4)
        {
            int n = (int) (Math.random() * 10);
            
            tab.add(n);
            length += 1;
        }
 
        for (int i=0; i<4; i++)
        	System.out.print(tab.get(i));
    }
}
