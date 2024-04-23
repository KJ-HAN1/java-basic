package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();   //객체생성 ->메모리에 student1 객체 생성
        //클래스에 접근
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();   //student2 = 객체
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;
        //기본출력
//        System.out.println("이름:" + student1.name +" 나이:" + student1.age+" 성적:" + student1.grade);
//        System.out.println("이름:" + student2.name +" 나이:" + student2.age+" 성적:" + student2.grade);
        Student[] students = {student1, student2};
        //배열을 통한 리팩토링
//        for(int i=0;i<students.length;i++){
//            System.out.println("이름:" + students[i].name +" 나이:" + students[i].age+" 성적:" + students[i].grade);
//        }
        //배열에서 변수 선언을 통한 리펙토링
        for(int i=0;i<students.length;i++){
            Student s = students[i];
            System.out.println("이름:" + s.name +" 나이:" + s.age+" 성적:" + s.grade);
        }
        //향상된 for문 -> iter 입력을 통한 단축키로 생성가능
        for(Student s : students){
            System.out.println("이름:" + s.name +" 나이:" + s.age+" 성적:" + s.grade);
        }


    }
}
