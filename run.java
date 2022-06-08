
public class run {
        public static void main(String[] args) {

                club Robo   = new club("Robotics Club"      );
                club AeroMC = new club("Aero-Modelling Club");
                club Astro  = new club("Astronomy Club"     );

                Mentor Harsh = new Mentor("Harsh Sinha", 12345678, 3, "MNC", "Robotics Club", "Pybullet", 9);
                
                Harsh.update_Details();
                // inherited from Student class.
                
                Harsh.show_Details();
                // inherited from Student class.

                Harsh.add_specialization("JAVA");
                Harsh.rem_specialization("Pybullet");
                // unique to Mentor class.


                Harsh.show_Details();


                Harsh.add_clubs(AeroMC);
                AeroMC.is_member(Harsh);
                // mentors can add themselves to clubs and divs for teaching.
                

                Mentee Ansh = new Mentee("Ansh Chaudhary", 21124007, 1, "MNC", "Dev division", 8);

                Robo.add_member(Ansh); 
                Robo.is_member (Ansh); 
                Robo.rem_member(Ansh);
                Robo.is_member (Ansh);
                // club can add mentee (Ansh) but mentee cannot add itself to any club.

                
                // same process can be applied for AeroMC and Astro clubs.
                // AeroMC.add_member(Ansh);
                // Astro.add_member (Ansh);
                
                division CP      = new division("Cp division"      , "COPS");
                division Infosec = new division("Infosec division" , "COPS");
                division ML      = new division("ML division"      , "COPS");
                division Dev     = new division("Dev division"     , "COPS");


                CP.add_member(Ansh);
                CP.is_member (Ansh);
                CP.rem_member(Ansh);
                CP.is_member (Ansh);


                // Same results will be for Infosec, ML and Dev divisions.
                // Infosec.add_member(Ansh);
                // ML.add_member(Ansh);
                // Dev.add_member(Ansh);

                AeroMC.is_member(Ansh);
                // not a member here.
                
                Harsh.add_fachha_to_club(AeroMC, Ansh);
                AeroMC.is_member(Ansh);
                // Member added by Mentor.

                Astro.is_member(Ansh);
                // not a member here.

                Harsh.add_fachha_to_club(Astro, Ansh);
                Astro.is_member(Ansh); 
                // Mentor does not have acsess to add mentees to clubs outside scope. 
        }
}
