using System;

namespace algorithm_26
{
    class Program
    {
        static void Main(string[] args)
        {
            String[] input = Console.ReadLine().Split(' ');

            // 10 개 미만의 정보일 때 프로그램 
            if(input.Length < 10) {
                return;
            }
            // 10 개의 문자만 처리
            // 1, 4, 7 번째 문자 출력
            bool[] onOff = { true, false, false, true, false,
                             false, true, false, false, false };

            for(int i = 0; i < onOff.Length; i++) {
                if(onOff[i]) {
                    Console.Write(input[i] + ' ');
                }
            }

            //귀찮을 때
            //Console.WriteLine($"{input[0]} {input[3]} {input[6]}");
        }
    }
}
