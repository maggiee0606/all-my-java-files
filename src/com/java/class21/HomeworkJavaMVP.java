package com.java.class21;

import java.util.Scanner;

public class HomeworkJavaMVP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name?");
        String name = sc.nextLine();
        System.out.println("Which class are you going to attend right now?");
        String className = sc.nextLine();

        System.out.println(groupMVPorNot(name, className));
    }
    public static String groupMVPorNot(String a, String b) {
        if ((studentList(a) == true) && b.equalsIgnoreCase("Group project")) {
                    return "Welcome to the class!";

        } else if (studentList(a) == true && b.equalsIgnoreCase("Java")) {
                    return "There's no Java class today, you'll have it on Monday, Tuesday and Wednesday!";

        } else if ((studentList(a) == true) && b.equalsIgnoreCase("Soft Skill")) {
                    return "There's no soft skills class today, you'll have it on Saturday!";

        } else if ((studentList(a) == true) && b.equalsIgnoreCase("Linux")) {
                    return "There's no Linux class today, you'll have it on Friday!";

        } else if (studentList(a) == false) {
                    return "Please join your group, you're not a part of MVP!";

        } else {
                    return "We don't have this class this week! ";
                }
            }

            static boolean studentList(String a) {
                return a.equalsIgnoreCase("Kang") || a.equalsIgnoreCase("Aigul") || a.equalsIgnoreCase("Aisuluu") || a.equalsIgnoreCase("Asel") ||
                        a.equalsIgnoreCase("Begaiym") || a.equalsIgnoreCase("Charlie") || a.equalsIgnoreCase("Guldana") || a.equalsIgnoreCase("Jadia")
                        || a.equalsIgnoreCase("Kanykei") || a.equalsIgnoreCase("Kristo") || a.equalsIgnoreCase("Maggie") || a.equalsIgnoreCase("Nevaeh")
                        || a.equalsIgnoreCase("Tayfun") || a.equalsIgnoreCase("Tetiana") || a.equalsIgnoreCase("Paulina");

            }


        }