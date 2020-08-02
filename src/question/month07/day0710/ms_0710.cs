using System;

namespace algorithm_10
{
    class ms_0710
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());

            if(n <= 10) {
                int sum = 0;
                string info = Console.ReadLine();
                string[] subjects = info.Split(' ');

                foreach (var subject in subjects) {
                    sum += Convert.ToInt32(subject);
                }

                double avg = sum / (double) n;
                Console.WriteLine($"avg : {avg:.0}");
                Console.WriteLine((avg >= 80)? "pass" : "fail");
            }
        }
    }
}
