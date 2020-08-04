using System;

namespace Samdasu_0714
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = Convert.ToInt32(Console.ReadLine());
            if (i > 0)
            {
                for(int j = 0; j<i; j++)
                {         
                    for(int k = 0; k<=j; k++)
                    {
                        Console.Write("*");
                    }
                    Console.WriteLine("");

                }
                            
            }
            else
            {
                Console.WriteLine("자연수만 입력해 주세요.");
            }
                
        }
    }
}
