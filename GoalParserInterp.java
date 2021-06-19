public class GoalParserInterp {
    public static void main(String[] args) {
        String s = "G()()()(al)";

        System.out.println(interpret(s));
    }

    private static String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }

    // public static String interpret(String command) {
    //     int n = command.length();
    //     String parsedCommand = "";
    //     for (int i = 0; i < n; i++) {
            
    //         if (command.charAt(i) == 'G') {
    //             parsedCommand += "G";
    //         }else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
    //             i++;
    //             parsedCommand += "o";
    //         }else {
    //             parsedCommand += "al";
    //             i=i+3;
    //         }
    //     }


    //     return parsedCommand;
    // }

    
}
