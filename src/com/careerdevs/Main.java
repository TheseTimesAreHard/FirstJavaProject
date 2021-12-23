package com.careerdevs;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(getFirstValue(new int[]{1, 2, 3, 4}));
        System.out.println(addition(7));
        System.out.println(convert(5));
        System.out.println(giveMeSomething("got me fucked up lul"));
        System.out.println(search());
    }
    public static int getFirstValue(int[] arr)
    {
        return arr[0];
    }

    public static int addition(int num)
    {
        return num + 1;
    }

    public static int convert(int minutes) { return minutes * 60;}

    public static String giveMeSomething(String a) {return "something " + a;}

    public static int search(int arr[], int item) {	int index=-1;
        for(int i=0; i < arr.length;i++){
            if(arr[i]==item){
                index = i;
                i+=arr.length+1;
            }
        }
        return index;}

}
