package com.nickseniuk.Student;

public class Student {
    private int Id;
    private String Name;
    private String Surname;
    private String FatherName;
    private String DateOfBirth;
    private String Address;
    private String Faculty;
    private int Course;
    private String Group;


    public int GetId() {
        return Id;
    }


    public String GetName() {
        return Name;
    }

    public String GetSurname() {
        return Surname;
    }

    public String GetFatherName() {
        return FatherName;
    }

    public String GetAddress() {
        return Address;
    }

    public String GetFaculty() {
        return Faculty;
    }

    public int GetYear() {
        int end = DateOfBirth.length();
        return Integer.parseInt(DateOfBirth.substring(end - 4, end));
    }


    public int GetCourse() {
        return Course;
    }


    public String GetGroup() {
        return Group;
    }

    public Student(int id, String name, String surname, String fathername, String dateOfBirth, String address, String faculty,
                   int course, String group) {
        this.Id = id;
        this.Name = name;
        this.Surname = surname;
        this.FatherName = fathername;
        this.DateOfBirth = dateOfBirth;
        this.Address = address;
        this.Faculty = faculty;
        this.Course = course;
        this.Group = group;
    }


    public String ToString() {
        return "Id=" + String.valueOf(Id) + "\t, Name - " + Name + "\t, Surname - " + Surname + "\t, FatherName - " + FatherName +
                "\t, DateOfBitrh - " + DateOfBirth + "\t, Address - " + Address + "\t, Faculty - " + Faculty +
                "\t, Course - " + String.valueOf(Course) + "\t, Group - " + Group;
    }
}

