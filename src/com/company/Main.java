package com.company;
/*Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
Создать Интерфейс Printable с методом void print();
Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.
В классе Main создать возвращаемый метод createObject(String className), который умеет создавать объекты класса 2й, 3й и 4й и
после создания и задания свойств объекту метод возвращает ссылку на объект (пульт). Можно использовать switch для того
чтоб определить какого типа нужно создать экземпляр объекта. Например если в параметре передается “2й” метод должен создать
объект именно этого типа.
В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createOcject,
 и распечатать по ним информацию методом print();
*/

public class Main {

    public static void main(String[] args) {
        createObject( "Бургер" ).print();
        createObject( "FreshBox" ).print();
        createObject( "PepperSteak" ).print();
    }
    public static Printable createObject(String className){              // для возвращаемого метода нужен return
       Printable info = null;                                           // static дает вызывать метод по его названию (Printable)
        switch (className){
            case "Бургер":
                info = new Burger( "XL" );
                break;
            case "FreshBox":
                info = new Sushi( 20 );
                break;
            case "PepperSteak":
                info = new Steak( 2.1 );
                break;
        }
        return info;
    }

}


