package Class20;

 class SyntaxTechnologies {
         String schoolName;
         int batch;
         int year;
         String lastDayOfClass;

        public void SyntaxTechnologies(){
            String schoolName;
            int batch;
            int year;
            String lastDayOfClass;
    }
        public void SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;

    }
        void displayValue(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }


        public static void main(String[] args){
            SyntaxTechnologies student1 = new SyntaxTechnologies();
            student1.displayValue();
            //SyntaxTechnologies student1 = new SyntaxTechnologies();
            SyntaxTechnologies student = new SyntaxTechnologies();
            student.schoolName="Syntax";
            student.batch=6;
            student.year=2020;
            student.lastDayOfClass="07/30/2020";
            student.displayValue();

        }
    }

