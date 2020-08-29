    <script>
        //3행 5열 값 출력 , 2차원배열
        var arr1 =[[5,8,10,6,4],[11,20,1,13,2],[7,9,14,22,3]]
        for(i=0;i<3;i++){
            for(j=0;j<5;j++){
                if(arr1[i][j]<10){
                    document.write('&nbsp&nbsp&nbsp '+arr1[i][j]);
                }else{
                    document.write(' &nbsp&nbsp'+arr1[i][j]);
                }
            }
            document.write("<br>");
        }
    </script>
