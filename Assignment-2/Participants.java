class Participants
{
    public static void main(String s[])
    {
        Student students[] = new Student[45];
    
        students[0] = new Student();
        students[0].name = "Nalluri Siva Nagendra Babu";
        students[0].rollnum = "CS16D001";
        students[0].likegit = true;
    
        //Fill in your details in the same format as given above

        
        
        
        
        
        
        
        
        
        // DON'T CHANGE THE BELOW CODE -------------------------------------------
        int i=0;
    
        for(; students[i]!= null ; i++)
        {
                if (students[i].likegit)
                    System.out.println( students[i].name  + " likes git ");
                else
                    System.out.println( students[i].name  + " does not like git :( ");
        }
        
        System.out.println( "Number of student records updated so far: "+ i + " out of 44");
        
    }

}

class Student
{
    String name;
    String rollnum;
    boolean likegit;
}
