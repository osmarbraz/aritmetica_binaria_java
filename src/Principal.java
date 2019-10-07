
public class Principal {

    public static void main(String[] args) {
        
        System.out.println("Aritmética Binária:\n");

        int a = 42; // 101010 em binário
        int b = -42;  // 110101 em binário

        System.out.println("Valores iniciais");
        System.out.println("a = " + Integer.toBinaryString(a) + " -> " + a);
        System.out.println("b = " + Integer.toBinaryString(b) + " -> " + b);

        System.out.println("");
        System.out.println("Deslocamento para a esquerda preenchendo com zero");
        int lefta1 = a << 1; 
        int lefta2 = a << 2;                
        System.out.println("a << 1 = " + Integer.toBinaryString(lefta1) + " -> " + lefta1);
        System.out.println("a << 2 = " + Integer.toBinaryString(lefta2) + " -> " + lefta2);        
        
        System.out.println("");
        System.out.println("Deslocamento para a esquerda preenchendo com zero");
        int leftb1 = b << 1; 
        int leftb2 = b << 2;                
        System.out.println("b << 1 = " + Integer.toBinaryString(leftb1) + " -> " + leftb1);
        System.out.println("b << 2 = " + Integer.toBinaryString(leftb2) + " -> " + leftb2);

        System.out.println("");
        System.out.println("Deslocamento para direita preenchedo com o bit do sinal");
        int righta1 = a >> 1; 
        int righta2 = a >> 2;        
        System.out.println("");
        System.out.println("a >> 1 = " + Integer.toBinaryString(righta1) + " -> " + righta1);
        System.out.println("a >> 2 = " + Integer.toBinaryString(righta2) + " -> " + righta2);        
        
        System.out.println("");
        System.out.println("Deslocamento para direita preenchedo com o bit do sinal");
        int rightb1 = b >> 1; 
        int rightb2 = b >> 2;
        System.out.println("b >> 1 = " + Integer.toBinaryString(rightb1) + " -> " + rightb1);
        System.out.println("b >> 2 = " + Integer.toBinaryString(rightb2) + " -> " + rightb2);

        System.out.println("");
        System.out.println("Deslocamento para a direita preenchendo com zero");
        int rrighta1 = a >>> 1; 
        int rrighta2 = a >>> 2;                
        System.out.println("a >>> 1 = " + Integer.toBinaryString(rrighta1) + " -> " + rrighta1);
        System.out.println("a >>> 2 = " + Integer.toBinaryString(rrighta2) + " -> " + rrighta2);        
        
        System.out.println("");
        System.out.println("Deslocamento para a direita preenchendo com zero");
        int rrightb1 = b >>> 1; 
        int rrightb2 = b >>> 2;        
        System.out.println("b >>> 1 = " + Integer.toBinaryString(rrightb1) + " -> " + rrightb1);
        System.out.println("b >>> 2 = " + Integer.toBinaryString(rrightb2) + " -> " + rrightb2);
    }
}

