[...Array(5).keys()].splice(2, 5).map((x) => {
  let row = [];
  [...Array(6).keys()].splice(1, 6).map((y) => {
    row.push(
      `${x} * ${y} = ${(x * y).toString().length == 1 ? " " + x * y : x * y}`
    );
  });
  console.log(row.join("  "));
});
