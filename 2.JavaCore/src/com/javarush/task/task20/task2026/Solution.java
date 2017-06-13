package com.javarush.task.task20.task2026;

import java.awt.*;
import java.util.LinkedList;

/*
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        Solution sol = new Solution();
        LinkedList<Rectangle> list = new LinkedList<>();
        for (int y = 0; y < a.length; y++) {
            for (int x = 0; x < a[0].length; x++) {
                Point p1 = sol.findFirstCorner(a, x, y);
                if (p1 != null && !sol.isContains(list, p1)) {
                    Point p2 = sol.findSecondCorner(a, (int) p1.getX(), (int) p1.getY());
                    x = ((int) p2.getX());
                    Point p3 = sol.findThirdCorner(a, (int) p2.getX(), (int) p2.getY());
                    Rectangle rec = sol.createRectangle(p1, p2, p3);
                    list.add(rec);
                }
            }
        }
        return list.size();
    }

    private Point findFirstCorner(byte[][] arr, int x, int y) {
        for (int x1 = x; x1 < arr[0].length; x1++) {
            if (1 == arr[y][x1])
                return new Point(x1, y);
        }
        return null;
    }

    private Point findSecondCorner(byte[][] arr, int x, int y) {
        Point p = new Point(x, y);
        for (int x1 = x; x1 < arr[0].length; x1++) {
            if (0 == arr[y][x1])
                break;
            p.move(x1, y);

        }
        return p;
    }

    private Point findThirdCorner(byte[][] arr, int x, int y) {
        Point p = new Point(x, y);
        for (int y1 = y; y1 < arr.length; y1++) {
            if (0 == arr[y1][x])
                break;
            p.move(x, y1);

        }
        return p;
    }

    private Rectangle createRectangle(Point p, Point pw, Point ph) {
        int width = ((int) (pw.getX() - p.getX()) + 1);
        int height = ((int) (ph.getY() - p.getY()) + 1);
        return new Rectangle(p, new Dimension(width, height));
    }

    private boolean isContains(LinkedList<Rectangle> list, Point p) {
        for (Rectangle rectangle : list) {
            if (rectangle.contains(p))
                return true;
        }
        return false;
    }
}
