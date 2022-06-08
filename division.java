class division extends club {

        String div_name;
        String parent_club;

        public division(String div_name, String parent_club) {
                super(parent_club);
                this.div_name = div_name;
                this.parent_club = this.club_name;
        }

        @Override
        protected boolean is_member(Student Stud) {

                for (int i = 0; i < this.number_of_members; ++i) {
                        if (members[i] == Stud.Roll) {
                                
                                System.out.println(String.format("%s %d is a member of %s\n", Stud.name, Stud.Roll, this.div_name));
                                return true;
                        
                        }
                }

                System.out.println(String.format("%s %d is NOT a member of %s\n", Stud.name, Stud.Roll, this.div_name));
                return false;
        
        }
        @Override
        protected void add_member(Student Stud) {

                this.members[number_of_members] = Stud.Roll;
                this.number_of_members++;
                System.out.println(String.format("%s %d added to %s\n", Stud.name, Stud.Roll, this.div_name));

        }
        @Override
        protected void rem_member(Student Stud) {
                for (int i = 0; i < number_of_members; ++i) {
                        if (this.members[i] == Stud.Roll) {
                        
                                this.members[i] = this.members[number_of_members - 1];
                                this.members[number_of_members] = 0;
                                this.number_of_members--;

                                System.out.println(String.format("%s %d removed from %s\n", Stud.name, Stud.Roll, this.div_name));
                                return;
                        
                        }
                }

                System.out.println("Error! Member Not Found.\n");
        
        }

}
