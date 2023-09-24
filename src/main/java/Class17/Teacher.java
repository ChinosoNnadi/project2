package Class17;

 class Teacher {
    String TeacherName="Cynthia";
    public void printTeach(){
        System.out.println(TeacherName);
    }
    class MathTeacher extends Teacher{
        String mTeach="Jessica";
        public void printMTeach(){
            System.out.println(mTeach+" "+TeacherName);
        }
    }
     class ChemistryTeacher extends MathTeacher{
         String cTeach="Alex";
         public void printMTeach(){
             System.out.println(cTeach+" "+TeacherName);
         }
     }
     class PianoTeacher extends ChemistryTeacher{
         String pTeach="Evans";
         public void printPTeach(){
             System.out.println(pTeach+" "+TeacherName);
         }
     }
     public static void main(String[] args) {
         Teacher t=new Teacher();
         t.printTeach();
     }
}
