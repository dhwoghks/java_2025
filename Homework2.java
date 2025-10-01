import java.util.Scanner;

public class Homework2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        for(int i=0;i<3;i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            int phone = sc.nextInt();
            students[i] = new Student(id,name,major,phone);
        }
        System.out.println("첫번째 학생: "+students[0].printStudent());
        System.out.println("두번째 학생: "+students[1].printStudent());
        System.out.println("세번째 학생: "+students[2].printStudent());
    }
}

class Student{
    int id;String name;String major;int phone;
    Student(int id,String name, String major, int phone){
        this.id = id;this.name=name;this.major=major;this.phone=phone;
    }
    int getId(){return this.id;}
    String getName(){return this.name;}
    String getMajor(){return this.major;}
    int getPhone(){return this.phone;}

    void setId(int id){this.id=id;}
    void setName(String name){this.name=name;}
    void setMajor(String major){this.major=major;}
    void setPhone(int phone){this.phone=phone;}

    String getStringPhone(){
        String strPhone = Integer.toString(this.phone);
        return "0"+strPhone.substring(0,2)+"-"+strPhone.substring(2,6)+"-"+strPhone.substring(6);
    }
    String printStudent(){
        return this.id+" "+this.name+" "+this.major+" "+getStringPhone();
    }
}
