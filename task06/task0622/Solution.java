package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] j = new int[5];

        for (int i=0; i< 5;i++)
        {

            j[i] = Integer.parseInt(reader.readLine());
        }
        for (int i=0;i<j.length-1;i++)
        {
            for(int a=0;a<j.length-1;a++)
            {
                if(j[a+1]<j[a])
                {
                    int temp=j[a];
                    j[a]=j[a+1];
                    j[a+1]=temp;
                }
            }

        }
        for(int i=0;i<5;i++)
        {
            System.out.println(j[i]);
        }
    }
}
