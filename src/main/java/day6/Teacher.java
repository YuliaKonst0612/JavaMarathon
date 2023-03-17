package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;


 public void  evaluate (Student student){
     Random random = new Random();
     int rnd = random.nextInt(4)+2;
     String mark = "";
     switch (rnd){
         case 2: mark = "неудовлетворительно";
         break;
         case 3: mark = "удовлетворительно";
             break;
         case 4: mark = "хорошо";
             break;
         case 5: mark = "отлично";
             break;
     }
     System.out.println("Преподаватель " + this.name +  " оценил студента с именем "
             + student.getName() + " по предмету "+ this.subject + " на оценку " + mark);
}
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
