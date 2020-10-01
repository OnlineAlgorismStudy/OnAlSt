using System;

namespace algorithm_69
{
    class ms_1001
    {
        static void recursionPrint(int n) 
        {
            if(n == 0)
                return;
            
            Console.WriteLine("recursive");
            recursionPrint(n-1);
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(0 < n && n <= 20) 
                recursionPrint(n);
        }
    }
}
