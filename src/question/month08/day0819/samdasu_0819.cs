using System;

namespace samdasu_0819
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] n = new int[26];
            char ch;

            while (true)
            {
                ch = Convert.ToChar(Console.ReadLine());

                if(!(ch>=65 && ch <= 90))
                {
                    break;
                }
                else {
                    n[ch - 65]++;
                }

                
            }

            for(int i = 0; i<n.Length; i++)
            {
                if(n[i] != 0)
                {
                    Console.WriteLine("{0} : {1}", Convert.ToChar('A' + i), n[i]);
                }
            }
        }
    }
}
