    /*구구단! 4,3 입력*/
    var number = prompt().split(" ");
   /*4 2*/
    if(number[0] > number[1]){
        for(i=number[0];i>=number[1];i--){
            for(j=1;j<10;j++){
                document.write(i +"*"+ j +"=" +i*j+"<br>");
            }
            document.write("<br>");
        }
    }
    /*2 4*/
    else{
        for(i=number[0];i<=number[1];i++){
            for(j=1;j<10;j++){
                document.write(i +"*"+ j +"=" +i*j+"<br>");
            }
            document.write("<br>");
        }
    }
    
    
    </script>
