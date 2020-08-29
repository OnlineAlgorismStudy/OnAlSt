<script>
        //배열길이 설정
       data = parseInt(prompt());
       var arr = new Array(data);
       //배열길이만큼 입력
       for(i=0;i<arr.length;i++){
           arr[i] = parseInt(prompt());        
       }
       //sort
       arr.sort(function(a,b){
        return b-a;
       });
       document.write(data+"<br>");
       //출력
       for(i=0;i<arr.length;i++){
           document.write(arr[i]+" ");
       }
    </script>
