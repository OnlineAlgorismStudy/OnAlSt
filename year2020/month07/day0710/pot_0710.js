    <script>
        function subject(number){
        result = 0;
        for(i=0;i<number;i++){
            data = prompt(" ");
            document.write(data+"<br>");
            result += parseInt(data);
    }
            score = result / number;
            score.toFixed(1);
            return score;
        }
    data = prompt("입력 : ");
    data1 = parseInt(data);   
    document.write(subject(data1));
    </script>
