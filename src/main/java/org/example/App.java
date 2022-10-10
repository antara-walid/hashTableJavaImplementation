package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        HashTable<String> ht = new HashTable<>(3);

        ht.put(1,"walid");
        ht.put(2,"bora");
        ht.put(3,"hamza");
        ht.put(4,"gri3a");

        System.out.println(ht.get(3));
        System.out.println(ht.get(4));

    }
}
