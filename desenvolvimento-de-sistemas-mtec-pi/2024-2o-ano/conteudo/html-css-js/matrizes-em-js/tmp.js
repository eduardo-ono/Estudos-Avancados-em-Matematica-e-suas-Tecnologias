var m = [ [1, 2, 3],
          [4, 5, 6],
          [7, 8, 9] ];

for (let i = 0; i < m.length; i++) {
    for (let j = 0; j < m[i].length; j++) {
        process.stdout.write(m[i][j] + " ");
    }
    console.log();
}
