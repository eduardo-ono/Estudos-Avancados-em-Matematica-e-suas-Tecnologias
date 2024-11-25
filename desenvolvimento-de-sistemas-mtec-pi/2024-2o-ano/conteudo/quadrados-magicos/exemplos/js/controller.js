/*
 * Arquivo      : controller.js
 * Criado por   : Eduardo Ono
 * Criado em    : 18/11/2024
 * Atualizado em: 21/11/2024
 * Referências  :
*/

function _criarQuadrado(quadrado_container, ordem = 0) {
  const N = (ordem == 0) ? document.getElementById('ordem-quadrado').value : ordem;
  // Remove todos os elementos filhos do quadrado_container
  quadrado_container.innerHTML = '';
  const quadrado_magico = criarQuadrado(N); // Função do arquivo 'criar-quadrado.js'
  quadrado_magico.style.gridTemplateColumns = `repeat(${N}, 50px)`;

  // Adiciona a classe 'celula' (css) em todas as celulas
  const cels = quadrado_magico.children;
  for (let cel of cels) {
    cel.classList.add('celula');
  }
  quadrado_magico.setAttribute('id', 'quadrado-magico');
  quadrado_container.appendChild(quadrado_magico);

  return quadrado_magico;
}

function _metodoDeSiao() {
  const quadrado_container = document.getElementById('quadrado-container');
  const N = document.getElementById('ordem-quadrado').value;
  // Validação da entrada: Encerra a função se a ordem do quadrado for par
  if (N % 2 == 0) {
    return;
  }
  _criarQuadrado(quadrado_container, N);
  const quadrado_magico = document.getElementById('quadrado-magico');
  if (quadrado_magico == null) {
    // return;
  }
  const matriz = metodoDeSiao(N);
  const cels = quadrado_magico.children;
  // Transforma a matriz em um array
  const arrayDaMatriz = [].concat(...matriz);
  // Atribui os valores da matriz de Ramanujan para o Quadrado Mágico
  for (const i in cels) {
    cels[i].innerHTML = arrayDaMatriz[i];
  }
}

function _ramanujan() {
  const quadrado_container = document.getElementById('quadrado-container');
  const quadrado_magico = _criarQuadrado(quadrado_container, 4);
  const matriz_ramanujan = ramanujan(22, 12, 1887); // 'ramanujan.js'
  const cels = quadrado_magico.children;
  // Transforma a matriz em um array
  const arrayDaMatriz = [].concat(...matriz_ramanujan);
  // Atribui os valores da matriz de Ramanujan para o Quadrado Mágico
  for (const i in cels) {
    cels[i].innerHTML = arrayDaMatriz[i];
  }
}

/* REFERÊNCIAS
 *
 * https://www.visualdicas.com.br/programacao/js/98-usando-a-propriedade-children-no-javascript
 */
