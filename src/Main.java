class Padre {
    int x;
    public Padre() {
        System.out.println("Constructor Padre");
        x=1;
    }
}

class Hija extends Padre {
    public Hija() {
        System.out.println("hi");
    }
}

class Hijo extends Padre {
    public Hijo() {
        // super(); implicito
        System.out.println("Constructor Hijo");
        System.out.println(x);
    }
}

public class Main {
    public static void main(String[] args) {
        Hijo h = new Hijo();
        Hija a = new Hija();
    }
}