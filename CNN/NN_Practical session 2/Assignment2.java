import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Assignment2
 */
public class Assignment2 {

    public static void main(String[] args) {
        
        //exercise1();
        // exercise2();
        for (int i = 0; i < 50; i++) {
            exercise3();
            // exercise2();
        }
        
        

    }

    private static void exercise1() {
        double[] bias=     {1,1,1,1};

        double[] input1=   {1, 1, 0, 0};
        double[] input2 =  {1, 0, 1, 0};

        double[] target = {1, 0, 0, 0};

        double[][] inputs = {bias, input1, input2};
        double[] weights= {Math.random(),Math.random(),Math.random()}; //to change (-1;1)

        double sum_error = 0;
        double some_value = 0;
        double[] activation;
        double learningConstant = 0.05;
        double[] error;
        double[] deltaWeights = new double[weights.length];

        int counter = 0;

        do {
        
            sum_error = 0;
            activation = CalculateActivation(inputs, weights);
            error = VectorSubtraction(target, activation);
            sum_error += getSumError(error);
            
            for (int j = 0; j < inputs[0].length; j++) {
                for (int i = 0; i < deltaWeights.length; i++) {
                    deltaWeights[i] = learningConstant*error[j]*inputs[i][j]; //(!)
                }
                weights = VectorSum(weights, deltaWeights);
            }
            counter++;
            System.out.println(Arrays.toString(weights));
        } while(sum_error > some_value); //better: while sum_error(?) is still getting much smaller 

        double[] output = CalculateActivation(inputs, weights);
        System.out.println(Arrays.toString(output));
        System.out.println(getLinearFunc(weights));
        System.out.println("#changes of weighys:"+ counter);
    }

    private static void exercise2() {
        double[] bias=     {1,1,1,1};

        /* 
        
        P1 --> x = 0.9 , y = 2.79
        P2 --> x = 1 , y = 2.99
        P3 --> x = 1 , y = 3.1
        P4 --> x = 0.9 , y = 2.9
        
        */

        double[] input1=   {0.9,1.0,1.0,0.9};
        double[] input2 =  {2.8,2.9,3.1,2.9};

        double[] target = {0, 0, 1, 1};

        double[][] inputs = {bias, input1, input2};
        double[] weights= {Math.random(),Math.random(),Math.random()}; //to change (-1;1)

        double sum_error = 0;
        double some_value = 0;
        double[] activation;
        double learningConstant = 0.05;
        double[] error;
        double[] deltaWeights = new double[weights.length];

        int counter = 0;

        do {
            

            sum_error = 0;
            activation = CalculateActivation(inputs, weights);
            error = VectorSubtraction(target, activation);
            sum_error += getSumError(error);
            
            for (int j = 0; j < inputs[0].length; j++) {
                for (int i = 0; i < deltaWeights.length; i++) {
                    deltaWeights[i] = learningConstant*error[j]*inputs[i][j]; //(!)
                }
                weights = VectorSum(weights, deltaWeights);
            }
            counter++;
            // System.out.println(Arrays.toString(weights));
        } while(sum_error > some_value); //better: while sum_error(?) is still getting much smaller 

        double[] output = CalculateActivation(inputs, weights);
        // System.out.println(Arrays.toString(output));
        // System.out.println(getLinearFunc(weights));
        // System.out.println("#changes of weighys:"+ counter);
    }

    private static void exercise3() {

        //        x       y
        //Under
        double[] P1={0, 0.99};
        double[] P2={0.1, 1.19};
        double[] P3={0.2, 1.39};
        //Above:
        double[] P4={0, 1.11};
        double[] P5={0.1, 1.29};
        double[] P6={0.2, 1.41};

        //        x       y
        //Under
        double[] P7={0.6, 2.1};
        double[] P8={0.4, 1.51};
        double[] P9={0.3, 1.45};
        //Above:
        double[] P10={0.1, 1.4};
        double[] P11={0.25, 1.75};
        double[] P12={0.5, 2.2};


        double[] input1=   {0.90, 1.0, 1.0, 0.9,P1[0],P4[0],P2[0],P5[0],P3[0],P6[0],P7[0],P10[0],P8[0],P11[0],P9[0],P12[0]};
        double[] input2 =  {2.79,2.99,3.1,2.89,P1[1],P4[1],P2[1],P5[1],P3[1],P6[1],P7[1],P10[1],P8[1],P11[1],P9[1],P12[1]};

        double[] target =  {0, 0, 1, 1,0,1,0,1,0,1,0,1,0,1,0,1};

        double[] bias = new double[input1.length];
        for (int i = 0; i < bias.length; i++) {
            bias[i]=1;
        }

        double[][] inputs = {bias, input1, input2};
        double[] weights= {Math.random(),Math.random(),Math.random()}; //to change (-1;1)

        double sum_error = 0;
        double some_value = 0;
        double[] activation;
        double learningConstant = 0.05;
        double[] error;
        double[] deltaWeights = new double[weights.length];

        int counter = 0;

        do {
            
            sum_error = 0;
            activation = CalculateActivation(inputs, weights);
            error = VectorSubtraction(target, activation);
            sum_error += getSumError(error);
            
            for (int j = 0; j < inputs[0].length; j++) {
                for (int i = 0; i < deltaWeights.length; i++) {
                    deltaWeights[i] = learningConstant*error[j]*inputs[i][j]; //(!)
                }
                weights = VectorSum(weights, deltaWeights);
            }
            counter++;
        //    System.out.println(Arrays.toString(weights));
        } while(sum_error > some_value); //better: while sum_error(?) is still getting much smaller 

        double[] output = CalculateActivation(inputs, weights);
        //System.out.println(Arrays.toString(output));
        System.out.println(getLinearFunc(weights));
        // System.out.println(counter);
    }

    private static double getSumError(double[] error) {
        double out = 0;
        for (int i = 0; i < error.length; i++) {
            out += Math.abs(error[i]);
        }
        return out;
    }

    public static double[] CalculateActivation(double[][] inputs, double[] weights) {
        double[] out = new double[inputs[0].length];

        //Sum
        for (int i = 0; i < inputs[0].length; i++) {
            for (int j = 0; j < inputs.length; j++) {
                out[i] += inputs[j][i]*weights[j];
            }
        }

        return stepFunction(out);
    }

    public static double[] stepFunction(double[] x){
        for (int i =0 ; i<x.length; i++){
            if (x[i] < 0) {
                x[i] = 0;
            }
            else{
                x[i] = 1;
            }
        }
        return x;
    }

    public static double[] VectorSubtraction(double[] v1, double[] v2){
        double[] subtraction = new double[v1.length];
        for(int i = 0; i < v1.length; i++){
            subtraction[i] = v1[i] - v2[i]; 
        }
        return subtraction;
    }

    public static double[] VectorSum(double[] v1, double[] v2){
        double [] sum = new double[v1.length];
        for(int i = 0; i <v1.length; i++){
            sum[i] = v1[i] + v2[i]; 
        }
        return sum;
    }

    public static double getLinearFunc(double[] weights) {
        double b = 0;
        double a = 0;
        a = -1 * weights[1]/weights[2];
        b = -1 * weights[0]/weights[2];
        // System.out.println(a);
        return  b;
        // return "y="+a+"*X+"+b;
    }
}