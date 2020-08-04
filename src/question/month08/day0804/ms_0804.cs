using System;

namespace algorithm_27
{
    class ms_0804
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int[] data = new int[100];
            int cnt = 0;

            // 입력된 숫자의 수 확인
            while(Convert.ToInt32(input[cnt]) != 0) {
                cnt++;
            }

            // 0 제외 숫자의 수가 1~100 개여야 한다
            if(1 <= cnt && cnt <= 100) {
                int j = 0;

                for(int i = cnt; i > 0; i--) {
                    data[j] = Convert.ToInt32(input[i-1]);
                    j++;
                }
                
                j = 0;
                while(data[j] != 0) {
                    Console.Write(data[j]);

                    if(data[j+1] != 0)
                        Console.Write(' ');
                    
                    j++;
                }
            }
        }
    }
}
