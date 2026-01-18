import java.util.Scanner;

class stude
{
    int roll_no;
    String name;
    int age;
    String course;

    // Parameterized Constructor
    stude(int r, String n, int a, String c)
    {
        roll_no = r;
        name = n;
        age = a;
        course = c;
    }

    // Copy Constructor
    stude(stude s)
    {
        roll_no = s.roll_no;
        name = s.name;
        age = s.age;
        course = s.course;
    }

    void display()
    {
        System.out.println("Roll No: " + roll_no);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println("================");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Roll No:");
        int r = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the Name:");
        String n = sc.nextLine();

        System.out.println("Enter the Age:");
        int a = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the Course:");
        String c = sc.nextLine();

        stude s1 = new stude(r, n, a, c);
        stude s2 = new stude(s1);

        System.out.println("\nOriginal Student Details:");
        s1.display();

        System.out.println("Copied Student Details:");
        s2.display();

        sc.close();
    }
}
