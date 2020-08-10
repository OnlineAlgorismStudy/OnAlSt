using System;

namespace algorithm_31
{
    class ms_0810
    {
        static void Main(string[] args)
        {
            int[] data = new int[10];
            int hap = 0;
            double avg = 0.0;

            for(int i = 0; i < data.Length; i++) {
                data[i] = Convert.ToInt32(Console.ReadLine());
            }

            for(int i = 0; i < data.Length; i++) {
                if(i%2 != 0)
                    hap += data[i];
                else
                    avg += data[i];
            }

            avg /= data.Length / 2;
            Console.WriteLine($"sum : {hap}\navg : {avg:.0}");

        }
    }
}
