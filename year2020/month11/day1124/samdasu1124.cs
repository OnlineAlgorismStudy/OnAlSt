using System;

namespace _1124
{
    class samdasu1124
    {
        static void Main(string[] args)
        {
            string A = Console.ReadLine();
            string B = Console.ReadLine();
            int n = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine(A + B);

            A = A.Substring(0, n);
            B = B.Substring(n);
            

            Console.WriteLine(A + B);
        }
    }
}
