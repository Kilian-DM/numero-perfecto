package numeroperfecto;

public class perfecto {

    int num, suma, i;

    public perfecto(int num) {
        this.num = num;
    }

    public int calcular() {
        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                suma = suma + i;
            }
        }
        int sumanumero = suma;
        return sumanumero;
}
}
