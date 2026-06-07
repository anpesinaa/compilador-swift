import java.util.HashMap;

public class ConstantTable {

    HashMap<String, Integer> constants =
            new HashMap<>();

    public HashMap<String, Integer> getConstants() {

        return constants;
    }

    public int getAddress(String value) {

        if (constants.containsKey(value)) {

            return constants.get(value);
        }

        int address;

        if (value.contains(".")) {

            address =
                    VirtualMemory.constFloat++;

        } else {

            address =
                    VirtualMemory.constInt++;
        }

        constants.put(
                value,
                address
        );

        return address;
    }
}