using System;

namespace algorithm_111
{
    class ms_1130
    {
        enum DAY {
            SUN,
            MON,
            TUE,
            WED,
            THU,
            FRI,
            SAT
        }

        // mode = 1     : 다음 달의 시작 일이 무슨 요일인지 알려주는 함수
        // mode = else  : 현재 달의 특정 날이 무슨 요일인지 알려주는 함수
        static DAY find(DAY curDay, int date, int mode)
        {
            DAY lastDay = DAY.SUN;
            int temp = (date + (int) curDay - 1) % 7;

            switch(temp)
            {
                case 0:
                    lastDay = DAY.SUN;
                    break;
                case 1:
                    lastDay = DAY.MON;
                    break;
                case 2:
                    lastDay = DAY.TUE;
                    break;
                case 3:
                    lastDay = DAY.WED;
                    break;
                case 4:
                    lastDay = DAY.THU;
                    break;
                case 5:
                    lastDay = DAY.FRI;
                    break;
                case 6:
                    lastDay = DAY.SAT;
                    break;
            }

            if(mode == 1) 
            {
                lastDay += 1;
                
                if((int) lastDay == 7)
                    lastDay = DAY.SUN;

                return lastDay;
            }
            else return lastDay;
        }

        static string solution(int a, int b)
        {
            // 2016년 1월 1일 시작 요일
            DAY day = DAY.FRI;

            for(int i = 1; i <= a; i++)
            {
                int maxDate = 31;

                switch(i)
                {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        maxDate = 31;
                        break;

                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        maxDate = 30;
                        break;

                    case 2:
                        maxDate = 29;
                        break;
                }
                
                if(i != a)
                {
                    day = find(day, maxDate, 1);
                    continue;
                }
                else day = find(day, b, 0);
            }

            return day.ToString();
        }

        static void Main(string[] args)
        {
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine(solution(a, b));
        }
    }
}
