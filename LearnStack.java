import java.util.Stack;
import java.util.Iterator;
public class LearnStack {
    public static void main(String[] arg){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("All the elements in the stack are by using object: ");
        System.out.println(stack);

        System.out.println("All the elements in the stack are by using Iterator: ");
        Iterator<Integer> it = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        };

        it = stack.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("All the elements in the stack are by using for loop: ");
        for(int i=0; i<stack.size(); i++){
            System.out.println(stack.get(i));
        }

        System.out.println("All the elements in the stack after POP: ");
        stack.pop();
        //Iterator<Integer> it1 = stack.iterator();
        it = stack.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Peek element in the stack: ");
        System.out.println(stack.peek());

        stack.push(1000);
        stack.push(2000);
        stack.push(3000);

        System.out.println("All the elements in the stack after PUSH: ");
        it = stack.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Size of stack is: "+stack.size());

        System.out.println("Check 100 is present in stack or not:"+stack.search(100));
        System.out.println("Check 1000 is present in stack or not:"+stack.search(1000));

        stack.remove(2);
        System.out.println(stack);

    }
}
