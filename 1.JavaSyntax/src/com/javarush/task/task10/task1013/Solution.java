package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int weight;
        private int heigth;
        private char sex;
        private String nationality;
       public Human(int age){
            this.age=age;
            this.weight=0;
            this.heigth=0;
            this.sex='m';
            this.nationality="Russian";
        }
        public Human(int age,int weight){
            this.age=age;
            this.weight=weight;
            this.heigth=0;
            this.sex='m';
            this.nationality="Russian";
        }
        public Human(int age,int weight,int heigth){
            this.age=age;
            this.weight=weight;
            this.heigth=heigth;
            this.sex='m';
            this.nationality="Russian";
        }
        public Human(int age,int weight,int heigth, char sex){
            this.age=age;
            this.weight=weight;
            this.heigth=heigth;
            this.sex='m';
            this.nationality="Russian";
        }
        public Human(int age,int weight,int heigth,char sex,String nationality){
            this.age=age;
            this.weight=weight;
            this.heigth=heigth;
            this.sex=sex;
            this.nationality=nationality;
        }
        public Human(int age,String nationality){
            this.age=age;
            this.weight=0;
            this.heigth=0;
            this.sex='m';
            this.nationality=nationality;
        }
        public Human(int age, char sex){
            this.age=age;
            this.weight=0;
            this.heigth=0;
            this.sex=sex;
            this.nationality="Russian";
        }
        public Human(int age,char sex, String nationality){
            this.age=age;
            this.weight=0;
            this.heigth=0;
            this.sex=sex;
            this.nationality=nationality;
        }
        public Human(char sex, String nationality){
            this.age=0;
            this.weight=0;
            this.heigth=0;
            this.sex=sex;
            this.nationality=nationality;
        }
        public Human(char sex){
            this.age=0;
            this.weight=0;
            this.heigth=0;
            this.sex=sex;
            this.nationality="Russian";
        }

    }
}
