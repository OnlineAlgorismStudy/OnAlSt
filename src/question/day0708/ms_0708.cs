using System;

namespace algorithm_08
{
    class ms_0708
    {
        public static readonly string[] state = { "Korea", "USA", "Japen", "China" };
        public static readonly string[] capital = { "Seoul", "Washington", "Tokyo", "Beijing" };

        static void Main(string[] args)
        {
            
            while(true) {
                for(var i = 0; i < 4; i++)
                    Console.WriteLine($"{i+1}. {state[i]}");

                Console.Write("number? ");
                int cnt = Convert.ToInt32(Console.ReadLine());

                if(1 <= cnt && cnt <= 4) 
                    Console.WriteLine($"\n{capital[cnt-1]}\n");
                else {
                    Console.WriteLine("\nnone\n");
                    break;
                }
            }
        }
    }
}
