public class StudentsService {


    public int fillStudents(Students[] student, String[] row) {
        int defaultStudents = 5;
        int index = 0;
        for (int i = 0; i < row.length; i++) {
            String[] member = row[i].split(",");
            if (member.length == defaultStudents) {
                student[index++] = new Students(member[0], member[1], Integer.parseInt(member[2]), member[3].charAt(0), Double.parseDouble(member[4]));
            } else {
                System.out.println("Row" + " " + i);
            }

        }
        return index;
    }

    //Task1
    public static void fullNames(Students[] student, int l) {
        for (int i = 0; i < l; i++) {
            System.out.println("Full name of student is:" + " " + student[i].getFirstName() + " " + student[i].getLastName());
        }
    }

    //Task2
    public static void maleStudents(Students[] student, int l) {
        for (int i = 0; i < l; i++) {
            if (student[i].getGender() == 'm') {
                student[i].printInfo();
            }

        }
    }

    //task3
    public static void femaleStudentsMark(Students[] student, int l) {
        for (int i = 0; i < l; i++) {
            if (student[i].getGender() == 'f' && student[i].getMark() > 55.4) {
                student[i].printInfo();
            }
        }
    }

    //task4
    public static void minMark(Students[] student, int l) {
        double min = student[0].getMark();
        for (int i = 0; i < l; i++) {
            if (student[i].getMark() < min) {
                min = student[i].getMark();
                student[i].printInfo();
            }

        }
    }

    //task5
    public static void biggestMaleStudent(Students[] student, int l) {
        Students max = null;
        for (int i = 0; i < l; i++) {
            if (max == null) {
                if (student[i].getGender() == 'f')
                    max = student[i];
            } else {
                if (student[i].getGender() == 'f' && student[i].getYear() < max.getYear()) {
                    max = student[i];

                }
            }
        }
        if (max != null) {
            max.printInfo();
        } else
            System.out.println("no girls");
    }

//task6


   /* public static void sortStudents(Students[] student, int l)
    {
        double min = student[0].getMark();
        for (int i = 0; i <l ; i++) {
            if (student[i].getMark() < min){
                min = student[i].getMark();
                student[i].printInfo();
            }

        }

    }*/
//?????????????
   /* public static void sortStudents(Students[] student, int l) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (student[j].getMark() > student[j + 1].getMark()) {
                    double x = student[j].getMark();
                    student[j].getMark() = student[j + 1].getMark();
                    student[j + 1].getMark() = x;
                }
            }
        }
        for (int i = 0; i < l; i++)
          student[i].printInfo();
    }*/

//how to solve it using Arrays ????????
                // Arrays.sort(new double[]{student[i].getMark()});
}
