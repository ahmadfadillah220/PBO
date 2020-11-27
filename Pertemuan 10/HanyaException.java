package com.pboreg;

public class HanyaException {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
