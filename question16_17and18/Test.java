package question16_17and18;

import java.util.Comparator;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        UtilityList ul = new UtilityList();

        System.out.println("Enter Student 1");
        ul.createList();

        System.out.println("\nEnter Student 2");
        ul.createList();

        System.out.println("\nEnter Student 3");
        ul.createList();


        System.out.println("\n----- Student List -----");
        ul.printList();


        //  Comparator
        // Sort Student objects according to percentage
        ul.getList().sort(new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {

                // Descending order
                return Double.compare(
                        s2.getPercentage(),
                        s1.getPercentage()
                );
            }
        });

        System.out.println("\n----- Q17: Comparator Sorting -----");
        ul.printList();

        //Comparable
        // Sort Student objects according to percentage

        Collections.sort(ul.getList());

        System.out.println("\n----- Q18: Comparable Sorting -----");
        ul.printList();


        // Student Report

        UtilityReport ur = new UtilityReport();

        ur.showReport(ul.getList());
    }
}
