package com.hyperskilldev.pseudocode;

public class arrays {
    public static void main(String[] args) {
        int[] a = {4, 0, 9, 2, 1};
        int[] b = {6, 3, 2, 9, 0};
        for (int i = 0; i<a.length;i++){
            if (i%2==0){
                a[i] -= b[i];
            } else {
                b[i] -= a[i];
            }
            if (a[i]%2==0){
                a[i] +=1;
                b[i] +=1;
            }
        }

        for (int i =0; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        for (int i =0; i<b.length;i++){
            System.out.print(b[i]+ " ");
        }
        System.out.println("----------------------------------");

        int[] c = {9, 8, 3, 1, 5, 4};
        for (int i =0; i<c.length;i++){
            if (c[i]%2==0){
                c[i] +=1;
            } else if (c[i]<c.length){
                c[i] += c[c[i]];
            }
        }
        for (int i =0; i<c.length;i++){
            System.out.print(c[i]+ " ");
        }
    }
}
