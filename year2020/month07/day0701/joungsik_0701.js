const [yard, inch] = [91.44, 2.54];
const [num1, num2] = [2.1, 10.5];

const result = (num1, num2) =>
  num1.toFixed(0).toString().length > num2.toFixed(0).toString().length
    ? Math.pow(10, num1.toFixed(0).toString().length - 1)
    : Math.pow(10, num2.toFixed(0).toString().length - 1);

console.log(
  `${num1 < result(num1, num2) ? " " + num1 : num1}yd = ${
    num1 * yard < result(num1 * yard, num2 * inch) ? " " + (num1 * yard).toFixed(1) : (num1 * yard).toFixed(1)
  }cm`
);
console.log(
  `${num2 < result(num1, num2) ? " " + num2 : num2}in = ${
    num2 * inch < result(num1 * yard, num2 * inch) ? " " + (num2 * inch).toFixed(1) : (num2 * inch).toFixed(1)
  }cm`
);
