package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String content = new String();
        int count = 1;
        File file = new File("ex.txt");
        LinkedList<String> list = new LinkedList<String>();
        try {
            Scanner sc = new Scanner(new FileInputStream(file));
            while (sc.hasNextLine()){
                content = sc.nextLine();
                list.add(content);
            }
            sc.close();
        }catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(list);
        Iterator i = list.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
