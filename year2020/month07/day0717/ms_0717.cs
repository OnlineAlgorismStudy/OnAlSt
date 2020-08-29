using System;

namespace algorithm_15
{
    class ms_0717
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int j = 0;

            for(int i = n; i > 0; i--, j++) {
                Console.Write(new String(' ', j));
                Console.WriteLine(new String('*', 2*i-1));
            }
        }
    }
}
