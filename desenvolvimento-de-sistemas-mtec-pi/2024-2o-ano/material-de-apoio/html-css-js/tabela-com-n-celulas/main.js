var ordemQuadrado = 0;

// Cria uma matriz de ordem "ordemQuadrado"

var celulas = [];

function criarQuadrado() {
  celulas = [];
  ordemQuadrado = document.getElementById('ordem-input').value;
  const quadrado = document.getElementById('quadrado');
  quadrado.innerHTML = ''; // Remove todos os elementos filhos
  quadrado.style.gridTemplateColumns = `repeat(${ordemQuadrado}, 50px)`;

  for (let row = 0; row < ordemQuadrado; row++) {
    let linha = [];
    for (var col = 0; col < ordemQuadrado; col++) {
      linha[col] = document.createElement('div');
      linha[col].classList.add('celulas');
      linha[col].innerText = `${row}, ${col}`;
    }
    celulas.push(linha);
  }

  for (let row = 0; row < ordemQuadrado; row++) {
    for (var col = 0; col < ordemQuadrado; col++) {
      quadrado.appendChild(celulas[row][col]);
    }
  }

}
