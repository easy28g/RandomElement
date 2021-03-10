package megacom.models;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class MySet {

    Scanner scanner = new Scanner(System.in);

    LinkedHashSet<String> hashSet = new LinkedHashSet<>();

    public void addCity(){
        do{
            System.out.print("Введите город: ");
            String city = scanner.next();
            hashSet.add(city);
        }while(hashSet.size()!=10);
    }

    public void outputRandomCity(){
        LinkedList<String> linkedList = new LinkedList<>(hashSet);
        int i = (int)(Math.random()*(hashSet.size()));
        System.out.println(hashSet);
        System.out.println(i+1);
        System.out.println(linkedList.get(i));
    }

    
}
