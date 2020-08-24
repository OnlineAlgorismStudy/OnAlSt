using System;

namespace algorithm_41
{
    class ms_0824
    {
        static void Main(string[] args)
        {
            String[] data = new String[5];
            String[] person;
            int successful = 0;

            for(int i = 0; i < data.Length; i++) 
            {
                person = Console.ReadLine().Split(' ');

                int avg = 0;
                foreach(var subject in person) 
                    avg += Convert.ToInt32(subject);

                if((avg/4) < 80) 
                {
                    data[i] = "pass";
                    successful++;
                } 
                else data[i] = "fail";
            }

            for(int i = 0; i < data.Length; i++)
                Console.WriteLine($"{data[i]}");
                
            Console.WriteLine($"Successful : {successful}");
        }
    }
}
