public class club extends sntc {
        public String parent;
        protected int members[];

        public club(String club_name) {
                this.club_name = club_name;
                this.members = new int[500];
                for (int i = 0; i < 500; ++i) {
                        this.members[i] = 0;
                }
        }

        protected boolean is_member(Student Stud) {
                for (int i = 0; i < this.number_of_members; ++i) {
                        if (members[i] == Stud.Roll) {

                                System.out.println(String.format("%s %d is a member of %s", Stud.name, Stud.Roll, this.club_name) );
                                return true;
                        
                        }
                }

                System.out.println(String.format("%s %d is NOT a member of %s", Stud.name, Stud.Roll, this.club_name));
                return false;
        
        }

        protected void add_member(Student Stud) {

                this.members[number_of_members] = Stud.Roll;
                this.number_of_members++;
                System.out.println(String.format("%s %d added to of %s", Stud.name, Stud.Roll, this.club_name));

        }

        protected void rem_member(Student Stud) {
                for (int i = 0; i < number_of_members; ++i) {
                        if (this.members[i] == Stud.Roll) {

                                this.members[i] = this.members[number_of_members - 1];
                                this.members[number_of_members] = 0;
                                this.number_of_members--;

                                System.out.println(String.format("%s %d removed from of %s", Stud.name, Stud.Roll, this.club_name));
                                return;
                        
                        }
                }

                System.out.println("Error! Member Not Found.");
        
        }

        public static void main(String[] args) {

                System.out.println("Done");
        
        }

}
