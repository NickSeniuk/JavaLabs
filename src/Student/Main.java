package Student;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість студентів - ");
        int arraySize = scanner.nextInt();
        Student[] array = RandomStudents(arraySize);
        PrintStudents(array);

        ShowStudentsByGroup(array, arraySize);
        ShowStudentsByFaculty(array, arraySize);
        ShowStudentsByYear(array, arraySize);
    }


    public static Student[] RandomStudents (int arraySize)
    {
        Student[] array = new Student[arraySize];
        Random random = new Random();
        String[] name = {"Igor", "Ivan", "Kateryna", "Petro", "Volodymyr", "Maria", "Liza"};
        String[] surname = {"Grygorenko", "Tkachenko", "Zakharckevych", "Gryniv", "Andriyenko", "Goloborodko"};
        String[] fathername = {"Ivanovych", "Nazarovych", "Volodymyrovych", "Serhiyovych", "Petrovych"};
        String[] dateOfBirth = {"20.12.2001", "17.03.2000", "19.11.1999", "23.10/1998", "12.11.2000"};
        String[] address = {"Naukova 5", "Stryiska 2", "S. Bandery 17A", "Shevchenka 10", "B. Khmelnytskogo 4"};
        String[] faculty = {"KN", "PM", "PZ", "KI", "UM"};
        String[] group = {"KN-205", "PM-12", "KN-201", "UM-14", "PZ-45", "PM-26", "PZ-32", "UM-11"};
        for(int i = 0; i < arraySize; i++)
        {
            array[i] = new Student(random.nextInt(10) + 10,
            name[random.nextInt(name.length)],
            surname[random.nextInt(surname.length)],
            fathername[random.nextInt(fathername.length)],
            dateOfBirth[random.nextInt(dateOfBirth.length)],
            address[random.nextInt(address.length)],
            faculty[random.nextInt(faculty.length)],
            random.nextInt(5) + 1,
            group[random.nextInt(group.length)]);
        }
           return array;
    }


    public static void PrintStudents(Student [] array){
        for (Student student : array) {
            System.out.println(student.ToString());
        }
    }


    public static void ShowStudentsByGroup(Student[] array, int arraySize){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть групу - ");
        String group = scanner.nextLine();
        for(int i = 0; i < arraySize; i++){
         if(array[i].GetGroup().equals(group)){
             System.out.println(array[i].ToString());
         }
        }
    }

    static void ShowStudentsByFaculty(Student[] array, int arraySize)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть факультет - ");
        String faculty = scanner.nextLine();
        for(int i = 0; i < arraySize; i++){
            if (array[i].GetFaculty().equals(faculty)) {
                System.out.println(array[i].ToString());
            }
        }
    }

    static void ShowStudentsByYear(Student[] array, int arraySize)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рік - ");
        int year = scanner.nextInt();
        for(int i = 0; i < arraySize; i++){
            if (array[i].GetYear() > year) {
                System.out.println(array[i].ToString());
            }
        }
    }
}



