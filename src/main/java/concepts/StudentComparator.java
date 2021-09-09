package concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentComparator {

    int rollNo;
    String name, address;

    public StudentComparator(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.rollNo + " " + this.name + " " + this.address;
    }
}

    class SortByRoll implements  Comparator<StudentComparator>{

        public int compare(StudentComparator a, StudentComparator b){
            return a.rollNo - b.rollNo;
        }
    }
    class SortByName implements Comparator<StudentComparator>{
        public int compare(StudentComparator a, StudentComparator b){
            return a.name.compareTo(b.name);
        }
    }

    class Main {
        public static void main(String[] args) {
            ArrayList<StudentComparator> studentArrayList = new ArrayList<>();

            studentArrayList.add(new StudentComparator(333, "nop", "qrs"));
            studentArrayList.add(new StudentComparator(222, "abc", "klm"));
            studentArrayList.add(new StudentComparator(111, "hjk", "efg"));


            System.out.println("Unsorted");
            for (StudentComparator a: studentArrayList) {
                System.out.println(a.rollNo + " " +a.name + " "+a.address);
            }


            Collections.sort(studentArrayList, new SortByRoll());

            System.out.println("Sort by rollNumber");
            for (StudentComparator a: studentArrayList) {
                System.out.println(a.rollNo + " " +a.name + " "+a.address);
            }

            Collections.sort(studentArrayList, new SortByName());

            System.out.println("Sort by name");
            for (StudentComparator a: studentArrayList) {
                System.out.println(a.rollNo + " " +a.name + " "+a.address);
            }

        }

    }
