using System;

namespace algorithm_42
{
    class ms_0825
    {
        static void Main(string[] args)
        {
            int[] students = new int[100];
            int[] nss = new int[10]; // number of students by score
            int i = 0;

            while(i < studnets.Length) 
            {
                int temp = Convert.ToInt32(Console.ReadLine());

                if(temp != 0) 
                    nss[(temp/10)-1]++;
                else break;
                
                i++;
            }

            for(i = nss.Length-1; i >= 0; i--) 
                if(nss[i] != 0)
                    Console.WriteLine($"{(i+1)*10} : {nss[i]} person");
        }
    }
}
