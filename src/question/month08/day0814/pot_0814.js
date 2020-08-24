<script>
        //0 입력 > 5의 배수 개수, 합계 평균
        var arr = new Array(100) //100 개입력
        var count = 0; //5의 배수 카운트
        var result = 0;
        for(i=0;i<arr.length;i++){
            arr[i] = parseInt(prompt());
            //0 입력 이면 break;
            if(arr[i]==0){
                break;
            }
            //5의 배수이면 플러스연산,카운트증가
            if(arr[i] % 5 == 0){
                result += arr[i];
                count++;
            }
        }
        document.write("Multiples of 5 :"+count+"<br>");
        document.write("sum :"+result+"<br>");
        document.write("avg :"+(result/count).toFixed(1));
    </script>
