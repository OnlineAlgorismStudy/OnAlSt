using System;

namespace algorithm_43
{
    class ms_0826
    {
        static void Main(string[] args)
        {
            int[] score = new int[4] { 0, 0, 0, 0 };

            for(int i = 0; i < 4; i++) {
                Console.Write($"{i + 1}class? ");

                string[] data = Console.ReadLine().Split(' ');

                foreach(var value in data) {
                    score[i] += Convert.ToInt32(value);
                }
            }

            for(int i = 0; i < score.Length; i++) {
                Console.WriteLine($"{i + 1}class : {score[i]}");
            }
        }
    }
}
