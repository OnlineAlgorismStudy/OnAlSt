using System;

namespace algorithm_19
{
    class ms_0723
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            
            for (int i = -(n-1); i <= (n-1); i++) {
                for (int j = 0; j < (n-1) - Math.Abs(i); j++)
                    Console.Write(" ");
                //Console.Write(new String(' ', (n-1)-Math.Abs(i)));

                for (int j = 0; j < 2*Math.Abs(i)+1; j++)
                    Console.Write("*");
                //Console.Write(new String('*', 2*Math.Abs(i)+1));

                Console.WriteLine();
	    }
        }
    }
}
