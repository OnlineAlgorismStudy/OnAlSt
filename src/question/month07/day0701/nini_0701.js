function onSetInch(gubun, num) {
    const iYard = 91.44;
    const iInch = 2.54;
    let iResult = 0;

    if(gubun === "yd") {
        iResult = Number(num*iYard).toFixed(1);
    }
    if(gubun === "in") {
        iResult = Number(num*iInch).toFixed(1);
    }
    
    console.log(num+gubun+" = "+ iResult +"cm");
}

onSetInch("yd", 2.1);
onSetInch("in", 10.5);