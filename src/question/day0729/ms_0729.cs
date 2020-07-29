using System;

namespace algorithm_23
{
    class ms_0729
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for(int i = -(n-1); i <= (n-1); i++) 
            {
                if(i <= 0) 
                {
                    for(int j = 0; j < n - Math.Abs(i); j++) 
                    {
                        Console.Write('#');

                        if(j != n)
                            Console.Write(' ');
                    }
                }
                else 
                {
                    //Console.Write(new String(' ', 2*i));
                    for(int j = 0; j < i; j++) 
                    {
                        Console.Write("  ");
                    }

                    for(int j = 0; j < n - i; j++) 
                    {
                        Console.Write('#');

                        if(j != n - i)
                            Console.Write(' ');
                    }
                }

                Console.WriteLine();
            }
        }
    }
}
