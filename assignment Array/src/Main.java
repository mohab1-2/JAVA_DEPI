//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args)
//    {
//        Scanner user = new Scanner(System.in);
//        System.out.print("enter number of students: ");
//        int n = user.nextInt();
//
//        int[] marks = new int[n];
//
//
//        System.out.println("enter marks for each student:");
//        for (int i = 0; i < n; i++)
//        {
//            System.out.print("student " + (i + 1) + ": ");
//            marks[i] = user.nextInt();
//        }
//
//        int sum = 0;
//        int highest = marks[0];
//        int lowest = marks[0];
//
//        for (int i = 0; i < n; i++)
//        {
//            sum += marks[i];
//            if (marks[i] > highest)
//            {
//                highest = marks[i];
//            }
//            else if (marks[i] < lowest)
//            {
//                lowest = marks[i];
//            }
//        }
//
//        double average =  sum / n;
//
//        System.out.println("results:");
//        System.out.println("average: " + average);
//        System.out.println("highest: " + highest);
//        System.out.println("lowest: " + lowest);
//
//        System.out.println("\nAll student marks:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("student " + (i + 1) + ": " + marks[i]);
//        }
//
//        int passed = 0;
//        int failed = 0;
//
//        for (int i = 0; i < n; i++)
//        {
//            if (marks[i] >= 50)
//            {
//                passed++;
//            }
//            else
//            {
//                failed++;
//            }
//        }
//
//        System.out.println("number of students that passed or failed");
//        System.out.println("Passed: " + passed);
//        System.out.println("Failed: " + failed);
//    }
//}
///////////////////////////////////////////////////////////////////////////////////////
//class Student
//{
//    String name;
//    int age;
//    float GPA;
//    void display_info()
//    {
//        System.out.println("Name: "+name);
//        System.out.println("Age: "+age);
//        System.out.println("Gpa: "+GPA);
//        System.out.println("=======================");
//    }
//    public void study()
//    {
//        System.out.println(name + " is studying hard!");
//        if (GPA < 4.0)
//        {
//            GPA += 0.1F;
//            if (GPA > 4.0)
//            {
//                GPA = 4.0F;
//            }
//        }
//        System.out.println(name + "'s GPA improved to: " + String.format("%.2f", GPA));
//    }
//}
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Student student1 = new Student();
//        student1.name = "Mohab ahmed";
//        student1.age = 20;
//        student1.GPA = 3.5F;
//
//        Student student2 = new Student();
//        student2.name = "Zyad mohamed";
//        student2.age = 19;
//        student2.GPA = 3.2f;
//
//        Student student3 = new Student();
//        student3.name = "mahmoud said";
//        student3.age = 21;
//        student3.GPA = 2.5f;
//
//        System.out.println("=== Student Information ===");
//        student1.display_info();
//        student2.display_info();
//        student3.display_info();
//
//        System.out.println("\n=== Students are studying ===");
//        student1.study();
//        student2.study();
//        student3.study();
//
//        System.out.println("\n=== Updated Student Information ===");
//        student1.display_info();
//        student2.display_info();
//        student3.display_info();
//    }
//}
/////////////////////////////////////////////////////////////////////////////////
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args)
//     {
//         Scanner user = new Scanner(System.in);
//         int[] numbers = {10,20,30,40,50};

//         System.out.print("Array: ");
//         for (int i = 0; i < numbers.length; i++)
//         {
//             System.out.print(numbers[i] + " ");
//         }

//         System.out.print("\nEnter number to search: ");
//         int search = user.nextInt();

//         boolean found = false;
//         for (int i = 0; i < numbers.length; i++)
//         {
//             if (numbers[i] == search)
//             {
//                 found = true;
//                 break;
//             }
//         }
//         if (found)
//         {
//             System.out.println(search + " exist in the array");
//         }
//         else
//         {
//             System.out.println(search + " doesn't exist in the array");
//         }

//     }
// }
















