
// Preenche o Quadrado Mágico usando o método de Sião
function metodoDeSiao(quadrado_magico) {
  // const num_nodes = quadrado.childElementCount;
  const celulas = quadrado_magico.children;
  const num_celulas = celulas.length;
  if (num_celulas == 0) {
    return [];
  }
  const N = Math.round(Math.sqrt(num_celulas));
  if ((N * N) != num_celulas) {
    return;
  }
  // Verifica se a ordem do Quadrado Mágico é impar
  if (N % 2 == 0) {
    return;
  }
  // Armazena as células do Quadrado Mágico em uma matriz
  var matriz = [];
  var linha = [];
  for (let i = 0; i < celulas.length; i++) {
    celulas[i].innerHTML = '';
    linha.push(celulas[i]);
    if ((i + 1) % N == 0) {
      matriz.push(linha);
      linha = [];
    }
  }

  // Percorre a matriz aplicando o método de Sião
  var numero = 1;
  // Inicia na linha 0 e na coluna do meio
  var index_row = 0;
  var index_col = Math.trunc(N / 2);
  while (numero <= (N * N)) {
    matriz[index_row][index_col].innerHTML = `${numero}`;
    numero++;
    // Diminui 1 no índice da linha (sobe 1 na matriz)
    var prox_index_row = index_row - 1 < 0 ? N - 1 : index_row - 1;
    // Aumenta 1 no índice da coluna (move 1 para a direita na matriz)
    var prox_index_col = index_col + 1 == N ? 0 : index_col + 1;
    if (matriz[prox_index_row][prox_index_col].innerHTML != '') {
      // Aumenta 1 no índice da linha (desce 1 na matriz)
      prox_index_row = index_row + 1 == N ? 0 : index_row + 1;
      prox_index_col = index_col;
    }
    index_row = prox_index_row;
    index_col = prox_index_col;

    //
  };
}

/* REFERÊNCIAS
 *
 * https://www.visualdicas.com.br/programacao/js/98-usando-a-propriedade-children-no-javascript
 */
