public class condition1 {
        public static void main(String[] args) {
        double total_marks=382;
        char grade;
        double perc=(total_marks/500)*100;
        if(perc>=80)
        {
            grade='A';
        }else if((perc>=70)&&(perc<80)){
        grade='B';
        }
        else if((perc>=60)&&(perc<70)){
            grade='c';
        }else{
            
            grade='d';
        }
        System.out.println("the percentage of the student :"+perc);
        System.out.println("the percentage of the student:"+grade);

    }
    
}
