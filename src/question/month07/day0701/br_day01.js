const yd = 91.44;
const inch = 2.54;

transf(2.1, 'yd');
transf(10.5, 'in');

function transf(num, from) {
  let con;
  num = " " + num;
  if (from === 'yd') con = yd;
  else if (from === 'in') con = inch;
  console.log(num.slice(num.length-4) + from + " = " + (num*con).toFixed(1) + "cm");
}
