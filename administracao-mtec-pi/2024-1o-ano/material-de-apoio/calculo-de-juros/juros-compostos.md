<h1 align="center">Juros Compostos</h1>
<h3 align="center">Prof. Eduardo Ono</h3>
<h5 align="center">Atualizado em: 22/10/2024</h5>

&nbsp;

## Fórmula dos Juros Compostos

A fórmula dos __*Juros Compostos*__ é também conhecida como "juros sobre juros", ou seja, o rendimento é aplicado sobre o montante acumulado.

$$
\boxed{\ M = C \cdot (1 + j)^t \ }
$$

onde $M$ é o montante, $C$ o capital, $j$ a taxa de juros e $t$ o tempo (duração da aplicação).

### Exemplo:

Para uma aplicação de R\$ 10.000,00 (capital) na Caderneta e Poupança a uma taxa de 0,52\% ao mês, o montante após 1 ano (12 meses) será:

_Solução_:

Dados do problema:

$C$ (R$) = 10.000,00<br>
$j$ (a.m.) = 0,6% = 0,6/100 = 0,006<br>
$t$ (meses) = 12<br>
$M_{12}$ = ?

$$
\begin{align*}
M_{12} &= 10000 \cdot (1 + 0{,}006)^{12} \\
&= 10000 \cdot 1{,}006^{12} \\
&= 10000 \cdot 1{,}074424 \\
&= \text{10744,24}
\end{align*}
$$

Portanto, o montante após 12 meses será de R\$ 10.744,24.

&nbsp;

## Dedução da Fórmula dos Juros Compostos

### Exemplo inicial numérico

Capital (R\$): $\ C = 10.000{,}00$<br>
Taxa de juros (a.m.): $\ j = 0{,}6\,\% = \cfrac{0{,}6}{100} = 0{,}006$<br>

| Mês | Cálculo do Montante | Cálculo do Montante (generalização) | Montante (R\$) |
| :-: | :-- | :-- | --: |
| 0<br>(início da aplicação) | $M_0 = 10000$ | $M_0 = C$ | $M_0 = 10.000{,}00$ |
| 1 | $M_1 = 10000 + 10000 \cdot 0{,}006 \\ M_1 = 10000 \cdot (1 + 0{,}006)$ | $M_1 = M_0 + M_0 \cdot j \\ M_1 = M_0 \, (1 + j) \\ M_1 = C \, (1 + j)$ | $M_1 = 10.060{,}00$ |
| 2 | $M_2 = 10060 + 10060 \cdot 0{,}006 \\ M_2 = 10060 \cdot (1 + 0{,}006)$ | $M_2 = M_1 + M_1 \cdot j \\ M_2 = M_1 \cdot (1 + j) \\ M_2 = C \, (1 + j) \cdot (1 + j) \\ M_2 = C \, (1 + j)^2$ | $M_2 = 10.120{,}36$ |
| 3 | $M_3 = 10120{,}36 + 10120{,}36 \cdot 0{,}006 \\ M_3 = 10120{,}36 \cdot (1 + 0{,}006)$ | $M_3 = M_2 + M_2 \cdot j \\ M_3 = M_2 \cdot (1 + j) \\ M_3 = C \, (1 + j)^2 \cdot (1 + j) \\ M_2 = C \, (1 + j)^3$ | $M_3 = 10.181{,}08$ |
| ... | ... | ... | ... |


&nbsp;
