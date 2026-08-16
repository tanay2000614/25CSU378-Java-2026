import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        

        // Calculator a = new Calculator();
        // a.Calc();

        // primenos a = new primenos();
        // System.out.println(a.isPrime(5));

        // GreatestCommonDivisor a = new GreatestCommonDivisor();
        // System.out.println(a.gcd(21,14));

        // NumberReversal a = new NumberReversal();
        // System.out.println(a.Rev(5724));
        
        // LoopPatterns a = new LoopPatterns();
        // a.pattern(5);

        // int a = FinalValueOperations.calc();
    

        // MarksProcessor.processMarks();
    

        Scanner scanner = new Scanner(System.in);
        int num = NumberAnalyzer.readNumber(scanner);
        boolean evenFlag = NumberAnalyzer.isEven(num);
        boolean posFlag = NumberAnalyzer.isPositive(num);
        int absVal = NumberAnalyzer.absoluteValue(num);
        int totalDigits = NumberAnalyzer.countDigits(absVal);
        int totalSum = NumberAnalyzer.sumDigits(absVal);
        NumberAnalyzer.printReport(num, evenFlag, posFlag, totalDigits, totalSum);
        scanner.close();
    }
}
