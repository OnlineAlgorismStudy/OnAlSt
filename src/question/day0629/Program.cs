using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ImPaper_0629
{
    class Program
    {
        
        static void Main(string[] args)
        {
            int kor = 90;
            int mat = 80;
            int eng = 100;
            int sum = kor + mat + eng;
            Console.WriteLine("kor " + kor);
            Console.WriteLine("mat " + mat);
            Console.WriteLine("eng " + eng);
            Console.WriteLine("sum " + (kor + mat + eng));
            Console.WriteLine("avg " + (sum / 3));

        }
    }
}
