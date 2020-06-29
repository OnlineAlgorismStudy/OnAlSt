using System;

namespace algorithm_01
{
    class ms_0629
    {
        static void Main(string[] args)
        {
            var kor = 90;
            var mat = 80;
            var eng = 100;
            var sum = kor + mat + eng;
            Console.WriteLine($"kor {kor}\nmat {mat}\neng {eng}\nsum {sum}\navg {sum/3}");
        }
    }
}
