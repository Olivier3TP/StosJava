//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stos stos = new Stos(10);

        stos.Push(10);
        stos.Push(11);
        stos.Push(12);
        stos.Push(13);

        stos.Top();
        stos.Pop();
        stos.isEmpty();
    }

}