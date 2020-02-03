package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }
    interface CanRun{
        public void Run();
    }
    interface CanSwim{
        public void Swim();
    }
    public abstract class Human implements CanRun, CanSwim{

    }
}
