const arrays = [
  [5, 8, 10, 6, 4],
  [11, 20, 1, 13, 2],
  [7, 9, 14, 22, 3],
];

arrays.map((array) => {
  console.log(
    `${array.map((num) => (num < 10 ? ` ${num}` : num)).join("   ")}`
  );
});
