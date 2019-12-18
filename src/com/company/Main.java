package com.company;

public class Main {

    public static void main(String[] args) {
	    Figure triangle = new Figure(4);
        try {
            triangle.setCoord(0,0,0);
            triangle.setCoord(1,2,3);
            triangle.setCoord(2,3,4);
            triangle.setCoord(3,31,41);
        } catch (IndexPointException e) {
            e.printStackTrace();
        }


    }
}
