package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {

       /*
        Person p = new Person("Tom");

        Person k = new Korean("홍길동");
        Person j = new Japanese("다나카");
        Person c = new Chinese("왕밍");

        System.out.println(p);
        System.out.println(k);
        System.out.println(j);
        System.out.println(c);

        System.out.println("\n");

        p.sayHello();
        k.sayHello();
        j.sayHello();
        c.sayHello();

        System.out.println("\n");

        p.sayBye();
        k.sayBye();
        j.sayBye();
        c.sayBye();
        */

       Person[] persons = {

         new Person("Tom"),
         new Korean("홍길동"),
         new Japanese("다나카"),
         new Chinese("왕")
       };

       for( Person p : persons ){
          greeting(p);
       }

    }
    static private void greeting(Person p){
        System.out.println(p);
        p.sayHello();
        p.sayBye();
        System.out.println();
    }
}
