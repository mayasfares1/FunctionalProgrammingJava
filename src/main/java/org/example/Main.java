package org.example;

import java.util.Arrays;

import static java.util.Locale.filter;

public class Main {

    public static int[] map(int[] a, MyTransformingType op){

        int[] b = new int[a.length];

        int index = 0;

        for(int i = 0; i < a.length;i++)
        {
            b[i] = op.apply(a[i]);


        }
        return b;
    }

    public static int [] filter(int[] a,MyValidatingType op){

        int[] b = new int[a.length];
        int i = 0;
        for(int j : a) {
            if(op.validate(j)) {
                b[i++] = j;
            }
        }
        return b;
    }

    public static void main(String[] args) {

    int [] a = {1,2,3,4,5};

    int[] add = map(a,x -> x+1);

    int[] isEven = filter(a,x->x % 2 == 0);

        System.out.println(Arrays.toString(add));
        System.out.println(Arrays.toString(isEven));

    }
}