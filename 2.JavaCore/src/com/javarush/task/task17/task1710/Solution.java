package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
-c name sex bd
-u id name sex bd
-d id
-i id
-c Миронов м 15/04/1990
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.
Требования:
1. Класс Solution должен содержать public static поле allPeople типа List<Person>.
2. Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
3. При запуске программы с параметром -с программа должна добавлять человека с заданными параметрами в конец списка allPeople, и выводить id (index) на экран.
4. При запуске программы с параметром -u программа должна обновлять данные человека с заданным id в списке allPeople.
5. При запуске программы с параметром -d программа должна логически удалять человека с заданным id в списке allPeople.
6. При запуске программы с параметром -i программа должна выводить на экран данные о человеке с заданным id по формату указанному в задании.
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String command= args[0];
        String[] InputParam=args;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (command) {
            case "-c":       //-c name sex bd
            {
                String name = InputParam[1];
                String sex = InputParam[2];
                Date bd = simpleDateFormat.parse(InputParam[3]);
                switch (sex) {
                    case "м": {allPeople.add( Person.createMale(name,bd));break;}
                    case "ж": {allPeople.add( Person.createFemale(name,bd));break;}
                }
                System.out.println( allPeople.size()-1 );
                break;
            }
            case "-u":      //-u id name sex bd
            {
                int id=Integer.parseInt( InputParam[1]);
                String name=InputParam[2];
                String sex=InputParam[3];
                Date bd=simpleDateFormat.parse( InputParam[4] );
                switch (sex) {
                    case "м": {allPeople.get( id ).setName( name );allPeople.get( id ).setSex( Sex.MALE );allPeople.get( id ).setBirthDate( bd );break;}
                    case "ж": {allPeople.get( id ).setName( name );allPeople.get( id ).setSex( Sex.FEMALE );allPeople.get( id ).setBirthDate( bd );break;}
                }
                break;
            }
            case "-d":
            {
                int id=Integer.parseInt( InputParam[1] );
                allPeople.get( id ).setName( null );
                allPeople.get( id ).setSex(null);
                allPeople.get( id ).setBirthDate( null );
                break;
            }
            case "-i":  //-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
            {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                int id=Integer.parseInt( InputParam[1] );
                String sex=null;
                if (allPeople.get( id ).getSex().equals( Sex.MALE )) {sex="м";} else {sex="ж";}
                System.out.println( allPeople.get( id ).getName() + " " + sex + " " + sdf.format( allPeople.get( id ).getBirthDate()) );
                break;
            }

        }
    }
}
