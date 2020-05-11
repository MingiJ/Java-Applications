package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        //double[] leftVal = {100.0d, 80.0d, 60.0d, 40.0d};
        //double[] rightVal = {50.0d, 40.0d, 30.0d, 20.0d};
        //String[] opcodes = {"d", "a", "m", "s"};
        //double[] result = new double[opcodes.length];

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation("d, 100.0d, 50.0d,");
        equations[1] = new MathEquation("a", 60.0d, 30.0d);
        equations[2] = new MathEquation("m", 30.0d, 15.0d);
        equations[3] = new MathEquation("s", 2.0d, 1.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());

        }

        System.out.println();
        System.out.print("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(90.0d, 45.0d),
                new Multiplier(0.0d, 0.0d),
                new Adder(10.0d, 10.0d),
                new Subtracter(18.0d, 9.0d),

        };

        for(CalculateBase calculator : calculators) {
            calculator.calculate();
            System.out.print("result=");
            System.out.println(calculator.getResult());
        }






    }

}

