using System;

namespace samdasu_0903
{
    class samdasu_0903
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if (n < 100)
            {
                fn_rectangle();
            }

            void fn_rectangle()
            {
                for(int i = 1; i<=n*n; i++)
                {
                    Console.Write(i + " ");
                    if ((i%Convert.ToDouble(n)) == 0)
                    {
                        Console.WriteLine(" ");
                    }                   
                }
            }
        }
    }
}
