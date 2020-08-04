using System;

namespace Samdasu_0720
{
    class samdasu_0720
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            char a = 'A';
            if (n>=3 && n <= 10)
            {                
                for (int i = 0; i<n; i++)
                {                    
                    for(int j = 0; j<(n-i); j++)
                    {
                        Console.Write(a);
                        a++;
                    }
                    Console.WriteLine(" ");
                }
            }
            else
            {
                Console.WriteLine("3보다 크고 10보다 작은 수를 입력해 주세요.");                
            }
            
        }
    }
}
