import java.util.*;

public class VirtualMachine {

    private HashMap<Integer, Object> memory =
            new HashMap<>();

    public void setValue(
            int address,
            Object value) {

        memory.put(address, value);
    }

    public Object getValue(
            int address) {

        return memory.get(address);
    }

    public void execute(
            Queue<Quadruple> quadruples) {

        List<Quadruple> quads =
                new ArrayList<>(quadruples);

        int ip = 0;

        while (ip < quads.size()) {

            Quadruple q =
                    quads.get(ip);

            switch (q.op) {

                case "+":

                    int leftAdd =
                            Integer.parseInt(q.left);

                    int rightAdd =
                            Integer.parseInt(q.right);

                    int resultAdd =
                            Integer.parseInt(q.result);

                    int sum =
                            ((Number) memory.get(leftAdd)).intValue()
                            +
                            ((Number) memory.get(rightAdd)).intValue();

                    memory.put(
                            resultAdd,
                            sum
                    );

                    break;

                case "-":

                    int leftSub =
                            Integer.parseInt(q.left);

                    int rightSub =
                            Integer.parseInt(q.right);

                    int resultSub =
                            Integer.parseInt(q.result);

                    int subtraction =
                            ((Number) memory.get(leftSub)).intValue()
                            -
                            ((Number) memory.get(rightSub)).intValue();

                    memory.put(
                            resultSub,
                            subtraction
                    );

                    break;

                case "*":

                    int leftMul =
                            Integer.parseInt(q.left);

                    int rightMul =
                            Integer.parseInt(q.right);

                    int resultMul =
                            Integer.parseInt(q.result);

                    int multiplication =
                            ((Number) memory.get(leftMul)).intValue()
                            *
                            ((Number) memory.get(rightMul)).intValue();

                    memory.put(
                            resultMul,
                            multiplication
                    );

                    break;

                case "/":

                    int leftDiv =
                            Integer.parseInt(q.left);

                    int rightDiv =
                            Integer.parseInt(q.right);

                    int resultDiv =
                            Integer.parseInt(q.result);

                    int division =
                            ((Number) memory.get(leftDiv)).intValue()
                            /
                            ((Number) memory.get(rightDiv)).intValue();

                    memory.put(
                            resultDiv,
                            division
                    );

                    break;

                case ">":

                    memory.put(
                            Integer.parseInt(q.result),

                            ((Number) memory.get(
                                    Integer.parseInt(q.left)
                            )).intValue()

                            >

                            ((Number) memory.get(
                                    Integer.parseInt(q.right)
                            )).intValue()
                    );

                    break;

                case "<":

                    memory.put(
                            Integer.parseInt(q.result),

                            ((Number) memory.get(
                                    Integer.parseInt(q.left)
                            )).intValue()

                            <

                            ((Number) memory.get(
                                    Integer.parseInt(q.right)
                            )).intValue()
                    );

                    break;

                case "==":

                    memory.put(
                            Integer.parseInt(q.result),

                            ((Number) memory.get(
                                    Integer.parseInt(q.left)
                            )).intValue()

                            ==

                            ((Number) memory.get(
                                    Integer.parseInt(q.right)
                            )).intValue()
                    );

                    break;

                case "!=":

                    memory.put(
                            Integer.parseInt(q.result),

                            ((Number) memory.get(
                                    Integer.parseInt(q.left)
                            )).intValue()

                            !=

                            ((Number) memory.get(
                                    Integer.parseInt(q.right)
                            )).intValue()
                    );

                    break;

                case "=":

                    int source =
                            Integer.parseInt(q.left);

                    int destination =
                            Integer.parseInt(q.result);

                    memory.put(
                            destination,
                            memory.get(source)
                    );

                    break;
            }

            ip++;
        }
    }

    public void printMemory() {

        System.out.println(
                "\n===== MEMORIA ====="
        );

        for (Integer key :
                memory.keySet()) {

            System.out.println(
                    key + " -> "
                    + memory.get(key)
            );
        }
    }
}