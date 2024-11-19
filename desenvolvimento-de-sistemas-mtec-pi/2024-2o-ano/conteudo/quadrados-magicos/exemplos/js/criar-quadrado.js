
// Cria um Quadrado Mágico (div) de ordem N
function criarQuadrado(N) {
  let quadrado = document.createElement('div');
  let celulas = [];
  for (let row = 0; row < N; row++) {
    let linha = [];
    for (var col = 0; col < N; col++) {
      linha[col] = document.createElement('div');
      // linha[col].classList.add('celulas');
      linha[col].innerText = `[${row}][${col}]`;
      quadrado.appendChild(linha[col]);
    }
    celulas.push(linha);
  }

  // for (let row = 0; row < N; row++) {
  //   for (var col = 0; col < N; col++) {
  //     quadrado.appendChild(celulas[row][col]);
  //   }
  // }

  return quadrado;
}

function alterarValores() {
  for (let row = 0; row < celulas.length; row++) {
    linha = [];
    for (let col = 0; col < celulas.length; col++) {
      linha[col] = celulas[row][col];
      linha[col].innerText = 100;
    }
  }
}
