package com.javarush.task.task13.task1309;

/* 
Всё, что движется
*/

public class Solution {
    interface CanMove{
        public Double speed();
    }
    interface CanFly extends CanMove{
        public Double speed(CanFly canFly);
    }

    public static void main(String[] args) throws Exception {
    }
}