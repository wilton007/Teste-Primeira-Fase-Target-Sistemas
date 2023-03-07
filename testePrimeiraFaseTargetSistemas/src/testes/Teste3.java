package testes;

public class Teste3 {
    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};
        int proximoA = a[a.length - 1] + 2;
        a = new int[]{1, 3, 5, 7, proximoA};
        for (int i = 0; i < a.length; i++) {
            if (i == 4) {
                System.out.print(a[i] + "\n");
            } else {
                System.out.print(a[i] + ", ");
            }

        }
        System.out.println("Resposta letra 'A', próximo número da sequência é " + proximoA);
        System.out.println(" ");

        int[] b = {2, 4, 8, 16, 32, 64};
        int proximoB = b[b.length - 1] * 2;
        b = new int[]{2, 4, 8, 16, 32, 64, proximoB};
        for (int i = 0; i < b.length; i++) {
            if (i == 6) {
                System.out.print(b[i]+ "\n");
            } else {
                System.out.print(b[i] + ", ");
            }

        }
        System.out.println("Resposta leta 'B', próximo número da sequência é " + proximoB);
        System.out.println(" ");

        int[] c = {0, 1, 4, 9, 16, 25, 36};
        int proximoC = (int) Math.pow(c[c.length - 1] + 1, 2);
        c = new int[]{0, 1, 4, 9, 16, 25, 36, proximoC};
        for (int i = 0; i < c.length; i++) {
            if (i == 7) {
                System.out.print(c[i]+ "\n");
            } else {
                System.out.print(c[i] + ", ");
            }
        }
        System.out.println("Resposta letra 'C', próximo número da sequência é " + proximoC);
        System.out.println(" ");

        int[] d = {4, 16, 36, 64};
        int proximoD = (int) Math.pow(Math.sqrt(d[d.length - 1]) + 2, 2);
        d = new int[]{4, 16, 36, 64, proximoD};
        for (int i = 0; i < d.length; i++) {
            if (i == 4) {
                System.out.print(d[i]+ "\n");
            } else {
                System.out.print(d[i] + ", ");
            }
        }
        System.out.println("Resposta letra 'D', próximo número da sequência é " + proximoD);
        System.out.println(" ");

        int[] e = {1, 1, 2, 3, 5, 8};
        int proximoE = e[e.length - 1] + e[e.length - 2];
        e = new int[]{1, 1, 2, 3, 5, 8, proximoE};
        for (int i = 0; i < e.length; i++) {
            if (i == 6) {
                System.out.print(e[i]+ "\n");
            } else {
                System.out.print(e[i] + ", ");
            }
        }
        System.out.println("Resposta letra 'E', próximo número da sequência é " + proximoE);
        System.out.println(" ");

        int[] f = {2, 10, 12, 16, 17, 18, 19};
        int proximoF = f[f.length - 1] + 1;
        f = new int[]{2, 10, 12, 16, 17, 18, 19, proximoF};
        for (int i = 0; i < f.length; i++) {
            if (i == 7) {
                System.out.print(f[i]+ "\n");
            } else {
                System.out.print(f[i] + ", ");
            }
        }
        System.out.println("Resposta letra 'F', próximo número da sequência é " + proximoF);
    }

}
