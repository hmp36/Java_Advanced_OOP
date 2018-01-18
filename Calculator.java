public class Calculator implements java.io.Serializable {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    public Calculator() {}

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne; 
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }
    
    public void setOperation (String op) {
        operation = op;
    }

    public void performOperation () {
        if (operation.equals("+")) {
            result = operandOne + operandTwo;
        }
        else if (operation.equals("-")) {
            result = operandOne + operandTwo;
        }
        else {
            System.out.println("Error: Invalid operator");
        }
    }
    
    public double getResults() {
        System.out.println(result);
        return result;
    }
    
    public static void main (String []args) {
        Calculator c = new Calculator();
        c.setOperandOne(10.5);
        c.setOperation ("+");
        c.setOperandTwo(5.2);
        c.performOperation();
        c.getResults();

    }
}



