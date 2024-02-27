package interview.student;

public class demo extends  Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child class");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {


            }
        }

    }
}
