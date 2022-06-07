import java.util.Scanner;

abstract class Student implements getDetails{
        protected String name;
        protected int Roll;
        protected int year;
        protected String branch;

        Student(String name, int roll_no, int year, String branch) {
                this.name = name;
                this.Roll = roll_no;
                this.year = year;
                this.branch = branch;
        }

        public void show_Details() {

                System.out.println("Name   : \t" + this.name);
                System.out.println("Roll   : \t" + this.Roll);
                System.out.println("Year   : \t" + this.year);
                System.out.println("Branch : \t" + this.branch);
                System.out.println();
                System.out.println();

        }

        public void update_Details() {
                System.out.println("Availaible Choices: ");
                System.out.println("0. Exit");
                System.out.println("1. Name");
                System.out.println("2. Roll");
                System.out.println("3. Year");
                System.out.println("4. Branch");

                Scanner sc = new Scanner(System.in);
                boolean changing_details = true;

                while (changing_details) {
                
                        System.out.print("Choice : ");
                        int choice = sc.nextInt();
                        sc.nextLine();
                
                        if (choice == 0) {

                                changing_details = false;
                                System.out.println();
                                System.out.println("Details changed to:");
                                sc.close();
                        
                        } else {

                                System.out.print("Enter Detail: ");
                                
                                if (choice == 1) {
                                
                                        String name = sc.nextLine();
                                        this.name = name;
                                
                                } else if (choice == 2) {
                                
                                        int Roll = sc.nextInt();
                                        sc.nextLine();
                                        this.Roll = Roll;

                                } else if (choice == 3) {
                                
                                        int year = sc.nextInt();
                                        sc.nextLine();
                                        this.year = year;
                                
                                } else if (choice == 4) {
                                        
                                        String branch = sc.nextLine();
                                        this.branch = branch;
                                
                                } else {

                                        System.out.println("Error! enter correct choice. ");
                                
                                }

                        }
                }
        }
}