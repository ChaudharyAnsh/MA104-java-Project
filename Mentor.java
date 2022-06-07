public class Mentor extends Student{
        float rating;
        String specialization1;
        String specialization2;
        String specialization3;

        
        protected String clubs[] = new String[5];
        protected String divs[] = new String[5];

        Mentor(String name, int roll_no, int year, String branch, String Club, String specialization, float rating){
                super(name, roll_no, year, branch);

                this.rating = rating;
                this.specialization1 = specialization;

                System.out.println("Mentor " + this.name + " added.");
                System.out.println();
                this.show_Details();

        } 
        public void show_Details() {

                System.out.println();
                System.out.println("Name   : \t" + this.name);
                System.out.println("Roll   : \t" + this.Roll);
                System.out.println("Year   : \t" + this.year);
                System.out.println("Branch : \t" + this.branch);
                if(specialization1 != null) System.out.println("Specialization: " + this.specialization1);
                if(specialization2 != null) System.out.println("Specialization: " + this.specialization2);
                if(specialization3 != null) System.out.println("Specialization: " + this.specialization3);
                System.out.println();


        }
        protected void add_fachha_to_club(club addtoclub, Mentee fachha){

                for(int i=0; i<5; ++i){
                        /* mentors can add mentees to club only which they ae teaching in and part of. */
                        if(addtoclub.club_name == clubs[i]){
                                addtoclub.add_member(fachha);
                                return;
                        }
                }
                System.out.println("Mentor cannot add mentee to club as not a part himself");

        };

        protected void add_clubs(club new_club){
                for(int i=0; i<5; ++i){
                        if(clubs[i] == null){
                                this.clubs[i] = new_club.club_name;
                                // mentor should obviosly be a member of the club.
                                new_club.add_member(this);
                                break;

                        }
                }
        }

        protected void add_divs(division new_div){
                for(int i=0; i<5; ++i){
                        if(divs[i] == null){
                                this.clubs[i] = new_div.div_name;
                                // mentor should obviosly be a member of the division.
                                new_div.add_member(this);
                                break;

                        }
                }
        }


        protected void add_specialization(String new_specialization){
                if(this.specialization2 == null){
                        this.specialization2 = new_specialization;
                }
                else if(this.specialization3 == null){
                        this.specialization3 = new_specialization;
                }
                else{
                        System.out.println("A mentor can have maximum 3 specializations.");
                        System.out.println("Remove one of these to add new one: ");
                        for(int i=1; i<4; ++i){
                                System.out.println(i + ' ' + this.specialization1);
                                System.out.println(i + ' ' + this.specialization2);
                                System.out.println(i + ' ' + this.specialization3);
                        }
                }
        }
        protected void rem_specialization(String specialization){
                if(this.specialization1 == specialization){

                        // specialization1 is remocved and 2and 3 are shifted up.
                        this.specialization1 = this.specialization2;
                        this.specialization2 = this.specialization3;
                        this.specialization3 = null;
                }

                else if(this.specialization2 == specialization){
                        this.specialization2 = this.specialization3;
                        this.specialization3 = null;
                }
                else if(this.specialization3 == specialization){
                        this.specialization3 = null;
                }
                else{
                        System.out.println("Invalid input. Mentor does not have this specialization.");
                }
        }
}
