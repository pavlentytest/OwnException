package com.company;

public class Figure {
    private Point[] points;// null

    Figure(int n) {
        points = new Point[n];
        for(int i=0;i<n;i++) {
            points[i] = new Point();
        }
    }
    public void setCoord(int n, int x, int y)
    throws IndexPointException {
        if (n >= 0 && n < points.length) {
            points[n].setCoord(x, y);
        } else {
            throw new IndexPointException("Bad!");
        }
    }
}
class IndexPointException extends Exception {
    public IndexPointException(String message) {
        super(message);
    }
}
