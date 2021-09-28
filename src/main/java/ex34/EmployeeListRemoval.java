package ex34;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeListRemoval {

    boolean removeName(ArrayList names,String del)
    {

        return names.remove(del);

    }

    public static void main(String []args)
    {

        EmployeeListRemoval obj=new EmployeeListRemoval();

        Scanner sc=new Scanner(System.in);

        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");

        System.out.println("there are five employees");
        System.out.println(names);

        System.out.println("Enter the name to delete");
        String del=sc.nextLine();

        obj.removeName(names,del);
        System.out.println(names);
    }

}
