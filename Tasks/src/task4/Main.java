
package task4;
public class Main {

    public static void main(String[] args) {
       Context[] contexts = new Context[2];

       contexts[0].number = -2;
       contexts[1].number = 0;
       contexts[2].number = 2;

       SomeClass someClass = new SomeClass();

       someClass.getContext(contexts);

       for (int i = 0; i<2; i++){

           System.out.println(contexts[i].number);

       }

    }
}