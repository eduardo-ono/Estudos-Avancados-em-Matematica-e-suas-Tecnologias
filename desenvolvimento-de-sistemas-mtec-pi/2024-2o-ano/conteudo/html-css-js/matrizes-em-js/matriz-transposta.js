/*
 * Arquivo       : matriz-transposta.js
 * Criado por    : Eduardo Ono
 * Atualizado em : 25/11/2024
 */

let m = [ [1, 2, 3],
          [4, 5, 6],
          [7, 8, 9] ];

console.log('Matriz m =');
console.table(m);


// Cria a matriz transposta mt
const N = 3;
let mt = [];
for (let i = 0; i < N; i++) {
  mt[i] = [];
}

// Polula mt
for (let i = 0; i < N; i++) {
  for (let j = 0; j < N; j++) {
    mt[i][j] = m[j][i];
  }
}
console.log('Matriz transposta =');
console.table(mt);
