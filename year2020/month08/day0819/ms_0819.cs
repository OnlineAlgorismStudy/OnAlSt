using System;

namespace algorithm_38
{
    class ms_0819
    {
        static void Main(string[] args)
        {
            int[] charCount = new int[26];
            char cnd;

            while(true) {
                cnd = Convert.ToChar(Console.ReadLine());

                if(!('A' <= cnd && cnd <= 'Z'))
                    break;

                charCount[cnd - 'A']++;
            }

            for(int i = 0; i < charCount.Length; i++)
                if(charCount[i] != 0)
                    Console.WriteLine($"{Convert.ToChar('A' + i)} : {charCount[i]}");
        }
    }
}
