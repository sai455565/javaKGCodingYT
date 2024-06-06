package org.example.controlflow;

public class Switch {
    public static void main(String[] args) {
        //new version of spring
        int swithValue = 4;
        switch (swithValue){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3,4,5 -> System.out.println("Value was 3");

            default ->  System.out.println("Value was  4");
            }
    }
}
