<script>
    //입력한 수 count
    //count 홀수 입력한수 * 2
    //count 짝수 입력한수 / 2
    var arr = new Array(100);
    var count = 0;
    //입력,count 증가
    for(i=0;i<arr.length;i++){
        arr[i] = parseInt(prompt());
        count++;
        //0 입력 > break;
        if(arr[i] == 0){
            break;
        }
    }
    //입력 개수 출력
    document.write("입력 개수 : " + (count-1)+"<br>");
    
    //입력한 개수 만큼 반복
    for(i=0;i<count-1;i++){
        //입력한 값이 짝수라면
        if((arr[i]) % 2 ==0){
            document.write(arr[i] / 2 +"\t");
        }else{//홀수라면
            document.write(arr[i] * 2 +"\t");
        }
    }
</script>
