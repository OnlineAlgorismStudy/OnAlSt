const src = { yard: 2.1, inch: 10.5 };
const factor = { yard: 91.44, inch: 2.54 };

const centimeter = (src, factor) => {
  console.log(`${src.yard}yd = ${(src.yard * factor.yard).toFixed(1)}cm`);
  console.log(`${src.inch}in = ${(src.inch * factor.inch).toFixed(1)}cm`);
};

centimeter(src, factor);
