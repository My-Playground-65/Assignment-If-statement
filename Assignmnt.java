import java.util.Scanner;
import java.util.Scanner;

public class Assignmnt {
    public static void main(String[] args) {
        
        /*
         * Enter your name:
         *    not type anything -- invalid name(red color)-- break
         *    white spaces --- invalid name(red color) --- break
         * Enter your age :
         *      age < 10 or age > 18 ---> not in range --->invalid age(red)
         * Enter your subject1:
         *      every subject start with SE-1/SE-2/SE-3 and need to have 3 digits, NUMBER CAN BE ANY NUMBER BUT NEED TO STARTS WITH SE ---> invalid subject, only white spaces ----> invalid subject,  SE-absc ----> invalid subject
         * enter marks1:
         *      0<=marks >= 100 ---otherwise ---->invalid marks
         * enter subject2:
         *      if enter subject 1 name----> invalid subject
         * enter marks2:
         * enter subject3:
         * enter marks3:
         */

        Scanner scan = new Scanner(System.in);

        
        final String RED = "\033[31m";
        final String DEFAULT = "\033[0m";

        

        System.out.print("Enter your name : ");
        String name = scan.nextLine().strip();
        //Check the student name

        if(name.length() == 0){
            System.out.printf("%s%s%s \n",RED,"Invalid name",DEFAULT);
        }else{
           

            //Check the age
        
            System.out.print("Enter your age : ");
            int age = scan.nextInt();

            if(age < 10 || age >18){
                 System.out.printf("%s%s%s \n",RED,"Invalid age",DEFAULT);
            }else{
               

                //Enter the Subject 1

                System.out.print("Enter Subject 1 : ");
                scan.nextLine();
                String sub1 = scan.nextLine();
                if(!sub1.startsWith("SE-")){
                    System.out.printf("%s%s%s \n",RED,"Invalid subject1",DEFAULT);
                }else{
                    
                    
                    //Enter marks 1
                    System.out.print("Enter marks1 : ");
                    double marks1 = scan.nextDouble();

                    if(marks1 < 0 || marks1 > 100){
                       System.out.printf("%s%s%s \n",RED,"Invalid marks1",DEFAULT);
                    }else{
                        

                        //Enter subject 2

                        System.out.print("Enter subject 2 : ");
                        scan.nextLine();
                        String sub2 = scan.nextLine();

                        if(sub2.equals(sub1) || !sub2.startsWith("SE-")){
                           System.out.printf("%s%s%s \n",RED,"Invalid subject2",DEFAULT);
                        }else{
                            
                            //Enter marks 2
                            System.out.print("Enter marks2 : ");
                            double marks2 = scan.nextDouble();

                            if(marks2 < 0 || marks2 > 100){
                                System.out.printf("%s%s%s \n",RED,"Invalid marks2",DEFAULT);
                            }else{
                               

                                //Enter subject 3

                                System.out.print("Enter subject 3 : ");
                                scan.nextLine();
                                String sub3 = scan.nextLine();

                                if((sub3.equals(sub1)) || (sub3.equals(sub2)) || !sub3.startsWith("SE-")){
                                    System.out.printf("%s%s%s \n",RED,"Invalid subject3",DEFAULT);
                                }else{
                                   
                                     //Enter marks 3
                                    System.out.print("Enter marks3 : ");
                                    double marks3 = scan.nextDouble();

                                    if(marks3 < 0 || marks3 > 100){
                                        System.out.printf("%s%s%s \n",RED,"Invalid marks1",DEFAULT);
                                    }else{
                                        

                                        String upperName = name.toUpperCase();

                                        //Get the total marks
                                        double totalMarks = marks1 + marks2 + marks3;
                                        //System.out.println(totalMarks);
                                        //Get the Average
                                        double averageMark = (totalMarks/3);
                                        //System.out.println(averageMark);
                                        String status;

                                        String creditp = "\033[32m Credit Pass \033[0m";
                                        String pass = "\033[34m Pass \033[0m";
                                        String fail = "\033[31m Fail \033[0m";

                                        if(averageMark >= 75){
                                            status = creditp;
                                        }else if(averageMark >=55 && averageMark < 75){
                                            status = pass;
                                        
                                        }else{
                                            status = fail;
                                        }
                                        //Get the status for each subject

                                        String s1;
                                        if(marks1 >= 75){
                                            s1 = creditp;
                                        }else if(marks1 >=55 && marks1 < 75){
                                            s1 = pass;
                                        
                                        }else{
                                            s1 = fail;
                                        }

                                        String s2;
                                        if(marks2 >= 75){
                                            s2 = creditp;
                                        }else if(marks2 >=55 && marks2 < 75){
                                            s2 = pass;
                                        
                                        }else{
                                            s2 = fail;
                                        }

                                        String s3;
                                        if(marks3 >= 75){
                                            s3 = creditp;
                                        }else if(marks3 >=55 && marks3 < 75){
                                            s3 = pass;
                                        
                                        }else{
                                            s3 = fail;
                                        }


                                        //!OUTPUT FOR STUDENT RESULTS

                                        final String BLUE = "\033[34m";
                                        final String BOLD = "\033[1m";

                                        String line = "-------------------------------------";
                                        System.out.println(line);
                                        System.out.printf("|  Name:%s%s%-28s%s| \n",BOLD,BLUE,upperName,DEFAULT);
                                        System.out.printf("|  Age : %s%s%s years old %15s \n",RED,age,DEFAULT,"|");
                                        System.out.printf("|  Status : %s %18s \n",status,"|");
                                        System.out.printf("|  Total : %.2f %11s %.2f %s \n",totalMarks,"AVG:",averageMark,"|");

                                        System.out.println(line);

                                        System.out.printf("| %-10s| %-10s| %-10s| \n", "Subject","Marks(%)","Status");
                                        System.out.println(line);

                                        System.out.printf("| SE-%03d    | %-10.2f| %-10s    | \n",Integer.valueOf(sub1.substring(3)),marks1,s1);
                                        System.out.printf("| SE-%03d    | %-10.2f| %-10s    | \n",Integer.valueOf(sub2.substring(3)),marks2,s2);
                                        System.out.printf("| SE-%03d    | %-10.2f| %-10s    | \n",Integer.valueOf(sub3.substring(3)),marks3,s3);
                                        System.out.println(line);


                                       




                                        









                                    }
                                }
                            }





                        }
                    }
                }
            }
            
        }
        
        


           
        



    }
}
