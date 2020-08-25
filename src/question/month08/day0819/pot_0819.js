<script>
        //0값으로 초기화
        var arr1 = new Array(26).fill(0);

        //A ~ Z 카운트 배열 선언 26개
        //0 ~ 0 개 , 알파벳 입력시 (data -65) 증감
     
        while(true){
            data = prompt();
            cdata = data.charCodeAt(0);

            if(cdata < 65 || cdata > 90){
                break;
            }else{
                arr1[cdata-65]++;
            }
        }
        for(i=0;i<arr1.length;i++){
            //첫 입력값이 대문자가 아닐수도있으니
            if(arr1[i] != 0){
                document.writeln(String.fromCharCode(i+65)+":"+arr1[i])
            }
        }
    </script>
