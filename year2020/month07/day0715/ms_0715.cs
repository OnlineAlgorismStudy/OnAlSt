using System;

namespace algorithm_13
{
    class ms_0715
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for(int i = -n; i <= n; i++)
                if(i != 0)
                    Console.WriteLine(new String('*', Math.Abs(i)));
        }
    }
}
