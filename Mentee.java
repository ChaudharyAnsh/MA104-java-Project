public class Mentee extends Student{
        float learning_index;

        // 8gpa bhi lani hai 3 se zyada club kaise sambhalenge fachhe.
        String enrollment1;
        String enrollment2;
        String enrollment3;

        Mentee(String name, int roll_no, int year, String branch, String enrollment1, float learning_index){
                super(name, roll_no, year, branch);

                this.learning_index = learning_index;
                this.enrollment1 = enrollment1;

        } 

        public void show_Details() {

                System.out.println("Name   : \t" + this.name);
                System.out.println("Roll   : \t" + this.Roll);
                System.out.println("Year   : \t" + this.year);
                System.out.println("Branch : \t" + this.branch);
                if(enrollment1 != null) System.out.println("enrolled in : " + this.enrollment1);
                if(enrollment2 != null) System.out.println("enrolled in : " + this.enrollment2);
                if(enrollment3 != null) System.out.println("enrolled in : " + this.enrollment3);

                System.out.println();
                System.out.println();

        }

        protected void add_enrollment(String new_enrollment){
                if(this.enrollment2 == null){
                        this.enrollment2 = new_enrollment;
                }
                else if(this.enrollment3 == null){
                        this.enrollment3 = new_enrollment;
                }
                else{
                        System.out.println("GPA ka bhi dhyan rakho. 3 se zyada clubs ek sath. Tumse na ho payega");
                        System.out.println("Remove one of these to add new one: ");
                        for(int i=1; i<4; ++i){
                                System.out.println(i + ' ' + this.enrollment1);
                                System.out.println(i + ' ' + this.enrollment2);
                                System.out.println(i + ' ' + this.enrollment3);
                        }
                }
        }
        protected void rem_enrollment(String enrollment){
                if(this.enrollment1 == enrollment){

                        // if any enrollment is removed, then the lower ones are shifted upwards.
                        this.enrollment1 = this.enrollment2;
                        this.enrollment2 = this.enrollment3;
                        this.enrollment3 = null;
                }

                else if(this.enrollment2 == enrollment){
                        this.enrollment2 = this.enrollment3;
                        this.enrollment3 = null;
                }
                else if(this.enrollment3 == enrollment){
                        this.enrollment3 = null;
                }
                else{
                        System.out.println("Invalid input. Mentee does not have this enrollment.");
                }
        }
}
