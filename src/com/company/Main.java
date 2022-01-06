package com.company;

public class Main {

    public static void main(String[] args) {
        String [] lang = {"java", "js", "php", "python"};
        System.out.println("Original array:  ");
        for (int i = 0; i < lang.length; i++) {
            System.out.print(lang[i] + "  ");
        }
        System.out.println();
        String [] newArr1 = removeElement(lang,1);
        System.out.println("Array after removing:  ");
        for (String element: newArr1
             ) {
            System.out.print(element + "  ");
        }
        System.out.println();
        String [] newArr2 = addElement(lang,2,"ruby");
        System.out.println("Array after adding:  ");
        for (String element: newArr2
             ) {
            System.out.print(element + "  ");
        }

    }
    public static String[] removeElement(String[] arr, int index) {
        String [] newArray = new String[arr.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if(i < index){
                newArray[i] = arr[i];
            } else {
                newArray[i] = arr[i+1];
            }
        }
        return newArray;
    }

    public static String[] addElement(String[] arr, int index, String newElement) {
        String [] newArray = new String[arr.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if(i < index){
                newArray[i] = arr[i];
            } else if(i == index){
                newArray[i] = newElement;
            } else {
                newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }
}
