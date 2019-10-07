# Aritmética Binária em java
<br>
Aritmética Binária:<br>
<br>
Valores iniciais<br>
a = 101010 -> 42<br>
b = 11111111111111111111111111010110 -> -42<br>
<br>
Deslocamento para a esquerda preenchendo com zero<br>
a << 1 = 1010100 -> 84<br>
a << 2 = 10101000 -> 168<br>
<br>
Deslocamento para a esquerda preenchendo com zero<br>
b << 1 = 11111111111111111111111110101100 -> -84<br>
b << 2 = 11111111111111111111111101011000 -> -168<br>
<br>
Deslocamento para direita preenchedo com o bit do sinal<br>
<br>
a >> 1 = 10101 -> 21<br>
a >> 2 = 1010 -> 10<br>
<br>
Deslocamento para direita preenchedo com o bit do sinal<br>
b >> 1 = 11111111111111111111111111101011 -> -21<br>
b >> 2 = 11111111111111111111111111110101 -> -11<br>
<br>
Deslocamento para a direita preenchendo com zero<br>
a >>> 1 = 10101 -> 21<br>
a >>> 2 = 1010 -> 10<br>
<br>
Deslocamento para a direita preenchendo com zero<br>
b >>> 1 = 1111111111111111111111111101011 -> 2147483627<br>
b >>> 2 = 111111111111111111111111110101 -> 1073741813<br>
