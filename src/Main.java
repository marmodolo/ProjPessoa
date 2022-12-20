public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Jorge", 16, 'm');
        System.out.println(pessoa1);
        pessoa1.fazerAniv();
        System.out.println(pessoa1);

        Aluno aluno1 = new Aluno("Lucia", 15, 'f', 12345, "Desenvolvimento de Sistemas");
        System.out.println(aluno1);

        System.out.println("Média = " + calculaMedia(10, 20));
    }

    public static double calculaMedia(double num1, double num2){
        return (num1 + num2)/2;
    }
}

