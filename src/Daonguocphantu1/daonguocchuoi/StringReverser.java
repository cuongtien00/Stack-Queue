package Daonguocphantu1.daonguocchuoi;

public class StringReverser {
    public  String input;
    public  String output;

    public StringReverser(String in) {
        this.input = in;
    }
    public String doReverser(){
        Stack stack = new Stack(input.length());
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        output = "";
        for (int i = 0; i < stack.size; i++) {
            char ch = stack.pop();
            output += ch;
        }
        return output;
    }
}
