using System;

namespace Samdasu_0711
{
    //삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력/
    class Samdasu_0709
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.Write("base = ");
                int width = Convert.ToInt32(Console.ReadLine());

                Console.Write("Height = ");
                int Height = Convert.ToInt32(Console.ReadLine());

                double triangle = (width * Height) / 2.0;

                Console.WriteLine("Triangle width = {0:F1}", triangle);

                Console.Write("Continue? ");
                string aws = Console.ReadLine();

                if (aws == "y")
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
            
        }
    }
}
