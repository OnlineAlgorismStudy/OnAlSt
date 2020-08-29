    <script>
        /*홀수 = * 이용*/
        number = parseInt(prompt());
        for(i=0;i<number;i++){
            for(j=4;j>(i*2)-1;j--){
                document.write("&nbsp");
            }
            
            for(k=0;k<=(i*2);k++){
                document.write("*");
            }
            document.write("<br>");
        }
    </script>
