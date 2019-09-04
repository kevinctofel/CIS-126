public class GateTest {

    public static void main(String[] args){

        LogicGate gate = new LogicGate(LogicGate.AND);
        gate.setInput1(true);
        gate.setInput2(true);
        System.out.println(gate.getOutput());
    }
}
