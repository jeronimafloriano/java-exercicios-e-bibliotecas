package hackerhanck.easy;

import java.util.*;

public class Sort {
        private int id;
        private String fname;
        private double cgpa;

        public Sort(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

    //Complete the code
    class SolutionSort {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());

            List<Sort> studentList = new ArrayList<Sort>();

            while(testCases>0){
                int id = in.nextInt();
                String fname = in.next();
                double cgpa = in.nextDouble();

                Sort st = new Sort(id, fname, cgpa);
                studentList.add(st);

                testCases--;
            }

            Collections.sort(studentList, Comparator.comparing(Sort::getCgpa).reversed()
                    .thenComparing(Sort::getFname)
                    .thenComparing(Sort::getId));


            for(Sort st: studentList){
                System.out.println(st.getFname());
            }
        }
    }

