function metodoDeSiao(N) {
  // Verifica a ordem do Quadrado Mágico (deve ser ímpar)
  if (N % 2 == 0) {
    return;
  }

  // Cria uma matriz quadrada de ordem N vazia
  var matriz = [];
  for (let i = 0; i < N; i++) {
    matriz[i] = [];
  }

  // Percorre a matriz aplicando o Método de Sião
  let numero = 1;
  // Inicia com 1 na linha 0 e na coluna do meio
  let i = 0;
  let j = Math.trunc(N / 2);
  while (numero <= (N * N)) {
    matriz[i][j] = numero;
    numero++;
    // Diminui 1 no índice da linha (sobe 1 na matriz)
    var prox_i = i - 1 < 0 ? N - 1 : i - 1;
    // Aumenta 1 no índice da coluna (move 1 para a direita na matriz)
    var prox_j = j + 1 == N ? 0 : j + 1;
    if (matriz[prox_i][prox_j] != undefined) {
      // Aumenta 1 no índice da linha (desce 1 na matriz)
      prox_i = i + 1 == N ? 0 : i + 1;
      prox_j = j;
    }
    i = prox_i;
    j = prox_j;
  };

  return matriz;
}

/* REFERÊNCIAS
 *
 * https://www.syncfusion.com/blogs/post/null-vs-undefined-in-javascript
 */
